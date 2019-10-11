package Hello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CallMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Hello hello = (Hello) classPathXmlApplicationContext.getBean("hello");

        hello.getMessage();

    }
}
