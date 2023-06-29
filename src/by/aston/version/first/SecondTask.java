package by.aston.version.first;

import lombok.Data;

@Data
public class SecondTask {

    void performSecondTask(String name) {
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
        System.out.println("Вы ввели имя: " + name);
    }
}
