import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int o = 0;
        int o1 = 0;
        Scanner sc = new Scanner(System.in);
        Random b = new Random();
        int[] a = new int[10];


        // создал массив и посчитал чет нечет
        for (int i = 0; i < a.length; i++) {
            a[i] = b.nextInt(100);
            if (a[i] % 2 == 0) o++;
            else o1++;
        }

        //общение с челиксом
        System.out.println("Ваш массив");
        printArray(a);
        System.out.println("Введите 1 чтобы получить четные , введите 0 чтобы получить нечетные");
        int c = sc.nextInt();
        //Данные сбор данных формирование новых массивов
        int[] aHe4eT = new int[o];
        int[] a4eT = new int[o1];
        int u = 0;
        // финалочка
       if (c == 1) {
           for (int i = 0; i < a.length; i++) {
               if (a[i] % 2 == 0) {aHe4eT[u] = a[i]; u++;}
           }
           printArray(aHe4eT);
        } else { for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) { a4eT[u] = a[i]; u++; }
       }
           printArray(a4eT);
       }
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }
}
