public class Main {
    public static void main(String[] args) {
        //Задание 1
        //Задача 1
        int i=0;
        double sum=0;
        while (sum<2_459_000){
            sum=sum+0.01*sum;
            System.out.println("Месяц " +i+ ", сумма накоплений равна " +sum+" рублей");
            sum=sum+15_000;
            i++;
        }

        //Задача 2
        i=1;
        while (i<11){
            System.out.print(i +" ");
            i++;
        }
        i--;
        System.out.println("");
        for(;i>0;i--) {
            System.out.print(i + " ");
        }
        //Задча 3
        System.out.println("");
        int populationY=12_000_000;
        for (i=0;i<=10;i++){
           System.out.println("Год "+i+ " численность населения составляет "+ populationY);
            populationY=populationY+(17-8)*(populationY/1000);
        }
        //Задание 2
        //Задача 1
        sum=15000;
        i=0;
        while (sum<=12_000_000){
            System.out.println("За "+i+ " месяцев собрано "+ sum +" рублей");
            sum=sum+0.07*sum;
            i++;
        }

        //Задача 2
        sum=15000;
        i=0;
        while (sum<=12_000_000){
            if (i%6 ==0){
                System.out.println("За "+i+ " месяцев собрано "+ sum +" рублей");
            }
            sum=sum+0.07*sum;
            i++;
        }
        //Задача 3
        sum=15000;
        i=0;
        while (i<=54){
            if (i%6 ==0) {
                System.out.println("За " + i + " месяцев собрано " + sum + " рублей");
            }
            sum=sum+0.07*sum;
            i++;
            }
        //Задача 4
        int friday=3;
        while(friday<=31){
            System.out.println("Сегодня пятница "+ friday + "-е число. Необходимо подготовить отчет.");
            friday+=7;
        }

        //Задание 3
        //Задача 1
        int currentYear=2022;
        var zeroYear=currentYear-200;
        while(zeroYear<=(currentYear+100)) {
            if (zeroYear % 79 == 0) {
                System.out.println(zeroYear);
                zeroYear=zeroYear+79;
            } else {
                zeroYear++;
            }
        }
        //Задача 2
        for (i=1;i<=10;i++)
        {
            System.out.println("2*"+i+"="+2*i);
        }


        }
}