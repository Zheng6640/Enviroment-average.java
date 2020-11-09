package com.company;
import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        String input;
        double nMark, count = 0, totalMarks = 0, average;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert a mark: ");
        input = scanner.nextLine();

        while (!input.equals("end")) {
            nMark = Double.parseDouble(input);
            count++;
            totalMarks += nMark;
            System.out.print("Insert a mark: ");
            input = scanner.nextLine();
        }

        average = totalMarks / count;
        System.out.print("The average is " + average);
    }
}
