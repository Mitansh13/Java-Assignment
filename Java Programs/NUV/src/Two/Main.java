//Write a program which inputs a number. Display that number in word format.
//        Eg.
//        459 – Four Five Nine
//        7091 – Seven Zero Nine One
//        26 - Two Six

package Two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = in.nextInt();

        String str1 = Integer.toString(num);

        char[] ch = new char[str1.length()];

        for (int i = 0; i < str1.length(); i++) {
            ch[i] = str1.charAt(i);
        }
        Display obj = new Display();
        obj.Convert(ch, str1,num);
    }

    static class Display {
        void Convert(char[] ch, String srt1,int num) {
            System.out.print(num+" : ");
            try {
                for (int i = 0; i <= srt1.length(); i++) {
                    if (ch[i] == '0') {
                        System.out.print("Zero ");
                    } else if (ch[i] == '1') {
                        System.out.print("One ");
                    } else if (ch[i] == '2') {
                        System.out.print("Two ");
                    } else if (ch[i] == '3') {
                        System.out.print("Three ");
                    } else if (ch[i] == '4') {
                        System.out.print("Four ");
                    } else if (ch[i] == '5') {
                        System.out.print("Five ");
                    } else if (ch[i] == '6') {
                        System.out.print("Six ");
                    } else if (ch[i] == '7') {
                        System.out.print("Seven ");
                    } else if (ch[i] == '8') {
                        System.out.print("Eight ");
                    } else if (ch[i] == '9') {
                        System.out.print("Nine ");
                    }
                }
            }
            catch (Exception ex){

            }

        }
    }
}


