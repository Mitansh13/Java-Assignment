//Write a program in Java to input n elements from keyboard. Store it to an array and sort in
//        ascending or descending order as per user preference.

package Three;

import java.lang.reflect.Array;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.reverse;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements you want: ");
        int n = in.nextInt();
        int arr[] = new int[n];
            try {
                System.out.println("Enter "+n+" Number: ");
                for (int i = 0; i < n; i++) {
                    arr[i] = in.nextInt();
                }
            }
            catch (Exception e){

            }
        Convert obj = new Convert();
         obj.sort(arr,n);

        }
    }
    class Convert {

        void sort(int[] arr, int n) {
            Scanner in = new Scanner(System.in);
            Arrays.sort(arr);
            System.out.println("If You want Inverted array- Type yes: ");
            String x = in.next();
            if (x.matches("yes")) {
                System.out.println("\nThe Reversed array is: ");
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                System.out.println("\nThe sorted array is: ");
                for (int num : arr) {
                    System.out.print(num + " ");
                }
            }

        }
    }

