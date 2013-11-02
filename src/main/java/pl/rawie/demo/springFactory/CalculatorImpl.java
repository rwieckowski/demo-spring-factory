package pl.rawie.demo.springFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {
    @Autowired
    private Service service;

    @Override
    public int add(int a, int b) {
        System.out.println(String.format("client: %d + %d", a, b));
        return service.add(a, b);
    }
}
