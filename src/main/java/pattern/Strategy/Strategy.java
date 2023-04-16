package pattern.Strategy;

/**
 * Created with IntelliJ IDEA.
 * Description:表示猜拳游戏中策略的类
 * User: xinyu
 * Date: 2023-04-16
 * Time: 10:52
 */
public interface Strategy {
    /**
     * 获取下一局要出的手势
     */
    public abstract Hand nextHand();

    /**
     * 学习上一局的手势是否获胜了，为下一次出什么手势提供依据
     * @param win 上一局是否获胜
     */
    public abstract void study(boolean win);
}