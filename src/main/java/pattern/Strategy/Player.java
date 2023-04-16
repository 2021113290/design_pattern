package pattern.Strategy;

/**
 * Created with IntelliJ IDEA.
 * Description:表示进行猜拳游戏的选手的类
 * User: xinyu
 * Date: 2023-04-16
 * Time: 10:55
 */
public class Player {
    //选手姓名
    private String name;
    //选手所选策略
    private Strategy strategy;

    //选手猜拳结果
    private int wincount;
    private int losecount;
    private int gamecount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    //获取下一局手势，实际上决定下一局手势的是各个策略，nextHand方法仅仅是获取
    public Hand nextHand() {
        return strategy.nextHand();
    }

    //胜
    public void win() {
        strategy.study(true);
        wincount++;
        gamecount++;
    }

    //负
    public void lose() {
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    //平
    public void even() {
        gamecount++;
    }

    @Override
    public String toString() {
        return "[" + name + ":" + gamecount + "games," + wincount + "win," + losecount + "lose" + "]";
    }
}