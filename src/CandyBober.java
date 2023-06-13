import java.util.Scanner;

public class CandyBober {
    public boolean polygraph() {
        Scanner scan = new Scanner(System.in);
        String poly = scan.nextLine();
        StringBuilder sb = new StringBuilder(poly);
        if (poly.equals(sb.reverse())) {
            return true;
        } else {
            return false;


        }
    }

        public static void main (String[]args){
            CandyBober candy = new CandyBober();
            System.out.println(candy.polygraph());
        }

    }

//Конечно! Вот еще одна задача на Java:
//        Напишите программу, которая запрашивает у пользователя целое число и проверяет,
//        является ли оно палиндромом. Палиндром - это число, которое читается одинаково
//        слева направо и справа налево.
//        Пример работы программы:
//        Введите число: 12321
//        Число является палиндромом.
//        Введите число: 12345
//        Число не является палиндромом.