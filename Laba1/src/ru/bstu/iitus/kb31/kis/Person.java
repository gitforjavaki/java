package ru.bstu.iitus.kb31.kis;
import java.util.Scanner;

public abstract class Person {
    private int weight;
    private int age;

    public abstract void init(Scanner scanner);

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int _weight) {
        weight = _weight;
    }

    public void setAge(int _age) {
        age = _age;
    }

    public String toString() {
        return "Вес: " + getWeight() + "\nВозраст: " + getAge();
    }
}