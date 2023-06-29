package by.aston.version.first;

import java.util.Scanner;

public class TaskApp {

    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            FirstTask firstTask = new FirstTask();
            System.out.println("Первое задание.Составить алгоритм: если введенное число больше 7, то вывести “Привет”");
            System.out.println("Число: ");
            int number = scanner.nextInt();
            firstTask.performFirstTask(number);
        }

        {
            SecondTask secondTask = new SecondTask();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Второе задание.Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести "
                    + "“Привет, Вячеслав”, если нет, то вывести: Нет такого имени ");
            System.out.println("Имя: ");
            String name = scanner.nextLine();
            secondTask.performSecondTask(name);
        }

        {
            ThirdTask thirdTask = new ThirdTask();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Третье задание. Составить алгоритм: на входе есть числовой массив," +
                    " необходимо вывести элементы массива кратные 3");
            System.out.println("Введите число для деления: ");
            int inputNumber = scanner.nextInt();
            thirdTask.performThirdTask(inputNumber);
        }
    }
}
