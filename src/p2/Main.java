package p2;

public class Main {

    public static void main(String[] args) {
        String test = test();
        superTest();
        superTest();
        int a = sum(10, 20);
        int b = sum(a, 12);
        System.out.println(b);
        int[] ar = {1,2,3};
        sums("Array", ar);
        System.out.println(dayTime(15));
        dayTime("test", 10);
    }

    public static String test(){
        return "";
    }

    public static void superTest(){
        System.out.println("Super");
    }

    public static int sum(int x, int y){
        int z = x + y;
        System.out.println(z);
        return z;
    }

    public static void sums(String message, int ...nums){
        int sum = 0;
        for (int el:nums){
            sum += el;
        }
        System.out.println(message + " " + sum);
    }

    static String dayTime(int hour){
        if ((hour>24) || (hour<0)) return "ERROR";
        else if (hour >6 && hour<11) return "Morning";
        else return "I dont know";
    }

    static String dayTime(short hour){
        if ((hour>24) || (hour<0)) return "ERROR";
        else if (hour >6 && hour<11) return "Morning";
        else return "I dont know";
    }

    static void dayTime(String mes, int hour){
        if ((hour>24) || (hour<0)) return;
        else if (hour >6 && hour<11) System.out.println("Morning");
        else System.out.println("I dont know");
    }
}
