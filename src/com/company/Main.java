package com.company;

import java.io.LineNumberReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[][] array = {{0, 0, 0}, {0, 0, 0},{0, 0, 0}};
        int[][] newArray = {{0, 0, 0}, {0, 0, 0},{0, 0, 0}};
        int ship = 1;
        Scanner scanner = new Scanner(System.in);
        Boolean flag = true;

        while (flag == true){
            for(int i = 0; i < 3; i++){
                int min = 0;
                int max = 3;
                var randomLine = (int)Math.floor(Math.random()*3)+0;
                var randomColumn = (int)Math.floor(Math.random()*3)+0;
                array[randomLine][randomColumn] = ship;

            }


            for(int i = 0; i < array.length; i++){
                for(int j = 0; j < array[i].length; j++){
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }

            for(int i = 0; i < 3; i++){
                System.out.println("Choisissez la ligne que vous voulez toucher.");
                int lineNumber = scanner.nextInt();
                System.out.println("Choisissez la colonne que vous voulez toucher");
                int columnNumber = scanner.nextInt();

                while (array[lineNumber][columnNumber] != 1){
                    System.out.println("Loupé!");
                    System.out.println("Choisissez la ligne que vous voulez toucher.");
                    int lineNumber2 = scanner.nextInt();
                    System.out.println("Choisissez la colonne que vous voulez toucher");
                    int columnNumber2 = scanner.nextInt();
                    lineNumber = lineNumber2;
                    columnNumber = columnNumber2;

                }

                if (array[lineNumber][columnNumber] == 1){
                    System.out.println("Touché!");
                    newArray[lineNumber][columnNumber] = array[lineNumber][columnNumber];
                    for(int j = 0; j < newArray.length; j++){
                        for(int k = 0; k < newArray[j].length; k++){
                            System.out.print(newArray[j][k]);
                        }
                        System.out.println();
                    }
                }
            }
            System.out.println("Bravo vous avez gagné!");
            flag = false;

        }


    }
}
