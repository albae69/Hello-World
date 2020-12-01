package com.logic;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); //constructor
        System.out.println("masukkan angka : ");
        int n = scn.nextInt();
        for (int i = 0; i < n; i++){
            System.out.print(i + "\t");
        }
    }
}

