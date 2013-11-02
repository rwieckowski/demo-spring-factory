package pl.rawie.demo.springFactory;

import org.springframework.stereotype.Component;

@Component
public class ServiceImpl implements Service {
    @Override
    public int add(int a, int b) {
        System.out.println(String.format("service: %d + %d = %d", a, b, a + b));
        return a + b;
    }
}
