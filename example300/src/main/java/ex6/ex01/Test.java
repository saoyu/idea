package ex6.ex01;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/13
 */
public class Test {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuther("1");
        book.setPrice(11.1);
        book.setTitle("12");
        System.out.println(book.toString());
    }
}
