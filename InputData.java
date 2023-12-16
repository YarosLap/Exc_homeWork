import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "Напишите через пробел, латинскими буквами вашу фамилию, имя, отчество, дату рождения в формате dd.mm.yyyy, номер телефона, пол укажите одной английской буквой - f или m ) : ");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6) {
                System.out.println("Вы ввели не все данные. Повторите ввод");
            } else
                System.out.println("Вы ввели лишние данные. Повторите ввод");
        }

    }
}