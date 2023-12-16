
import java.io.IOException;
import java.util.HashMap;

// Точка входа
public class Program {
    public static void main(String[] args) {
        ParsData parsData = new ParsData();
        String newFileName = null;
        WriteFile writeFile = new WriteFile();

        // Цикл пока не будет корректна введена дата рождения
        HashMap<String, Object> data = parsData.parsInputData();
        while (data.size() != 6) {
            try {
                throw new DataException();
            } catch (DataException e) {
                data = parsData.parsInputData();
            }
        }

        // Подготовка к записи личных данных в файл, формирование имени файла
        newFileName = data.get("lastName") + ".txt";
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }

        // Запись личных данных в файл
        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        writeFile.writeData(String.valueOf(sb), filePath);

    }
}