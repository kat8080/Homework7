public class Main {
    public static void main(String[] args) {
        //Домашнее задание 1
        System.out.println("Домашнее задание 1");
        //Задание 1
        System.out.println("Задание 1");
        int salary = 29_000;
        int total = 0;
        int i = 0;
        while (total<2_459_000){
            i=i+1;
            total = total+total/100;
            total = total+salary;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total +" рублей.");}

        //Домашнее задание 2
        System.out.println("Домашнее задание 2");
        //Задание 1
        System.out.println("Задание 1");
        int contribution = 15_000;  //вклад
        int savings = 0;  //накопления
        int month = 0;   //месяц
        while (savings<12_000_000){
            month = month+1;
            savings = savings + savings/100;
            savings = savings+contribution;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + savings +" рублей.");}

        //Задание 2
        System.out.println("Задание 2");
        int contribution1 = 15_000;  //вклад
        int savings1 = 0;  //накопления
        int month1 = 0;   //месяц
        while (savings1<12_000_000){
            month1 = month1+1;
            savings1 = savings1 + savings1/100*7;
            savings1 = savings1+contribution1;
            if (month1%6==0)
                System.out.println("Месяц " + month1 + " , сумма накоплений равна " + savings1 +" рублей.");}

        //Задание 3
        System.out.println("Задание 3");
        int contribution2 = 15_000;  //вклад
        int savings2 = 0;  //накопления
        int month2 = 0;   //месяц
        while (month2<=108){
            month2=month2+1;
            savings2=savings2+savings2/100*7;
            savings2=savings2+contribution2;
            if (month2%6==0)
                System.out.println("Месяц " + month2 + " , сумма накоплений равна " + savings2 +" рублей.");
        }

        //Задание 4
        System.out.println("Задание 4");
        int number = 2;{
            System.out.println("Сегодня пятница, " + number + "-е число. Необходимо подготовить отчет.");
        }
        while (number<24){
            number =number+7;
            System.out.println("Сегодня пятница, " + number + "-е число. Необходимо подготовить отчет.");
        }

        //Домашнее задание 3
        System.out.println("Домашнее задание 3");
        //Задание 1
        System.out.println("Задание 1");

        int ot = 1822;
        int go = 2122;
        for (int age=1; age > 0; age++) {
            if (age % 79 == 0 && age>ot && age<go){
                System.out.println(age);
            }}

        //Задание 2
        System.out.println("Задание 2");
        int n = 2;
        for (int j = 1; j < 11; j++) {
            System.out.println(n+"*" + j+ "=" + n*j);}
        System.out.println();


    }
}