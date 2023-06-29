package by.aston.version.second;

import lombok.Data;

import javax.swing.*;

@Data
public class FirstTask {

    void performFirstTask(int number) {
        if (number > 7) {
            JOptionPane.showMessageDialog(null, "Вы ввели число: " + number + " Привет",
                    "Число больше 7",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Вы ввели число: " + number + " Пока",
                    "Число меньше 7",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
