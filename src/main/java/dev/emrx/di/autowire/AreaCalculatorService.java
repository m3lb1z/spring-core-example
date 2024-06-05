package dev.emrx.di.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaCalculatorService {

    @Autowired
    private List<Figure> figures;

    public double calcAreas() {
        double area = 0.0;
        area = figures.stream().mapToDouble(Figure::calculateArea).sum();

        return area;
    }

}
