package com.trylabs;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int z=0;
        char [] [] gameyard=new char [3][3];

        System.out.println("Играем в крестики-нолики на поле 3х3 первый ходит крестиками");
        int x, y,x1,y1;
        Scanner scanner = new Scanner(System.in);
        Random random=new Random();

	while (z<9)
    {
        System.out.println("Введите позицию от 1 до 3-х сначала для поля по горизонтали а потом для поля по вертикали" );
        x=scanner.nextInt();
        y=scanner.nextInt();
        if (gameyard[x-1][y-1]=='0'||gameyard[x-1][y-1]=='x'||(x>3)||(y>3))
         {System.out.println("Введите позицию заново"); continue;}
        gameyard [x-1][y-1]='x';
        if (winner(gameyard)==1){
            System.out.println("Вы выиграли");
            break;
        }
        if (winner(gameyard)==2){
            System.out.println("Компьютер выиграл");
            break;

        }
        if (z<9) z++;
        else break;
        do {
        x1 = random.nextInt(3);
        y1 = random.nextInt(3);}
        while ((gameyard[x1][y1]=='0')||(gameyard[x1][y1]=='x'));
        gameyard[x1][y1] = '0';
        if (z<9) z++;
        else break;
        if (z<9) for (char k[]:gameyard)
        { for( char c: k)
        {
            System.out.print(c);
        }

            System.out.println();}

            //

    }
    }
    static short winner (char[][] array ){
        int sum0=0;
        int sumx=0;
        short win=0;//если  1- победил игрок, 2-победил компьютер
        for (char a[]:array)
        { sum0=0;
            sumx=0;
            for (char b: a ){
            if (b=='x') sumx++;
            if (sumx==3) {win=1; break; }
            if (b=='0') sum0++;
            if (sum0==3) {win=2; break; }
            }
        }
        sum0=0;
        sumx=0;
         for (int i=0;i<3;i++)
         { sum0=0;
             sumx=0;
             for (int j=0;j<3;j++ ){
                 if  (array[j][i]=='x')sumx++;
                 if (sumx==3) {win=1; break; }
                 if  (array[j][i]=='0')sum0++;
                 if (sum0==3) {win=2; break; }

             }
         }

            if (((array[0][0]=='x')&&(array[2][2]=='x')&&(array[1][1]=='x'))||((array[0][2]=='x')&&(array[2][0]=='x')&&(array[1][1]=='x'))) return win=1;


             if (((array[0][0]=='0')&&(array[2][2]=='0')&&(array[1][1]=='0'))||((array[0][2]=='0')&&(array[2][0]=='0')&&(array[1][1]=='0'))) return win=2;

         return win;
     }
}
