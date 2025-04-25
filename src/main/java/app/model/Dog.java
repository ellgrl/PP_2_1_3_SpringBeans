package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {

    @Override
    public void say() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public String toString() {
        return "I'm a Dog";
    }
}
