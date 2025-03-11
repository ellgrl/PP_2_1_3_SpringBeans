package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {

    @Override
    public String toString() {
        return "I'm a Cat";
    }

    @Override
    public void say() {
        System.out.println("Meow! Meow!");
    }
}
