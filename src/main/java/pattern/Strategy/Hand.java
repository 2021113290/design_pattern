package pattern.Strategy;

/**
 * Created with IntelliJ IDEA.
 * Description:表示猜拳游戏中“手势”的类
 * User: xinyu
 * Date: 2023-04-16
 * Time: 10:51
 */
public class Hand {

    //石头的值为0
    public static final int HANDVALUE_SHITOU = 0;
    //剪刀的值为1
    public static final int HANDVALUE_JIANDAO = 1;
    //布的值为2
    public static final int HANDVALUE_BU = 2;

    //三种手势的实例
    public static final Hand[] hand = {
            new Hand(HANDVALUE_SHITOU),
            new Hand(HANDVALUE_JIANDAO),
            new Hand(HANDVALUE_BU)
    };

    //手势对应的字符串
    private static final String []name = {
            "石头", "剪刀", "布"
    };

    //猜拳中出的手势的值
    private int handValue;

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    //根据手势的值获取对应的实例
    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    //如果this胜了h返回true
    public boolean isStrongerThan(Hand h) {
        return fight(h)==1;
    }

    //如果this输了h返回true
    public boolean isWeakerThan(Hand h) {
        return fight(h)==-1;
    }

    //实际用来判断胜负的方法：平0分，胜1分，输-1分
    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handValue+1)%3 == h.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return name[handValue];
    }
}