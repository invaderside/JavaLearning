package com.company;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scannerN = new Scanner(System.in);
        System.out.println("Please enter N trees:");
        String NString = scannerN.nextLine();


        Scanner scannerM = new Scanner(System.in);
        System.out.println("Please enter M trees:");
        String MString = scannerM.nextLine();

        Scanner scannerW = new Scanner(System.in);
        System.out.println("Please enter ways:");
        String WString = scannerW.nextLine();

        int N = 10;
        int M = 5;
        int W;

        if (M == 0)
        {
            W = 1;
        }

        else if (M == 1)
        {
            W = N;
        }

        else
        {
            int k =  (N-1)/(M-1); //количество членов прогрессии
            int d = M-1; //шаг прогрессии
            W = (2+(k-1)*d)*k/2; //формула суммы первых членов арифметической прогрессии
            System.out.println("Количество возможных путей вырубки: "+W);
        }
    }
}