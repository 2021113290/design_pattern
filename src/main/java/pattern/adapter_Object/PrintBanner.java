package pattern.adapter_Object;

import pattern.Iterator.Book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2023-04-16
 * Time: 12:21
 */
public class PrintBanner extends Print{
    private Banner banner;

    public PrintBanner(String r) {
        this.banner = new Banner(r);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
