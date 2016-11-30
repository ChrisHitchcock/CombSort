/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combtest;

/**
 *
 * @author chhit5249
 */
public class CombTest {
    static int loops = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Array Declaration
        int[] nums = new int[]{151, 54, 89, 42, 12, 8, 7, 6, 5, 4, 2, 2, 1};
        
        //Output
        System.out.println("Original Array:");
        for (int a = 0; a < nums.length; a++) {
            System.out.print(nums[a] + " ");
        }
        System.out.println("\n--------------------------------\nSteps of Sorting: ");
        sort(nums);
        System.out.println("--------------------------------\nSorted Array:");
        for (int a = 0; a < nums.length; a++) {
            System.out.print(nums[a] + " ");
        }
    }

    public static void sort(int[] input) {
        int gap = input.length;
        boolean swapped = true;
        int loops = 0;
        while (gap > 1 || swapped) {
            for (int a = 0; a < input.length; a++) {
                System.out.print(input[a] + " ");
            }
            System.out.println("\t" + loops);
            if (gap > 1) {
                gap = (int) (gap / 1.3);
            }
            swapped = false;
            for (int i = 0; i + gap < input.length; i++) {

                if (input[i] > input[i + gap]) {
                    int t = input[i];
                    input[i] = input[i + gap];
                    input[i + gap] = t;
                    swapped = true;
                    loops += 1;
                } else {
                    loops += 1;
                }
            }
        }
    }

}
