package by.aston.version.second;

import lombok.Data;

import javax.swing.*;
import java.util.Arrays;

@Data
public class ThirdTask {

    void performThirdTask(int inputNumber) {
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
        }
        JOptionPane.showMessageDialog(null,
                Arrays.toString(number).replaceAll("^\\[|]$", ""),
                "Все числа из массива: ", JOptionPane.INFORMATION_MESSAGE);
        for (int element : number) {
            if (element % inputNumber == 0) {
                JOptionPane.showMessageDialog(null, "Итого: " + element,
                        "Числа кратные: " + inputNumber, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}