public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Решение задачи 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }

        //Задача 2
        System.out.println("Решение задачи 2");
        int temperature = 6;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        }
        //Задача 3
        System.out.println("Решение задачи 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то  придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно.");
        }

        //Задача 4
        System.out.println("Решение задачи 4");
        int age2 = 25;
        if (age2 >=2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад.");
        } else if (age2 >= 7 && age2 < 18) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу.");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то его место в университете.");
        } else {
            System.out.println("Если возраст человека равен " + age2 + ", то ему пора ходить на работу.");
        }

        //Задача 5
        System.out.println("Решение задачи 5");
        int age3 = 11;
        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то он не может кататься на аттракционе.");
        } else if (age3 >= 5 && age3 <= 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Если возраст ребенка равен " + age3 + ", то он может кататься без сопровождения взрослого.");
        }

        //Задача 6
        System.out.println("Решение задачи 6");
        int numberOfPassenger = 110;
        if (numberOfPassenger < 60) {
            System.out.println("В вагоне есть сидячее место.");
        } else if (numberOfPassenger > 60 && numberOfPassenger < 102) {
            System.out.println("В вагоне есть стоячее место.");
        } else {
            System.out.println("Увы, никаких мест нет.");
        }

        //Задача 7
        System.out.println("Решение задачи 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two) {
            if (one > three) {
                System.out.println("Наибольшее число: " + one);
            }
        } else if (two > three) {
                System.out.println("Наибольшее число: " + two);
        } else
            System.out.println("Наибольшее число: " + three);

    }
}