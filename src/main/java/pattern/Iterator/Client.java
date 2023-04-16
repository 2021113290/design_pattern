package pattern.Iterator;

import java.io.BufferedReader;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2023-04-15
 * Time: 16:16
 */
public class Client {
    public static void main(String[] args) {
        BookShelf bookShelf=new BookShelf(4);//初始化一个书架，最多装四本书
        bookShelf.appendBook(new Book("aaaaa"));
        bookShelf.appendBook(new Book("bbbbb"));
        bookShelf.appendBook(new Book("ccccc"));
        bookShelf.appendBook(new Book("ddddd"));
        Iterator it=bookShelf.iterator();
        while (it.hasNext()){
            Book book= (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
