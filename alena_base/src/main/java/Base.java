import java.util.ArrayList;
import java.util.Scanner;

/**  Поиск максимального элемента в массиве.
 Для начала задать массив слов.Размерность массива произвольна,
 задается в консоли. После чего в консоли вводятся слова в количестве
 равном заданной длине массива. В полученном массиве необходимо
 найти самое длинное слово. Результат вывести на консоль*/

public class Base {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Ввод размера массива: ");
        int size = sc.nextInt() ;
        String massive[] = new String[size];

        System.out.println("Ввод слов:");
        for (int i = 0; i <=massive.length; i++) {
            massive[i] = sc.nextLine(); // Заполняем массив элементами, введёнными с клавиатуры
        }


        System.out.print("Вы ввели:");
        for (int i = 0; i <massive.length; i++) {
            System.out.print(" " + massive[i]);


        }
        System.out.println();


    }
}



























//import java.util.Scanner;
///**
// * Рассчет операций сложения, деления, умножения и вычитания над простыми и дробными числами
// * @autor Alena Kosova
// * */
//public class Base {
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//
//        System.out.println("Первое значение:");
//        double a = sc.nextDouble(); //ввод первого значения
//        sc.nextLine();
//
//        System.out.println("Ввод операции:");
//        String z = sc.nextLine(); //ввод операции
//
//        System.out.println("Второе значение:");
//        double b = sc.nextDouble();//ввод второго значения
//        sc.nextLine();
//
///*Если пользователь ввел операцию сложения, то складывается переменная a и b, которые были введены ранее. Если нет, то проверяем дальше*/
//        if (z.contains("+")) {
//            double k = (a + b);
//            System.out.print(a + " + " + b + " = ");
//            System.out.printf("%.4f", k);
//
///*Если пользователь ввел операцию вычитания, то переменная b вычитается из переменной a, которые были введены ранее. Если нет, то проверяем дальше*/
//        } else if (z.contains("-")) {
//            double k = (a - b);
//            System.out.print(a + " - " + b + " = ");
//            System.out.printf("%.4f", k);
//
///*Если пользователь ввел операцию умножения, то переменная a и b множаться друг на друга, которые были введены ранее. Если нет, то проверяем дальше*/
//        } else if (z.contains("*")) {
//            double k = (a * b);
//            System.out.print(a + " * " + b + " = ");
//            System.out.printf("%.4f", k);
//
//
//        }
///* Если пользователь ввел операцию корня, то вычитается корень из переменной а, которая была введена ранее. Если нет, то проверяем дальше*/
//        else if (z.contains("sqrt")) {
//            System.out.print("Равно: ");
//            System.out.printf("sqrt(%.4f) = %.4f%n", a, Math.sqrt(a));
//
//
//        }
//
///*Если пользователь ввел операцию деления, то переменная a делится на переменную b, которые были введены ранее. Если нет, то проверяем дальше*/
//        else if (z.contains("/")) {
//
//            if (b == 0) {
//                System.out.print(a + " / " + b + " = ");
//                System.out.printf("%.4f", a);
//
//
//
//            }
//            else if (b != 0) {
//                double k = (a / b);
//                System.out.print(a + " / " + b + " = ");
//                System.out.printf("%.4f", k);
//
//            }
//        } else {
//            System.out.println("Неправильный ввод операции, используйте символы + - / *. Для вычисления корня используйте sqrt");
//        }
//
//
//        sc.close();
//    }
//
//
//
//}