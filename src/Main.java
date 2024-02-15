public class Main {
    public static void main(String[] args) {
        //Задача1
        byte car = 120;
        System.out.println(car);
        short fish = 20000;
        System.out.println(fish);
        int trees = 8900000;
        System.out.println(trees);
        long animals = 1300000000000L;
        System.out.println(animals);
        float milk = 12.35f;
        System.out.println(milk);
        double protein = 0.0000000000013;
        System.out.println(protein);

        //Задача2
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965l;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);

        //Задача3
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        int totalStudents = firstClass + secondClass + thirdClass;
        short paper = 480;
        int amountPaperPerson = paper / totalStudents;
        System.out.println("На каждого ученика рассчиатно " + amountPaperPerson + " листов бумаги");

        //Задача4
        byte bottles = 16;
        byte time = 2;
        int oneMinute = bottles / time;
        byte time2 = 20;
        int totalButtles = oneMinute * time2;
        System.out.println("За " + time2 + " минут машина произвела " + totalButtles + " штук бутылок");
        byte hours = 24;
        byte minutesInHorse = 60;
        int totalMinutes = hours * minutesInHorse;
        int totalButtles2 = totalMinutes * oneMinute;
        System.out.println("За " + totalMinutes + " минут машина произвела " + totalButtles2 + " штук бутылок");
        byte days =3;
        int totalMinutes2 = days * totalMinutes;
        int totalButtles3 = totalMinutes2 * oneMinute;
        System.out.println("За " + totalMinutes2 + " минут машина произвела " + totalButtles3 + " штук бутылок");
        byte monts = 30;
        int totalMinutes3 = monts * totalMinutes;
        int totalButtles4 = totalMinutes3 * oneMinute;
        System.out.println("За " + totalMinutes3 + " минут машина произвела " + totalButtles4 + " штук бутылок");

        //Задача5
        byte cans = 120;
        byte cansWhiteBrown = 6;
        int classes = cans / cansWhiteBrown;
        byte cansWhite = 2;
        byte cansBrown = 4;
        int totalWhiteCans = classes * cansWhite;
        int totalBrownCans = cans - totalWhiteCans;
        System.out.println("В школе, где " + classes + " классов, нужно  " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " коричневой краски");

        //Задача6
        byte oneBanana = 80;
        int totalBananas = 5 * oneBanana;
        int oneMilk = 105;
        int totalMilk = 2 * oneMilk;
        byte onePlombir = 100;
        int totalPlombir = 2 * onePlombir;
        byte oneEgg = 70;
        int totalEggs = 4 * oneEgg;
        int totalWeightGr = totalBananas + totalMilk + totalPlombir + totalEggs;
        int grPerKg = 1000;
        float weightKg = totalWeightGr / (float)grPerKg;
        System.out.println("Масса завтрака в граммах будет равна " + totalWeightGr + " г, а в кг она равна " + weightKg);

        //Задача7
        byte totalWeightKg = 7;
        int totalWeightGr2 = totalWeightKg * 1000;
        int firstWeight = 250;
        int secondWeight = 500;
        float daysFirstWeight = totalWeightGr2 / (float)firstWeight;
        float daysSecondWeight = totalWeightGr2 / (float)secondWeight;
        System.out.println("Если сбрасывать по " + firstWeight + " г, то потребуется " + daysFirstWeight + " дней, а если сбрасывать по " + secondWeight + " г, то потребуется " + daysSecondWeight + " дней");
        float averageValue = (daysFirstWeight + daysSecondWeight) / (float)2;
        System.out.println("Чтобы добиться результатов похудения, потребуется в среднем " + averageValue + " день");

        //Задача8
        int Masha = 67760;
        int Denis = 83690;
        int Kristen = 76230;
        double increaseSalaryMasha = Masha * 0.1 + Masha;
        double increaseSalaryDenis = Denis * 0.1 + Denis;
        double increaseSalaryKristen = Kristen * 0.1 + Kristen;
        int annualIncomeMasha = Masha * 12;
        int annualIncomeDenis = Denis * 12;
        int annualIncomeKristen = Kristen * 12;
        double increasedIncomeMasha = increaseSalaryMasha * 12f;
        double increasedIncomeDenis = increaseSalaryDenis * 12f;
        double increasedIncomeKristen = increaseSalaryKristen * 12f;
        double differenceMasha = increasedIncomeMasha - annualIncomeMasha;
        double differenceDenis = increasedIncomeDenis - annualIncomeDenis;
        double differenceKristen = increasedIncomeKristen - annualIncomeKristen;
        System.out.println("Маша теперь получает " + increaseSalaryMasha + " рублей в месяц, а ее годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + increaseSalaryDenis + " рублей в месяц, а его годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + increaseSalaryKristen + " рублей в месяц, а ее годовой доход вырос на " + differenceKristen + " рублей");


        byte bad = 4;





















    }
}