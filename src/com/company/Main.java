package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ATM atm = new ATM();

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to TCF Bank");

        atm.chooseName();
        atm.chooseOptions();



    }}




