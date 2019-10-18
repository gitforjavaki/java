package ru.bstu.iitus.kb31.kis;
import java.util.Scanner;

public class Retiree extends Person {
    private int pension;

    public void init(Scanner scanner) {
        System.out.println("Введите вес:");
        setWeight(scanner.nextInt());
        System.out.println("Введите возраст:");
        setAge(scanner.nextInt());
        System.out.println("Введите размер пенсии:");
        setPension(scanner.nextInt());
    }

    public int getPension() {
        return pension;
    }

    public void setPension(int _pension) {
        pension = _pension;
    }

    @Override
    public String toString() {
        return "Тип: Пенсионер\n" + super.toString() + "\nРазмер пенсии: " + getPension();
    }
}
