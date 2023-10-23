package dz4_2;
/*
* Задача по массиву: Дан одномерный массив из 50 элементов.
* Массив заполнен числами от -50 до 50. Найти количество отрицательных элементов,
* количество положительных элементов, количество нулей.
* Найти сумму всех положительных элементов и отрицательных элементов отдельно.
* Найти среднее по массиву.
* Массив можно заполнить случайными числами без использования ручного ввода,
* подумайте + погуглите, как это сделать.
* */


public class Main {
    public static void main(String[] args) {
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*101-50);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int sum = 0;
        int sumPoz = 0;
        int sumNeg = 0;
        int countZero = 0;
        int countPoz = 0;
        int countNeg = 0;
        for(int el:array){
            sum += el;
            if (el>0){
                sumPoz += el;
                countPoz++;
            }else if (el<0){
                sumNeg += el;
                countNeg++;
            }else{
                countZero++;
            }
        }

        System.out.println("Count zero = " + countZero);
        System.out.println("Count pozitive = " + countPoz);
        System.out.println("Count negativ = " + countNeg);
        System.out.println("Sum pozitiv = " + sumPoz);
        System.out.println("Sum negativ = " + sumNeg);
        System.out.println("Average = " + (sum/array.length));
    }
}
