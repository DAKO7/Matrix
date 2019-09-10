package Koroljov.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char operator;

        Scanner scan0object = new Scanner(System.in);

        int[][] nums = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };


        int[][] nums2 = new int[][]
                {
                        {9, 8, 7},
                        {4, 5, 6},
                        {7, 8, 9}
                };


        System.out.printf("\n|\t%d\t%d\t%d\t|\t\t|\t%d\t%d\t%d\t|", nums[0][0], nums[0][1], nums[0][2], nums2[0][0], nums2[0][1], nums2[0][2]);
        System.out.printf("\n|\t%d\t%d\t%d\t|\t?\t|\t%d\t%d\t%d\t|", nums[1][0], nums[1][1], nums[1][2], nums2[1][0], nums2[1][1], nums2[1][2]);
        System.out.printf("\n|\t%d\t%d\t%d\t|\t\t|\t%d\t%d\t%d\t|", nums[2][0], nums[2][1], nums[2][2], nums2[2][0], nums2[2][1], nums2[2][2]);

        System.out.println("\nWhat operation? + - *");
        operator = scan0object.next().charAt(0);

        int answer = 0;
        switch (operator)
        {
            case '+' : for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    answer = answer + (nums[i][j] + nums2[i][j]);
                    System.out.print(answer+"\t");
                }

                System.out.println();
            }
                break;

            case '-': for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    System.out.print(nums[i][j] - nums2[i][j]+"\t");
                }
                System.out.println();
            }
                break;

            case '*': for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    System.out.print(nums[i][j] * nums2[i][j]+"\t");
                }
                System.out.println();
            }
                break;
        }
        //System.out.println(nums+" "+operator+" "+nums2+" = "+answer);
    }
}



//switch (operator)
//        {
//        case "+": for (int i = 0; i < nums.length; i++) {
//        for (int j = 0; j < nums[i].length; j++) {
//        System.out.printf("%d", nums[i][j] + nums2[i][j]);
//        }
//        System.out.println();
//        }
//        break;
//
//        case "+": for (int i = 0; i < nums.length; i++) {
//        for (int j = 0; j < nums[i].length; j++) {
//        System.out.printf("%d", nums[i][j] - nums2[i][j]);
//        }
//        System.out.println();
//        }
//        break;
//
//        case "+": for (int i = 0; i < nums.length; i++) {
//        for (int j = 0; j < nums[i].length; j++) {
//        System.out.printf("%d", nums[i][j] * nums2[i][j]);
//        }
//        System.out.println();
//        }
//        break;
//
//        case "+": for (int i = 0; i < nums.length; i++) {
//        for (int j = 0; j < nums[i].length; j++) {
//        System.out.printf("%d", nums[i][j] / nums2[i][j]);
//        }
//        System.out.println();
//        }
//        break;
//        }