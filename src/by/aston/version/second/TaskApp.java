package by.aston.version.second;

import javax.swing.*;

public class TaskApp {
    public static void main(String[] args) {

        String titleForWelcome;
        String titleForName;
        String titleForDivide;

        FirstTask firstTask = new FirstTask();
        titleForWelcome = JOptionPane.showInputDialog(null, "Число: ", "Первое задание." +
                        "Составить алгоритм: если введенное число больше 7, то вывести “Привет”",
                JOptionPane.INFORMATION_MESSAGE);
        firstTask.performFirstTask(Integer.parseInt(titleForWelcome));

        SecondTask secondTask = new SecondTask();
        titleForName = JOptionPane.showInputDialog(null, "Имя: ", "Второе задание." +
                "Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести "
                + "“Привет, Вячеслав”, если нет, то вывести: Нет такого имени ", JOptionPane.INFORMATION_MESSAGE);
        secondTask.performSecondTask(titleForName);

        ThirdTask thirdTask = new ThirdTask();
        titleForDivide = JOptionPane.showInputDialog(null, "Введите число для деления: ",
                "Третье задание. Составить алгоритм: на входе есть числовой массив," +
                        " необходимо вывести элементы массива кратные 3", JOptionPane.INFORMATION_MESSAGE);
        thirdTask.performThirdTask(Integer.parseInt(titleForDivide));
    }
}

