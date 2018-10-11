package com.company;

public class Main {

    public static void main(String[] args) {
      Main main = new Main();
      int value;
      value = main.vynasobmicisla(5,8);
      System.out.println(value);
      main.vypiscyklus(3,10);
    }

    public int vynasobmicisla(int a, int b){
        int cislo = a * b;
        return cislo;
    }

    public void vypiscyklus(int pocatecniCislo, int velikostPole) {
            int[] pole = new int[velikostPole+1];
            for (int i = pocatecniCislo; i <= velikostPole; i++) {
                pole[i] = i;
                System.out.println(" cislo: " + pole[i] + " ");
            }
        }

        
}
