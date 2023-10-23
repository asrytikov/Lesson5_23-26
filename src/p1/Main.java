package p1;

public class Main {

    public static void main(String[] args) {
        int[] mas = {1,2,3,4};

        int[][] mas2 = new int[3][3];
        for (int i = 0; i < mas2.length; i++) {
            for (int j = 0; j < mas2[i].length; j++) {
                mas2[i][j] = (int)(Math.random()*100);
            }
        }

        for (int i = 0; i < mas2.length; i++) {

            for (int j = 0; j < mas2[i].length; j++) {
                System.out.print(mas2[i][j] + " ");
            }

            System.out.println();
        }

        int[][] numbers = {
                {1,2,3},
                {4,5},
                {7}
        };


    }
}
