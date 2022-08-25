public class Main {
    public static void main(String[] args) {
        byte one = 124;
        short two = -1554;
        int three = 4;
        long four = 34L;
        float five = 64.902f;
        double six = 344.23;
        System.out.println("Значение переменной one с типом byte равно " + one);
        System.out.println("Значение переменной two с типом short равно " + two);
        System.out.println("Значение переменной three с типом int равно " + three);
        System.out.println("Значение переменной four с типом long равно " + four);
        System.out.println("Значение переменной five с типом float равно " + five);
        System.out.println("Значение переменной six с типом double равно " + six);

        float e21 = 27.12f;
        long e22 = 987_678_965_549L;
        byte e23 = 2;
        short e24 = 786;
        boolean e25 = e24 <= e23;
        int e26 = 569;
        short e27 = -159;
        short e28 = 27897;
        double e29 = 67.0;

        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short sheets = 480;
        int people = lp + as + ea;
        int sheetsOnStudent = sheets / people;
        System.out.println("На каждого ученика рассчитано " + sheetsOnStudent + " листов бумаги");

        byte machine = 16;
        byte speed = 2;
        int bottlesPerMinute = machine / speed;
        int bottlesPer20Minutes = bottlesPerMinute * 20;
        int bottlesPerDay = bottlesPerMinute * 1440;
        int bottlesPer3Days = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerDay * 30;
        System.out.println("За 20 минут машина произведёт " + bottlesPer20Minutes + " штук бутылок");
        System.out.println("За сутки машина произведёт " + bottlesPerDay + " штук бутылок");
        System.out.println("За трое суток машина произведёт " + bottlesPer3Days + " штук бутылок");
        System.out.println("За месяц машина произведёт " + bottlesPerMonth + " штук бутылок");

        byte totalDye = 120;
        byte dyePerRoomWhite = 2;
        byte dyePerRoomBrown = 4;
        int dyePerRoom = dyePerRoomWhite + dyePerRoomBrown;
        int rooms = totalDye / dyePerRoom;
        int dyeWhite = rooms * dyePerRoomWhite;
        int dyeBrown = rooms * dyePerRoomBrown;
        System.out.println("В школе, где " + rooms + " классов, нужно " + dyeWhite + " банок белой краски и " + dyeBrown + " банок коричневой краски.");

        short bananas = 5;
        short milk = 2;
        short iceCream = 2;
        short eggs = 4;
        int bananasWeight = bananas * 80;
        int milkWeight = milk * 105;
        int iceCreamWeight = iceCream * 100;
        int eggsWeight = eggs * 70;
        int productsWeightG = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        float productsWeightKg = productsWeightG /1000f;
        System.out.println("Вес всех продуктов для завтрака - " + productsWeightKg + " кг.");

        byte weightKg = 7;
        short perDaySlow = 250;
        short perDayFast = 500;
        int weightG = weightKg * 1000;
        int weightLossSlow = weightG / perDaySlow;
        int weightLossFast = weightG / perDayFast;
        float perDayAverage = perDaySlow + perDayFast;
        perDayAverage = perDayAverage / 2;
        float weightLossAverage = weightG / perDayAverage;
        System.out.println("Количество дней при медленном похудении - " + weightLossSlow);
        System.out.println("Количество дней при быстром похудении - " + weightLossFast);
        System.out.println("Потребуется дней для похудения в среднем - " + weightLossAverage);

        int masha = 67760;
        int denis = 83690;
        int cristine = 76230;
        float salaryIncreaseMasha = masha * 1.1f;
        float salaryIncreaseDenis = denis * 1.1f;
        float salaryIncreaseCristine = cristine * 1.1f;
        int perYearMashaBefore = masha * 12;
        int perYearDenisBefore = denis * 12;
        int perYearCristineBefore = cristine * 12;
        float perYearMashaAfter = salaryIncreaseMasha * 12;
        float perYearDenisAfter = salaryIncreaseDenis * 12;
        float perYearCristineAfter = salaryIncreaseCristine * 12;
        float differenceMasha = perYearMashaAfter - perYearMashaBefore;
        float differenceDenis = perYearDenisAfter - perYearDenisBefore;
        float differenceCristine = perYearCristineAfter - perYearCristineBefore;
        System.out.println("Маша теперь получает " + salaryIncreaseMasha + " рублей в месяц." + " Годовой доход вырос на " + differenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + salaryIncreaseDenis + " рублей в месяц." + " Годовой доход вырос на " + differenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + salaryIncreaseCristine + " рублей в месяц." + " Годовой доход вырос на " + differenceCristine + " рублей.");





    }
}