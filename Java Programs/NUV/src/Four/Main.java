//Write a Java Program to accept data from keyboard. Remove duplicates elements from an
//        array.
package Four;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of integers: ");
        int n = in.nextInt();
//        System.out.println("Enter number of Strings: ");
//        int x = in.nextInt();


        System.out.println("Enter Your Numbers: ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        RemoveInt(arr);

//        System.out.println("Enter Your Strings: ");
//        String word[] = new String[x];
//        for (int i=0;i<word.length;i++)
//        {
//            word[i] = in.next();
//        }

    }

    static int[] remove(int[] arr, int i) {
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int j = 0, k = 0; j < arr.length; j++) {

            // if the index is
            // the removal element index
            if (j == i) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[j];
        }

        // return the resultant array
        return anotherArray;
    }

    static void RemoveInt(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr = remove(arr, j);
                }
            }
        }
        for (int k : arr ){
            System.out.print(k + " ");
        }
    }
}


