package dev.emrx.di.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static java.lang.Math.*;

@Component
public class Circle implements Figure {

    @Value("${circle.radius:0}")
    private double radius;

    @Override
    public double calculateArea() {
        return PI * pow(radius, 2);
    }
}
