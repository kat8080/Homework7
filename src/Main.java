public class Main {
    public static void main(String[] args) {
        //Домашнее задание 1
        System.out.println("Домашнее задание 1");
        //Задание 1
        System.out.println("Задание 1");
        int salary = 29_000;
        int total = 0;
        int month = 0;
        int sum = 2_459_000;
        while (total<sum){
            month=month+1;
            total = total+total/100;
            total = total+salary;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + total +" рублей.");}

        //Задание 2
        System.out.println("Задание 2");
        int a = 0;
        while (a<10){
            a = a+1;
            System.out.print(a + " ");}
        System.out.println();

        for (int j = 10; j > 0 ; j--) {
            System.out.print(j + " ");}
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        int population = 12_000_000;
        int birthRate = 0;
        int mortality = 0;
        int growth = 0;
        int calculatedYear = 10;
        int g = 0;
        while (g < calculatedYear) {
            g = g + 1;
            birthRate = population / 1000*17;
            mortality = population / 1000*8;
            growth = birthRate - mortality;
            population = population + growth;
            System.out.println("Год "+ g + ", численность населения составляет " + population + ".");}

        //Домашнее задание 2
        System.out.println("Домашнее задание 2");
        //Задание 1
        System.out.println("Задание 1");
        int contribution = 15_000;  //вклад
        int savings = 0;  //накопления
        int desiredAmount = 12_000_000; //желаемая сумма
        while (savings<desiredAmount){
            month = month+1;
            savings = savings + savings/100*7;
            savings = savings+contribution;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + savings +" рублей.");}

        //Задание 2
        System.out.println("Задание 2");
        int savings1 = 0;  //накопления
        while (savings1<desiredAmount){
            month = month+1;
            savings1 = savings1 + savings1/100*7;
            savings1 = savings1+contribution;
            if (month%6==0){
                System.out.println("Месяц " + month + " , сумма накоплений равна " + savings1 +" рублей.");}}

        //Задание 3
        System.out.println("Задание 3");
        int contribution2 = 15_000;  //вклад
        int savings2 = 0;  //накопления
        int months = 12;
        int years =9;
        while (month<=years*months){
            month=month+1;
            savings2=savings2+savings2/100*7;
            savings2=savings2+contribution2;
            if (month%6==0){
                System.out.println("Месяц " + month + " , сумма накоплений равна " + savings2 +" рублей.");
            }}

        //Задание 4
        System.out.println("Задание 4");
        int number = 2;
        int daysMonth = 31;
        while (number < daysMonth) {
            number = number + 1;
            if (number % 7 == 0){
            System.out.println("Сегодня пятница, " + number + "-е число. Необходимо подготовить отчет.");
        }}

        //Домашнее задание 3
        System.out.println("Домашнее задание 3");
        //Задание 1
        System.out.println("Задание 1");

        int currentYear = 2022;
        int ot = currentYear - 200;
        int go = currentYear + 100;
        int comet = 0;
        while ( comet > ot && comet < go) {
            comet = comet + 1;
            if (comet%79==0){
                System.out.println(comet);
            }}

        //Задание 2
        System.out.println("Задание 2");
        int n = 2;
        for (int j = 1; j < 11; j++) {
            System.out.println(n+"*" + j+ "=" + n*j);}
        System.out.println();


    }
}