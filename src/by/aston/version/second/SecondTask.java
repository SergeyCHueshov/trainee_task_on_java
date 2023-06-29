package by.aston.version.second;

import lombok.Data;

import javax.swing.*;

@Data
public class SecondTask {

    void performSecondTask(String name) {
        if (name.equals("Вячеслав")) {
            JOptionPane.showMessageDialog(null,"Привет, Вячеслав",
                    "Проверка на имя: " + name, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Нет такого имени",
                    "Проверка на имя: " + name, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
