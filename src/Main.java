import lesson1.Animal;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

//        примитив - ссылочные
//         boolean - 00000001 bit , char - 8 bit, long 64 bit, int - 32 bit, double - 64, float -32 ,
//         short - 16, byte - 8
//         Boolean - 16 байт , Charachter, Integer ... класс
//        Animal cat = new Animal("Барсик", 2);
//        float x = 2;
//        x = 600_000_000F;

//        task1();

//        cycle();
//        System.out.println(task6());
        task7();
    }

    public static void task7() throws IOException {
        FileWriter fw = new FileWriter("output.txt");
        fw.write("Hello World");
//        ["1", "kfeajf", "fanwek"]
        fw.flush();
        fw.close();
    }

    public static String task6() {

        String s = "Добро пожаловать на курс по Java";

        String[] split = s.split(" ");

        String res = "";
        String s1 = "";
        for (int i = split.length - 1; i >= 0 ; i--) {
            s1 += res + split[i] + " ";
        }

        return s1;
    }

    public static void cycle() {

        while (true) {
            task2();
        }
    }

    public static void task2() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name: ");

        String name = sc.next();

        if(name.startsWith("q")) System.exit(0);

        if(name.startsWith("Al")) {
            System.out.println("Are you Alex?");
        } else if(name.startsWith("B")) {
            System.out.println("Are you Bob?");
        } else if(name.startsWith("C")) {
            System.out.println("Are you Carol?");
        } else {
            System.out.println("Hello!");
        }

//        System.out.println("Hello " + name + "!");

    }

    private static void task1() {

        System.out.println("Hello World");

        LocalTime now = LocalTime.now();
        // LocalDateTime now = LocalDateTime.now() //ошибка, одинаковые имена

        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("Дата: dd MMM yyyy г., время: HH ч. mm мин. ss сек.");
        System.out.println(formatter.format(LocalDateTime.now()));

    }

}