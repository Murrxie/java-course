package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pole pole = new Pole();
        String result;
        int x,y;
        do{
        Scanner in = new Scanner(System.in);
        System.out.print("игрок ходит, x -");
        x = in.nextInt();
        System.out.print("игрок ходит, y -");
        y = in.nextInt();
        result = pole.goPole( x,  y);


        System.out.println(result);
            for (int i=0;i<3;i++){
                for (int j = 0; j<3; j++) {
                    System.out.print(pole.printPole()[i][j]);
            }
        }
        System.out.println();
    }while (pole.allow());
    }

}
