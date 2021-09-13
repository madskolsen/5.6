package com.company;
import java.util.Scanner;
public class Main {

    public static void stykker (int a, int b, int c) {
        double divide = 2 * a;
        double pow = (Math.pow(b, 2) - 4 * a * c);
        double sqaureroot = Math.sqrt(pow);
        double plusresultx = (-(b) + sqaureroot / divide);
        double minusresultx = (-(b) - sqaureroot / divide);

        if (divide == 0) {
            System.out.println("Du kan ikke dividere med 0!");
        } else if (pow < 0) {
            System.out.println("Du kan ikke tage kvadratroden af et negativt tal");
        } else if (plusresultx == minusresultx) {
            System.out.println("Der er kun et eller intet svar!");
        } else{
            System.out.println("ax^2+bx+c=0");
            System.out.println("+ = " + a + " * " + plusresultx + "^2" + " + " + b + " * " + plusresultx + " + " + c + " =" + (Math.pow(a*plusresultx,2)+b*plusresultx+c));
            System.out.println("- = " + a + " * " + minusresultx + "^2" + " + " + b + " * " + minusresultx + " + " + c + " =" + (Math.pow(a*minusresultx,2)+b*minusresultx+c));

        }

        }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("find the roots of ax^2 + bx + c = 0 using the quadratic formula");
        System.out.println("Quadratic formula: x=(-(b)±√b^2-4*a*c)/2");
        System.out.println("på denne måde kan x have 2 værdier afhængigt af hvorvidt du bruger + eller - ");
        System.out.println("Giv a en værdi: ");
        int a = scanner.nextInt();
        System.out.println("Giv b en værdi: ");
        int b = scanner.nextInt();
        System.out.println("Giv c en værdi: ");
        int c = scanner.nextInt();

        stykker(a, b, c);
    }
}
