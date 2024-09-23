import less2.Log;
import lesson1.Animal;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOG = Log.log(Main.class.getName());

    private static int factorial(int n) {



//        if (n <= 0) return -1;
//        if (n == 1) return 1;
//
//        if(n % 2 == 0)

//        String.valueOf(n) -> string
//        string.split("") -> ["1", "2", "3"]
//        int x = 0;
//        for (int i = 1; i <= n; i++) {
//            split[i] -> Integer.parseInt(split[i])
//        }

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(n);
//        list.add(2);
//
//        Integer max = Collections.max(list);

        return 0;
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

    private static int less2ex1(String input) {

        String some = "mama";
        String some1 = "papa";

        some = some + some1;


        StringBuilder sb = new StringBuilder();
        // [    , , , , , , , , ,         ]                     ]
        sb.append(input)
                .append("kdjashgiseh").append(input);

        System.out.println(sb);
        return input.length();
    }

    public static void writeFileNamesToNewFile(String out, String in ) throws IOException {

        String[] names = completeFileNames(out);

        FileWriter fw = null;



        try {
            fw = new FileWriter(in);
            for (String name : names) {
                fw.write(name+"\n");
            }
            if (isThrow()) {
                throw new IOException("Some kind of mistake");
            }
            fw.flush();
        } catch (IOException exception) {
            LOG.log(Level.INFO, exception.getLocalizedMessage());
//            throw new RuntimeException("Извините, запись в файл не удалась " + exception.getMessage());
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static String[] completeFileNames(String path) throws IOException {

        File file = new File(path);



        if (file.isFile()) {
            return new String[0];
        }

        File[] files = file.listFiles();

        String[] names = new String[files.length];

        for (int i = 0; i < files.length; i++) {
             names[i] = files[i].getName();

            if (isThrow()) {
                throw new IOException("Some kind of mistake");
            }
        }

        if (isThrow()) {
            throw new IOException("Some kind of mistake");
        }

        return names;
    }

    private static boolean isThrow() {
        int a = 0;
        int b = 2;
        int digit = a + (int) (Math.random() * b);
        System.out.println(digit);
        return digit > 0;
    }

    public static void main(String[] args) throws IOException {

        writeFileNamesToNewFile(".", "lesson2.txt");

//        примитив - ссылочные
//         boolean - 00000001 bit , char - 8 bit, long 64 bit, int - 32 bit, double - 64, float -32 ,
//         short - 16, byte - 8
//         Boolean - 16 байт , Charachter, Integer ... класс
//        Animal cat = new Animal("Барсик", 2);
//        float x = 2;
//        float x = 600_000_000F;
//
//        task1();
//
//        cycle();
//        System.out.println(task6());
//        task7();
//
//        factorial(5);


    }

}