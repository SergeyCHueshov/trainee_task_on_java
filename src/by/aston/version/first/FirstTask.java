package by.aston.version.first;

import lombok.Data;

@Data
class FirstTask {

    void performFirstTask(int number) {
        if (number > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Число меньше 7");
        }
        System.out.println("Вы ввели число: " + number);
    }
}