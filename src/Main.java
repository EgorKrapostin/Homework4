public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1(){
        System.out.println("Задача 1:");

        int age = 22;

        if (age > 18){
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2(){
        System.out.println("Задача 2:");

        int temperatureOutside = -12;

        if( temperatureOutside < 5){
            System.out.println("На улице " + temperatureOutside + " градусов, нужно надеть шапку");
        }else {
            System.out.println("На улице " + temperatureOutside + " градусов, можно идти без шапки");
        }
    }
    public static void task3(){
        System.out.println("Задача 3:");

        int speed = 120;

        if (speed > 60){
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else{
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }
    }
    public static void task4(){
        System.out.println("Задача 4:");

        int age = 22;
        boolean canGoToKindergarten = age <= 2 || age <= 6;
        boolean canGoToSchool = age <= 7 || age <= 18;
        boolean canGoToUniversity = age >= 18 || age <= 24;

        if(canGoToKindergarten){
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        }
        if(canGoToSchool){
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        }
        if(canGoToUniversity){
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
        }else {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
        }
    }
    public static void task5(){
        System.out.println("Задача 5:");

        int age = 13;
        boolean cantGoToAttraction = age < 5;
        boolean cantGoToAttractionAlone = age > 5 || age < 14;

        if(cantGoToAttraction){
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься на аттракционе");
        }
        if (cantGoToAttractionAlone){
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься на аттракционе одному");
        }else {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься на аттракционе");
        }
    }
    public static void task6(){
        System.out.println("Задача 6:");

        int wagonCapacity = 102;
        int wagonSitPlaces = 60;
        int passagers = 88;

        if(passagers < wagonSitPlaces){
            System.out.println("В вагоне есть сидячие места");
        }
        if (passagers > wagonSitPlaces){
            System.out.println("В вагоне нет сидячих мест");
        }if (passagers == wagonCapacity){
            System.out.println("Вагон полон");
        }else {
            System.out.println("В вагоне больше нет мест");
        }
    }
    public static void task7(){
        System.out.println("Задача 7:");
        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three){
            System.out.println(one);
        }
        if (two > one && two > three){
            System.out.println(two);
        }else {
            System.out.println(three);
        }
    }
}