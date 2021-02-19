package com.company;

public class Pole {
    int[][] pole = new int[3][3];
    private int game = 1;

    public String goPole(int hodX, int hodY) {
        if (hodX > 3 || hodY > 3 || hodY < 0 || hodX < 0 || this.pole[hodX][hodY] != 0)
            return "Недопустимый ход,ходит игрок" + this.game;
        else {
            this.pole[hodX][hodY] = this.game;
            this.game = (this.game == 1) ? 2 : 1;
            return "Ход сделан";
        }
    }

    public int[][] printPole() {
        return this.pole;
    }

    public boolean allow() {
        boolean flag = false;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (this.pole[i][j] == 0)
                    flag = true;

        return flag;
    }
}
  

