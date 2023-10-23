package p3;

public class Main {

    public static void main(String[] args) {
        System.out.println(fact1(3));
        System.out.println(factRecurs(3));
    }

    public static int fact1(int n){
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static int factRecurs(int n){
        int res = 1;
        if (n==1 || n == 0){
            return res;
        }
        res = n * factRecurs(n-1);
        return res;
    }

}
