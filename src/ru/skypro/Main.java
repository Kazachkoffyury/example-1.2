package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //  task 2
      byte b = 125;
      short a = 15000;
      int c = 5678;
      long d = 5_678_890_000L;
      float e = 3.14f;
      double g = 4.678;
      char r = 'd';

      // task 2
      float weightBoxerOne = 78.2f;
      float weightBoxerTwo = 82.7f;
      float weightBoxerAmount = weightBoxerOne + weightBoxerTwo;
        System.out.println("Вес обоих боксеров: " + weightBoxerAmount);
        float weightDifference = Math.abs(weightBoxerOne - weightBoxerTwo);
        System.out.println("Разница в весе двух спортсменов составляет : " + weightDifference);

        // task 3

        int weightKg = 1000;
        int weightBanana = 80;
        int weightMilk = 105;
        int weightIcecream = 100;
        int weightEggs = 70;
        int weightCoctail = (weightBanana * 5) + (weightMilk * 2) + (weightIcecream * 2) + (weightEggs * 4);
        float weightCoctailKg = (float) weightCoctail / 1000;
      System.out.println( "Вес коктейля в килограммах составил : " + weightCoctailKg);

      // task 4

      int weightTarget = 7000;
      int weightLowVar1 = 250;
      int weightLowVar2 = 500;
      int daysLowsVar1 = weightTarget / weightLowVar1;
      System.out.println("если спортсмен будет терять в день по 250 грамм то на это уйдет :" + daysLowsVar1 + " дней");
      int daysLowsVar2 = weightTarget / weightLowVar2;
      System.out.println("если спортсмен будет терять в день по 500 грамм то на это уйдет :" + daysLowsVar2 + " дней");
      int daysMiddle = (daysLowsVar1 + daysLowsVar2) / 2;
      System.out.println("В среднем на похудение уйдет :" + daysMiddle + " дней");

      // task 5
      int salaryUp = 10;
      int salaryMasha = 67_760;
      int salaryMashaYear = salaryMasha * 12;
      int salaryMashaUp = salaryMasha +(salaryMasha /100 * salaryUp);
      int salaryMashaYearUp = salaryMashaUp * 12;
      int salaryDenis = 83_690;
      int salaryDenisYear = salaryDenis * 12;
      int salaryDenisUp = salaryDenis +(salaryDenis /100 * salaryUp);
      int salaryDenisYearUp = salaryDenisUp * 12;
      int salaryKristyna = 76_230;
      int salaryKristynaYear = salaryKristyna * 12;
      int salaryKristynaUp = salaryKristyna + (salaryKristyna / 100 * salaryUp);
      int salaryKrystinaYearUp = salaryKristynaUp * 12;

      System.out.println("Маша теперь получает :"+  salaryMashaUp + " рублей."+ " Годовой доход вырос на " + (salaryMashaYearUp-salaryMashaYear)
              );
      System.out.println(" Кристина теперь получает : " + salaryKristynaUp + " рублей." + " Годовой доход вырос на " + (salaryKrystinaYearUp -salaryKristynaYear));

      System.out.println( "Денис теперь получает :" + salaryDenisUp + " рублей " + " Годовой доход вырос на " + (salaryDenisYearUp -salaryDenisYear));

      // task 6  к переменым добавил "1" так как в main уже были такие переменные и компилятор "ругается"

      int a1 = 12;
      int b1 = 27;
      int c1 = 44;
      int d1 = 15;
      int e1 = 9;
      int result = a1 * (b1 +(c1 -d1 *e1));
      System.out.println(Math.abs(result));


    }
}
