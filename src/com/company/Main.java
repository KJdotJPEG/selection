package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// maximum pain
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Write in the amount of marks from this student out of 50");
            int marks = input.nextInt();
            if (marks>50) {
                System.out.println("Error. Inputs over 50 aren't allowed.");
            }
            if ((marks<=50)&&(marks>=40)) {
                System.out.println("A");
                if ((marks<=40)&&(marks>=30)) {
                    System.out.println("B");
                    if ((marks<=30)&&(marks>=20)) {
                        System.out.println("C");
                        if ((marks<=20)&&(marks>=10)) {
                            System.out.println("D");
                                if ((marks<=10)&&(marks>=0)) {
                                    System.out.println("E");
                                    if (marks==0){
                                        System.out.println("U");
                                    }
                                    if (marks<0) {
                                        System.out.println("Invalid input. Inputs over 50 aren't allowed");

                                }
                            }
                        }
                    }
                }


            }

        }
    }
}
