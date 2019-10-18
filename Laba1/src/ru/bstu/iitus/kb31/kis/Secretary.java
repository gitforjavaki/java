package ru.bstu.iitus.kb31.kis;
import java.util.Scanner;

public class Secretary extends Employee{
    private String where;

    public void init(Scanner scanner) {
        System.out.println("Введите вес:");
        setWeight(scanner.nextInt());
        System.out.println("Введите возраст:");
        setAge(scanner.nextInt());
        System.out.println("Введите зарплату:");
        setSalary(scanner.nextInt());
        System.out.println("Место работы:");
        setWhere(scanner.next());
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String _where) {
        where = _where;
    }

    @Override
    public String toString() {
        return "Тип: Секретарь\n" + super.toString() + "Место работы:" + getWhere();
    }
}
