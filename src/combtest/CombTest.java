/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combtest;
import java.util.*;
/**
 * This program tests the comb sort.
 * @author chhit5249
 */
public class CombTest {

    /**
     * Everything happens here.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Array/Variable Declaration
        Random r = new Random();
        int rand, total;
        total = 12;
        int[] nums = new int[total];
        
        //Generate random numbers for the array
        for (int x=0;x<total;x++)
        {
            rand = r.nextInt(512);
            nums[x]=rand;
        }
        
        //Output
        System.out.println("Original Array:");
        for (int a = 0; a < nums.length; a++) {
            System.out.print(nums[a] + " ");
        }
        System.out.println("\n-----------------------------------------------------------------------------"
                + "\nSteps of Sorting:\t\t\t\tComparisons\tLoops\tSwaps");
        long t1 = System.currentTimeMillis();
        sort(nums);
        long time = System.currentTimeMillis()-t1;
        System.out.println("-----------------------------------------------------------------------------"
                + "\nSorted Array:");
        for (int a = 0; a < nums.length; a++) {
            System.out.print(nums[a] + " ");
        }
        System.out.println("\n\nSorting took: "+time+"ms");
       
    }

    /**
     * This method is how the sorting happens <p>
     * pre: called
     * post: array is sorted
     * @param input Array
     */
    public static void sort(int[] input) {
        //Method variable declarations
        int gap = input.length;
        boolean swapped = true;
        int comps = 0;
        int loops = 0;
        int swaps = 0;
        
        //While loop until swapping is finished (i.e. gap <1 or swapped=false)
        while (gap > 1 || swapped) {
            //Stuff for step by step output
            loops++;
            for (int a = 0; a < input.length; a++) {
                System.out.print(input[a] + " ");
            }
            
            //Reduce gap if it is already > 1
            if (gap > 1) {
                gap = (int) (gap / 1.3);
            }
            
            //Set swapped to false so array ends if no swap happens
            swapped = false;
            
            //For loop to go through array and swap via gap.
            for (int i = 0; i + gap < input.length; i++) {
                //Int for number of comparisons
                comps += 1;
                
                //If swap is necessary, swap
                if (input[i] < input[i + gap]) {
                    int t = input[i];
                    input[i] = input[i + gap];
                    input[i + gap] = t;
                    swapped = true;
                    swaps+=1;
                }
            }
            //Format output of number of comparisons, loops, and swaps
            System.out.println("\t" + comps + "\t\t" + loops+"\t"+swaps);
        }
    }

}
