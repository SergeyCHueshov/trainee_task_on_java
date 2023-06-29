package by.aston.version.first;

import lombok.Data;

import java.util.Arrays;

@Data
public class ThirdTask {

    void performThirdTask(int inputNumber) {
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
        }
        System.out.println( "Все числа списка " + Arrays.toString(number).replaceAll("^\\[|]$", ""));
        System.out.println("Следующие числа делятся на " + inputNumber + " : ");
        for (int element : number) {
            if (element % inputNumber == 0) {
                System.out.println(element);
            }
        }
    }
}