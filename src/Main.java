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
        while (total < sum) {
            month = month + 1;
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей.");
        }

        //Задание 2
        System.out.println("Задание 2");
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(a + " ");
        }
        System.out.println();

        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        int population = 12_000_000; //население
        int birthRate = population/1000*17; //рождаемость
        int mortality = population/1000*8; //смертность
        int growth = birthRate - mortality; //прирост
        int calculatedYear = 10; //период
        for (int i = 1; i <= calculatedYear; i++) {
            population = population + growth;
            System.out.println("Год " + i + ", численность населения составляет " + population + ".");
        }

        //Домашнее задание 2
        System.out.println("Домашнее задание 2");
        //Задание 1
        System.out.println("Задание 1");
        int contribution = 15_000;  //вклад
        int savings = 0;  //накопления
        int desiredAmount = 12_000_000; //желаемая сумма
        int month1 = 0;
        while (savings<desiredAmount){
            month1 = month1+1;
            savings = savings + savings/100*7;
            savings = savings+contribution;
            System.out.println("Месяц " + month1 + " , сумма накоплений равна " + savings +" рублей.");}

        //Задание 2
        System.out.println("Задание 2");
        int savings1 = 0;  //накопления
        int month2 = 0;
        while (savings1<desiredAmount){
            month2 = month2+1;
            savings1 = savings1 + savings1/100*7;
            savings1 = savings1+contribution;
            if (month2%6==0){
                System.out.println("Месяц " + month2 + " , сумма накоплений равна " + savings1 +" рублей.");}}


        //Задание 3
        System.out.println("Задание 3");
        int contribution2 = 15_000;  //вклад
        int savings2 = 0;  //накопления
        int months = 12;
        int years =9;
        for (int i = 1; i <= months*years; i++) {
            savings2=savings2+savings2/100*7;
            savings2=savings2+contribution2;
            if (i%6==0){
                System.out.println("Месяц " + i + " , сумма накоплений равна " + savings2 +" рублей.");
            }}

        //Задание 4
        System.out.println("Задание 4");
        int data = 1; //пятница
        int dayMonth = 31; //дней в месяце
        for (int i = data; i <= dayMonth ; i = i+7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }

        //Домашнее задание 3
        System.out.println("Домашнее задание 3");
        //Задание 1
        System.out.println("Задание 1");
        int currentYear = 2022; //текущий год
        int periodDown = 200; //период от
        int periodUp = 100; //период после
        int comet = 79; //полет кометы
        int remains = (currentYear-periodDown)%comet; //остаток
        for (int i = currentYear-periodDown-remains+comet;  i < currentYear+periodUp; i+=comet) {
            System.out.println(i);}

        //Задание 2
        System.out.println("Задание 2");
        int n = 2;
        for (int j = 1; j < 11; j++) {
            System.out.println(n+"*" + j+ "=" + n*j);}
        System.out.println();


    }
}