package Practice_Sets;
import java.util.Scanner;

public class Practice_Set_02 {
    public static void main(String[] args) {

        //Q.01 - What will be the result of the following expression. float a = 7/4 * 9/2

        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);

        //Q.02 - Write a java program to encrypt a grade by adding 8 to it &
        //         decrypt it to show the correct answer.

        char grade = 'C';
        grade = (char)(grade + 8);
        System.out.println(grade);

        // Decrypt

        grade = (char)(grade - 8);
        System.out.println(grade);

        //Q.03 - Using comparison operators find out weather a given number is
        //       greater than the user entered or not.

        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        System.out.println(p>57);

        //Q.05 - Find the value of (n) in the following expression

        int m = 7;
        int n = (7*49)/7 + (35/7);
        System.out.println(n);
    }
}
