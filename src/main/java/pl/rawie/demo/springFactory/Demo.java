package pl.rawie.demo.springFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanFactory factory = (BeanFactory) context;
        Calculator calculator = factory.getBean(Calculator.class);
        calculator.add(5, 3);
    }
}
