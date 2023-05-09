package org.example;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int math,physics,chemistry,music,turkish;

        Scanner input = new Scanner(System.in);

        System.out.println("İstenilen ders notlarınızı giriniz");

        System.out.print("Matematik : ");
        math = input.nextInt();

        System.out.print("Fizik : ");
        physics = input.nextInt();

        System.out.print("Kimya : ");
        chemistry = input.nextInt();

        System.out.print("Müzik : ");
        music = input.nextInt();

        System.out.print("Türkçe : ");
        turkish = input.nextInt();

        double avarage = ((math+ physics+ chemistry+turkish+ music)/5);

        if (avarage <50){
            System.out.println("Sınıfı geçemediniz! Ortalamanız : "+ avarage );
        }else {
            System.out.println("Sınıfı geçtiniz! Ortalamanız : "+ avarage);
        }
    }
}