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
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };


        System.out.printf("\n|\t%d\t%d\t%d\t|\t\t|\t%d\t%d\t%d\t|", nums[0][0], nums[0][1], nums[0][2], nums2[0][0], nums2[0][1], nums2[0][2]);
        System.out.printf("\n|\t%d\t%d\t%d\t|\t?\t|\t%d\t%d\t%d\t|", nums[1][0], nums[1][1], nums[1][2], nums2[1][0], nums2[1][1], nums2[1][2]);
        System.out.printf("\n|\t%d\t%d\t%d\t|\t\t|\t%d\t%d\t%d\t|", nums[2][0], nums[2][1], nums[2][2], nums2[2][0], nums2[2][1], nums2[2][2]);

        System.out.println("\nWhat operation? + - *");
        operator = scan0object.next().charAt(0);

        int answer = 0;
        switch (operator) {
            case '+':
                for (int i = 0; i < nums.length; i++) {
                    for (int j = 0; j < nums[i].length; j++) {
                        answer = answer + (nums[i][j] + nums2[i][j]);
                        System.out.print(answer + "\t");
                    }

                    System.out.println();
                }
                break;

            case '-':
                for (int i = 0; i < nums.length; i++) {
                    for (int j = 0; j < nums[i].length; j++) {
                        System.out.print(nums[i][j] - nums2[i][j] + "\t");
                    }
                    System.out.println();
                }
                break;

            case '*': {
                        int ans1 = 0;
                        int ans2 = 0;
                        int ans3 = 0;
                        int ans4 = 0;
                        int ans5 = 0;
                        int ans6 = 0;
                        int ans7 = 0;
                        int ans8 = 0;
                        int ans9 = 0;

                        //System.out.print(nums[i][j] * nums2[i][j] + "\t");

                        ans1 = ((nums[0][0] * nums2[0][0]) + (nums[0][1] * nums2[1][0]) + (nums[0][2] * nums2[2][0]));
                        ans2 = ((nums[0][0] * nums2[0][1]) + (nums[0][1] * nums2[1][1]) + (nums[0][2] * nums2[2][1]));
                        ans3 = ((nums[0][0] * nums2[0][2]) + (nums[0][1] * nums2[1][2]) + (nums[0][2] * nums2[2][2]));

                        ans4 = ((nums[1][0] * nums2[0][0]) + (nums[1][1] * nums2[1][0]) + (nums[1][2] * nums2[2][0]));
                        ans5 = ((nums[1][0] * nums2[0][1]) + (nums[1][1] * nums2[1][1]) + (nums[1][2] * nums2[2][1]));
                        ans6 = ((nums[1][0] * nums2[0][2]) + (nums[1][1] * nums2[1][2]) + (nums[1][2] * nums2[2][2]));

                        ans7 = ((nums[2][0] * nums2[0][0]) + (nums[2][1] * nums2[1][0]) + (nums[2][2] * nums2[2][0]));
                        ans8 = ((nums[2][0] * nums2[0][1]) + (nums[2][1] * nums2[1][1]) + (nums[2][2] * nums2[2][1]));
                        ans9 = ((nums[2][0] * nums2[0][2]) + (nums[2][1] * nums2[1][2]) + (nums[2][2] * nums2[2][2]));

                        if (ans1 == ans1){
                        System.out.printf("\n|\t%d\t%d\t%d\t|\t \n|\t%d\t%d\t%d\t|\t \n|\t%d\t%d\t%d\t|\t", ans1, ans2, ans3, ans4, ans5, ans6, ans7, ans8, ans9);
                        break;
                        }
                        break;
            }
        }
    }
}