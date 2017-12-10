/**
 * @Author Alexander Panchenko
 * @see #main
 *NEW_MASTER
 **/

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        System.out.println("Приветствую тебя, друг!");
        System.out.println();
        System.out.println("Что ты хочешь? Поиграть в массив, или вызвать калькулятор?");
        System.out.println("Если введёшь цифру 1  - поиграешь в массив");
        System.out.println("Если введёшь цифру 2  - попадёшь в калькулятор");
        System.out.print("Сделай свой выбор. Введи цифру:");


        Scanner choose = new Scanner(System.in);
        String n = choose.nextLine();                                           // считывается знак выбора приложения
        // поглощение знака \n и ожидание новой строки
        System.out.println();
//        if (n.equals("1")) {

        switch (n) {
            //////////////////////
            case "1":
                Scanner massiveInput = new Scanner(System.in);
                System.out.print("Скажи-ка, из скольки слов состоит твой массив? Введи цифру: ");
                int sizeMassive = massiveInput.nextInt();
                massiveInput.nextLine();                                                   // поглощение знака \n и ожидание новой строки
                System.out.println();

                String[] wordsMassive = new String[sizeMassive];
                for (int i = 0; i < sizeMassive; i++) {
                    System.out.println("Введи " + (i + 1) + "-е слово и нажми Enter: ");
                    wordsMassive[i] = massiveInput.next();
                }

                System.out.println("Тобой введены следующие слова:");
                for (int i = 0; i < sizeMassive; i++) {
                    System.out.println(" " + wordsMassive[i]);
                }

                int max = 0;
                for (int i = 0; i < wordsMassive.length; i++) {
                    int currentLength = wordsMassive[i].length();
                    if (currentLength > max) max = currentLength;
                }

                System.out.println("Самое длинное слово составляет " + max + " символов.");

                break;


            ////////////////////////////
            case "2":
                System.out.println("*** ЭЛЕКТРОННЫЙ АРИФМОМЕТР ***");
                System.out.println();
                Scanner scanner = new Scanner(System.in);                             // инициализация сканнера

                System.out.print("Введи первое число. Затем, нажми Enter:");
                double a = scanner.nextDouble();                                      // ввод первого числа, а
                scanner.nextLine();                                                   // поглощение знака \n и ожидание новой строки
                System.out.println();

                System.out.print("Введи второе число. Затем, нажми Enter:");
                double b = scanner.nextDouble();                                       // ввод второго числа, b
                scanner.nextLine();                                                    // поглощение знака \n и ожидание новой строки


                System.out.println("Введи одно из арифметических действий: \"+\", \"-\", \"/\", \"*\". Затем, нажми Enter:");
                System.out.println();
                String z = scanner.nextLine();                                            // ввод арифметического действия
                double c;

                switch (z) {
                    case "+":
                        c = a + b;
                        System.out.printf("%.4f", c); // вычитывание арифметических действий
                        break;

                    case "-":
                        c = a - b;
                        System.out.printf("%.4f", c);
                        break;

                    case "*":
                        c = a * b;
                        System.out.printf("%.4f", c);
                        break;

                    case "/":
                        if (b == 0) {
                            System.out.println("На ноль деление не производится");  // проверка деления на ноль
                            break;
                        }
                        c = a / b;
                        System.out.printf("%.4f", c);
                        break;

                    default:
                        System.out.println("АААЙЙЙ! НУ НЕПРАВИЛЬНЫЙ ЖЕЖ ЗНАК! ЗАНОВО ЗАПУСКАЙ!");
                        scanner.close();
                        break;
                }
                break;


            ////////////////////////////
            default:
                System.out.println("Ты втираешь какую-то дичь.  Я сломался.");


        }
    }
}

