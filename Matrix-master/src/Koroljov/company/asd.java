package Koroljov.company;
import java.util.Scanner;

public class asd {

        public static void main(String[] args) {
                Scanner entry=new Scanner(System.in);
                System.out.print("Выберите действие: 1-Сложение 2-Вычитание 3-Умножение \n");
                int otvet = entry.nextInt();
                if(otvet==1)
                {
                        System.out.print("Введите значения для первой матрицы\n");
                        int num1 = entry.nextInt();
                        int num2 = entry.nextInt();
                        int num3 = entry.nextInt();
                        int num4 = entry.nextInt();
                        int num5 = entry.nextInt();
                        int num6 = entry.nextInt();
                        int num7 = entry.nextInt();
                        int num8 = entry.nextInt();
                        int num9 = entry.nextInt();
                        int[][] nums = new int[][]
                                {
                                        {num1, num2, num3},
                                        {num4, num5, num6},
                                        {num7, num8, num9}
                                };
                        for (int i = 0; i < nums.length; i++) {
                                for (int j = 0; j < nums[i].length; j++) {
                                        System.out.printf("%d ", nums[i][j]);
                                }
                                System.out.println();
                        }
                        System.out.print("Введите значения для второй матрицы\n");
                        int num11 = entry.nextInt();
                        int num22 = entry.nextInt();
                        int num33 = entry.nextInt();
                        int num44 = entry.nextInt();
                        int num55 = entry.nextInt();
                        int num66 = entry.nextInt();
                        int num77= entry.nextInt();
                        int num88 = entry.nextInt();
                        int num99 = entry.nextInt();
                        int[][] nums2 = new int[][]
                                {
                                        {num11, num22, num33},
                                        {num44, num55, num66},
                                        {num77, num88, num99}
                                };
                        for (int i = 0; i < nums2.length; i++) {
                                for (int j = 0; j < nums2[i].length; j++) {
                                        System.out.printf("%d ", nums2[i][j]);
                                }
                                System.out.println();
                        }
                        System.out.println("Ответ равен:");
                        int[][] otveti = new int[][]
                                {
                                        {num1+num11, num2+num22, num3+num33},
                                        {num4+num44, num5+num55, num6+num66},
                                        {num7+num77, num8+num88, num9+num99}
                                };
                        for (int i = 0; i < otveti.length; i++) {
                                for (int j = 0; j < otveti[i].length; j++) {
                                        System.out.printf("%d ", otveti[i][j]);
                                }
                                System.out.println();
                        }

                }
                else if(otvet==2){
                        System.out.print("Введите значения для первой матрицы\n");
                        int num1 = entry.nextInt();
                        int num2 = entry.nextInt();
                        int num3 = entry.nextInt();
                        int num4 = entry.nextInt();
                        int num5 = entry.nextInt();
                        int num6 = entry.nextInt();
                        int num7 = entry.nextInt();
                        int num8 = entry.nextInt();
                        int num9 = entry.nextInt();
                        int[][] nums = new int[][]
                                {
                                        {num1, num2, num3},
                                        {num4, num5, num6},
                                        {num7, num8, num9}
                                };
                        for (int i = 0; i < nums.length; i++) {
                                for (int j = 0; j < nums[i].length; j++) {
                                        System.out.printf("%d ", nums[i][j]);
                                }
                                System.out.println();
                        }
                        System.out.print("Введите значения для второй матрицы\n");
                        int num11 = entry.nextInt();
                        int num22 = entry.nextInt();
                        int num33 = entry.nextInt();
                        int num44 = entry.nextInt();
                        int num55 = entry.nextInt();
                        int num66 = entry.nextInt();
                        int num77= entry.nextInt();
                        int num88 = entry.nextInt();
                        int num99 = entry.nextInt();
                        int[][] nums2 = new int[][]
                                {
                                        {num11, num22, num33},
                                        {num44, num55, num66},
                                        {num77, num88, num99}
                                };
                        for (int i = 0; i < nums2.length; i++) {
                                for (int j = 0; j < nums2[i].length; j++) {
                                        System.out.printf("%d ", nums2[i][j]);
                                }
                                System.out.println();
                        }
                        System.out.println("Ответ равен:");
                        int[][] otveti = new int[][]
                                {
                                        {num1-num11, num2-num22, num3-num33},
                                        {num4-num44, num5-num55, num6-num66},
                                        {num7-num77, num8-num88, num9-num99}
                                };
                        for (int i = 0; i < otveti.length; i++) {
                                for (int j = 0; j < otveti[i].length; j++) {
                                        System.out.printf("%d ", otveti[i][j]);
                                }
                                System.out.println();
                        }
                }
                else if(otvet==3){
                        System.out.print("Введите значения для первой матрицы\n");
                        int num1 = entry.nextInt();
                        int num2 = entry.nextInt();
                        int num3 = entry.nextInt();
                        int num4 = entry.nextInt();
                        int num5 = entry.nextInt();
                        int num6 = entry.nextInt();
                        int num7 = entry.nextInt();
                        int num8 = entry.nextInt();
                        int num9 = entry.nextInt();
                        int[][] nums = new int[][]
                                {
                                        {num1, num2, num3},
                                        {num4, num5, num6},
                                        {num7, num8, num9}
                                };
                        for (int i = 0; i < nums.length; i++) {
                                for (int j = 0; j < nums[i].length; j++) {
                                        System.out.printf("%d ", nums[i][j]);
                                }
                                System.out.println();
                        }

                        System.out.print("Введите значения для второй матрицы\n");
                        int num11 = entry.nextInt();
                        int num22 = entry.nextInt();
                        int num33 = entry.nextInt();
                        int num44 = entry.nextInt();
                        int num55 = entry.nextInt();
                        int num66 = entry.nextInt();
                        int num77= entry.nextInt();
                        int num88 = entry.nextInt();
                        int num99 = entry.nextInt();
                        int[][] nums2 = new int[][]
                                {
                                        {num11, num22, num33},
                                        {num44, num55, num66},
                                        {num77, num88, num99}
                                };
                        for (int i = 0; i < nums2.length; i++) {
                                for (int j = 0; j < nums2[i].length; j++) {
                                        System.out.printf("%d ", nums2[i][j]);
                                }
                                System.out.println();
                        }
                        System.out.println("Ответ равен:");
                        int[][] otveti = new int[][]
                                {
                                        {num1*num11+num2*num44+num3*num77, num1*num22+num2*num55+num3*num88, num1*num33+num2*num66+num3},
                                        {num4*num11+num5*num44+num6*num77, num4*num22+num5*num55+num6*num88, num4*num33+num5*num66+num6*num99},
                                        {num7*num11+num8*num44+num9*num77, num7*num22+num8*num55+num9*num88, num7*num33+num8*num66+num9*num99}
                                };
                        for (int i = 0; i < otveti.length; i++) {
                                for (int j = 0; j < otveti[i].length; j++) {
                                        System.out.printf("%d ", otveti[i][j]);
                                }
                                System.out.println();
                        }
                }
        }
}
