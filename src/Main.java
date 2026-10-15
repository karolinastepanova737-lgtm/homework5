public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int age1 = 17;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age1 + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задача 2");
        int temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }

        System.out.println("Задача 3");
        int speed = 75;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }

        System.out.println("Задача 4");
        int age4 = 15;
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад.");
        } else if (age4 >= 7 && age4 <= 17) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу.");
        } else if (age4 >= 18 && age4 <= 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то его место в университете.");
        } else if (age4 > 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему пора ходить на работу.");
        } else {
            System.out.println("Если возраст человека равен " + age4 + ", то он еще слишком мал для учебы или работы.");
        }

        System.out.println("Задача 5");
        int childAge = 12;
        boolean hasAdult = true;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
        } else if (childAge >= 5 && childAge <= 14) {
            if (hasAdult) {
                System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
            } else {
                System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе без сопровождения взрослого.");
            }
        } else if (childAge > 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься на аттракционе без сопровождения взрослого.");
        }

        System.out.println("Задача 6");
        int totalCapacity = 102;
        int seatingCapacity = 60;
        int currentPassengers = 85;
        if (currentPassengers < seatingCapacity) {
            System.out.println("В вагоне есть места. Ваше место — сидячее.");
        } else if (currentPassengers >= seatingCapacity && currentPassengers < totalCapacity) {
            System.out.println("В вагоне есть места. Ваше место — стоячее.");
        } else if (currentPassengers >= totalCapacity) {
            System.out.println("Вагон уже полностью забит.");
        }

        System.out.println("Задача 7");
        int one = 10;
        int two = 25;
        int three = 15;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}