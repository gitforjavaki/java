package ru.bstu.iitus.kb31.kis;

import java.util.Scanner;

public class Student extends Person {
    private int recordNumber;

    public void init(Scanner scanner) {
        setWeight(scanner.nextInt());
        System.out.println("Введите вес:");
        setWeight(scanner.nextInt());
        System.out.println("Введите возраст:");
        setAge(scanner.nextInt());
        System.out.println("Введите номер зачетки:");
        setRecordNumber(scanner.nextInt());
    }

    public int getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(int _recordNumber) {
        recordNumber = _recordNumber;
    }

    @Override
    public String toString() {
        return "Тип: Студент\n" + super.toString() + "\nНомер зачетки: " + getRecordNumber();
    }
}
