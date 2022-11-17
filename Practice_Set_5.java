package Practice_Sets;

public class Practice_Set_5 {
    public static void main(String[] args) {


        //--RUN ONE QUESTION AT A TIME.


        //Q.01 - Draw this Pattern ****
        //                         ***
        //                         **
        //                         *

        int i;                                     // - my solution
        for (i = 4; i > 0; i--) {

            if (i==4) {
                System.out.println("* * * *");
            }
            else if (i==3) {
                System.out.println("* * *");
            }
            else if (i==2) {
                System.out.println("* *");
            }
            else {
                System.out.println("*");
            }
        }

        int m = 4;                                // - Solution by Harry
        for (int n = m; n > 0; n--) {
            for (int p = 0; p < n; p++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //Q.02 - Sum of first n even numbers.

        System.out.println("Printing First 10 Even Numbers :-");          // - My Solution
        int y = 10;
        int x = 1;
        while (x <= y) {
            System.out.println(2*x);
            x++;
        }

        int sum = 0;                  // - Solution by Harry
        int i = 10;
        int j = 1;
        while (j<=i) {
            sum = sum + (2*j);
            j++;
        }
        System.out.print("Sum of all even numbers : ");
        System.out.println(sum);

        //Q.03 - Print multiplication Table of given number (t1)}

        int t1 = 2;                              // - My Solution
        for (int m1 = 1; m1 <= 10; m1++) {
            System.out.println(t1*m1);
            //--OR--//
            System.out.printf("%d X %d = %d\n", t1, m1, t1*m1);    // - Solution by Harry
        }

        //Q.04 - Print multiplication table of 10 in reverse.

        int c1 = 10;                           // - My Solution
        for (int d1 = 10; d1 >=1; d1--) {
            System.out.println(c1*d1);
        }

        //Q.05 - Find factorial of a given no. using for loop.

        int qi = 5;                              // - My Solution
        int mltply = 1;
        for (int pi = 1; qi >= pi; qi--) {
            mltply = mltply * (qi * pi);
        }
        System.out.print("Factorial of given number (qi) is :- ");
        System.out.println(mltply);

        //Q.6 - Repeat 5 using while loop.

        int z = 5;                  // - My Solution
        while (z==z) {
            System.out.println(z);
        }

        //Q.07 - Repeat 3 using for loop.

        for (int u = 3; u == u;) {
            System.out.println(u);
        }

        //Q.08 - What can be done using one type of loop can also be done using the other two types of loops.(T/F)

        // ans - True

        //Q.09 - Write a program to calculate the sum of the numbers Occurring in the multiplication table of 8.

        int i9 = 8;                                // - My Solution
        int sum = 0;
        for (int k3 = 1; k3 <= 10; k3++) {
            sum = sum + (i9*k3);   //--OR--//   sum += (i9*k3);
        }
        System.out.print("Sum Of The Numbers Occurring In The Multiplication Table Of 8 Is :- ");
        System.out.println(sum);

        //Q.10 - A Do while loop is executed.

        // ans - At least once
    }
}
