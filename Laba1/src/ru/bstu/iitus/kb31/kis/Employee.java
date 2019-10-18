package ru.bstu.iitus.kb31.kis;
import java.util.Scanner;

public class Employee extends Person
{
    private int salary;

    public void init(Scanner scanner) {
        System.out.println("Введите вес:");
        setWeight(scanner.nextInt());
        System.out.println("Введите возраст:");
        setAge(scanner.nextInt());
        System.out.println("Введите зарплату:");
        setSalary(scanner.nextInt());
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int _salary) {
        salary = _salary;
    }

    @Override
    public String toString() {
        return "Тип: Сотрудник\n" + super.toString() + "\nЗарплата: " + getSalary();
    }
}
