package ru.bstu.iitus.kb31.kis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int type = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество объектов:");
        count = scanner.nextInt();
        Person[] array = new Person[count];
        for(int i = 0; i < count; i++) {
            System.out.println("Введите тип объекта:\n" +
                    "1 - Студент\n" +
                    "2 - Пенсионер\n" +
                    "3 - Сорудник\n" +
                    "4 - Преподаватель\n" +
                    "5 - Секретарь");
            type = scanner.nextInt();
            Person person;
            switch (type) {
                case 1:
                    person = new Student();
                    break;
                case 2:
                    person = new Retiree();
                    break;
                case 3:
                    person = new Employee();
                    break;
                case 4:
                    person = new Teacher();
                    break;
                case 5:
                    person = new Secretary();
                    break;
                default:
                    System.out.println("НЕПРАВИЛЬНО");
                    person = new Student();
                    break;
            }
            person.init(scanner);
            System.out.println();
            array[i] = person;
        }
        int minWeight = array[0].getWeight();
        int index = 0;
        for(int i = 1; i < count; i++) {
            if(array[i].getWeight() < minWeight) {
                minWeight = array[i].getWeight();
                index = i;
            }
        }
        System.out.println("Человек с самым маленьким весом:\n" + array[index].toString());
    }
}
