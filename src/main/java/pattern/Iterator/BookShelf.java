package pattern.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:表示书架的类；由于需要该类作为集合处理，所以实现了Aggregate接口；
 * User: xinyu
 * Date: 2023-04-15
 * Time: 15:51
 */
public class BookShelf implements Aggregate{
    private Book[] books;
    private int last=0;

    /**
     * 构造器
     * @param maxsize 书架上可以放的最多书的数目
     */
    public BookShelf(int maxsize){
        this.books=new Book[maxsize];
    }

    /**
     *
     * @param index 要获得的书的下标
     * @return index位置的书
     */
    public Book getBookAt(int index){
        return books[index];
    }

    /**
     * 向书架里面增加一本书
     * @param book 要追加的书
     */
    public void appendBook(Book book){
        this.books[last]=book;
        last++;
    }

    /**
     *
     * @return 书架上书的数目
     */
    public int getLength(){
        return last;
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
