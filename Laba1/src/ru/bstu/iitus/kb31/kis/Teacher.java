package ru.bstu.iitus.kb31.kis;
import java.util.Scanner;

public class Teacher extends Employee {
    private String group;

    public void init(Scanner scanner) {
        System.out.println("Введите вес:");
        setWeight(scanner.nextInt());
        System.out.println("Введите возраст:");
        setAge(scanner.nextInt());
        System.out.println("Введите зарплату:");
        setSalary(scanner.nextInt());
        System.out.println("Введите группу:");
        setGroup(scanner.next());
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String _group) {
        group = _group;
    }

    @Override
    public String toString() {
        return "Тип: Преподаватель\n" + super.toString() + "Группа:" + getGroup();
    }
}
