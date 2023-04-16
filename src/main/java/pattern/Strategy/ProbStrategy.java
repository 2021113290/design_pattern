package pattern.Strategy;


import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:表示“根据上一局的手势从概率上计算出下一局的手势”的类
 * User: xinyu
 * Date: 2023-04-16
 * Time: 10:54
 */
public class ProbStrategy implements Strategy{

    private Random random;
    private int prevHandValue = 0;
    private int currentHandValue = 0;

    /**
     * history[上一局出的手势][这一局所出的手势]
     * 这个表达式的值越大，表示过去的胜率越高。下面稍微详细讲解下：
     * 假设我们上一局出的是石头。
     * history[0][0]两局分别出石头、石头时胜了的次数
     * history[0][1]两局分别出石头、剪刀时胜了的次数
     * history[0][2]两局分别出石头、布时胜了的次数
     */
    private int[][] history = {
            {1, 1, 1, },
            {1, 1, 1, },
            {1, 1, 1, },
    };

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    /**
     * 那么，我们就可以根据 history[0][0]、history[0][1]、history[0][2]这3个表达式的值从概率上计算出下一局出什么。
     * 简而言之，就是先计算3个表达式的值的和 (getSum方法)，然后再从0与这个和之间取一个随机数，并据此决定下一局应该出什么( nextHand方法)。
     * 例如，如果
     * history[0][0]是3
     * history[0][1]是5
     * history[0][2]是7
     * 那么，下一局出什么就会以石头、剪刀和布的比率为3:5:7来决定。然后在0至15（不含15，15是3+5+7的和)之间取一个随机数。
     */
    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));
        int handvalue = 0;
        if (bet < history[currentHandValue][0]) {
            handvalue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handvalue = 1;
        } else {
            handvalue = 2;
        }
        prevHandValue = currentHandValue;
        currentHandValue = handvalue;
        return Hand.getHand(handvalue);
    }

    /**
     * study方法会根据nextHand方法返回的手势的胜负结果来更新history字段中的值。
     * @param win 上一局是否获胜
     */
    @Override
    public void study(boolean win) {
        if (win) {
            history[prevHandValue][currentHandValue]++;
        } else {
            history[prevHandValue][(currentHandValue+1)%3]++;
            history[prevHandValue][(currentHandValue+2)%3]++;
        }
    }

    private int getSum(int hv) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[hv][i];
        }
        return sum;
    }
}