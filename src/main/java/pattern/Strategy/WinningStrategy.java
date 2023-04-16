package pattern.Strategy;

/**
 * Created with IntelliJ IDEA.
 * Description:表示“如果这局猜拳获胜，那么下一局也出一样的手势”这一策略的类
 * User: xinyu
 * Date: 2023-04-16
 * Time: 10:52
 */


import java.util.Random;

/**
 * 该类的猜拳策略有些笨。如果上一局的手势获胜了，则下一局的手势就与上局相同；如果上一局的手势输了，则下一局就随机出手势。
 */
/**
 * 该类的猜拳策略有些笨。如果上一局的手势获胜了，则下一局的手势就与上局相同；如果上一局的手势输了，则下一局就随机出手势。
 */
public class WinningStrategy implements Strategy{

    private Random random;
    //保存了上一局猜拳的输赢结果
    private boolean won = false;
    //上一局出的手势
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}