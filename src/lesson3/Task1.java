package lesson3;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task1 {
    public static void main(String[] args) {
        // Укажите путь к вашему локальному файлу
        String filePath = "E:/code";

        // Получаем объект Path
        Path path = Paths.get(filePath);

        // Если необходимо, преобразуем Path в File
        File file = path.toFile();

        // Теперь вы можете использовать объект File
        if (file.exists()) {
            System.out.println("File: " + file.getAbsolutePath());
        } else {
            System.out.println("File not found");
        }
    }

}
