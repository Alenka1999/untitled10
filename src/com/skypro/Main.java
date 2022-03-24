package com.skypro;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        int [] mas = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        System.out.println("Сумма трат за месяц составила "+ sum + " рублей");
        // Задача 2
        int min = mas[0];
        int max = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i]<min)
                min = mas[i];
            if (mas[i]>max)
                max = mas[i];
        }
        System.out.println("Минимальная сумма трат за месяц составила "+min+" рублей. Максимальная сумма трат за месяц составила "+max+" рублей");
        // Задача 3
        float sr = 0;
        sr =(float) sum/mas.length;
        System.out.println("Средняя сумма трат за месяц составила "+sr+" рублей");
        // Задача 4
        char[] reverseFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};
        for (int i = reverseFullName.length - 1; i >= 0;i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }
}
