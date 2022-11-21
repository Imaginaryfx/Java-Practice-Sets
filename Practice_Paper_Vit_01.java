import java.util.Scanner;

public class Practice_Paper_Vit_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

/* Q.01 - A student will not be allowed to sit in exam if his/her attendance is less than 75%
          Take following input from user such as Number of classes held, Number of classes attended and also student medical proof availability [1(for Yes)/0(for No)].
          Display percentage of class attended and eligibility detail (Allowed/Not Allowed) for exam. If student is having less than 75% but having medical proof, he/she is 'Allowed' for exam,
          otherwise 'Not Allowed'. */

        System.out.print("Number Of Classes Held By College In One Year :- ");              // - My Solution
        int held = sc.nextInt();
        System.out.print("Number Of Classes Attended :- ");
        int attend = sc.nextInt();
        System.out.print("Do You Have Medical Proof, Press [1(for Yes)/0(for No)] :- ");
        int proof = sc.nextInt();
        if (proof == 1) {
            System.out.println("You Are Allowed To Sit In The Exam.");
        }
        else if (proof == 0) {
            int percentage = attend*100/held;
            if (percentage>=75) {
                System.out.println("You Are Allowed To Sit In The Exam.");
            }
            else {
                System.out.println("You Got - " + percentage + "% You Are Not Allowed To Sit In The Exam.");
            }
        }


/* Q.02 - Petrol is collected for Indian Oil Corporation for sales form nearest 'n' storage points to the Collection point. Given the amount of petrol from 'n' storage point in liters(L)
          milli liter (mL), Write a java code to compute the total quantity of oil in the collection point. */

        System.out.print("From How Many Storage Points, Oil Is Being Collected :- ");               // - My Solution
        int storagePoints = sc.nextInt();
        int sum = 0;
        int sum1 = 0;
        for (int t = 1; t <= storagePoints; t++) {
            System.out.print("Oil Collected from this storage point in Litres - ");
            int quntL = sc.nextInt();
            System.out.print("Oil Collected from this storage point in Millilitres - ");
            int quntmL = sc.nextInt();
            sum += quntL;
            sum1 += quntmL;
        }
        if (sum1 < 1000) {
            System.out.println("Total Litres Of Oil Collected = " + sum + "L " + sum1 + "mL");
        }
        else {
            int i = sum+1;
            int j = sum1-1000;
            System.out.print("Total Litres Of Oil Collected = " + i + "L " + j + "mL");
        }


/* Q.03 - Calculate the toll charge, by considering kilometers travelled by vehicle. Display the toll charge of the two-wheeler to be paid as per below.
          Kilometers travelled               Charge
               >1000KM                          0
              >=10000KM                         50
              >=20000KM                         150
              >=40000KM                         250
              >=60000KM                         350
              >60000KM                          500 */

        System.out.print("Kilometers Travelled :- ");            // - My Solution
        long KmTr = sc.nextLong();
        if (KmTr <= 1000) {
            System.out.println("Toll Charge - 0");
        }
        else if (KmTr <= 10000) {
            System.out.println("Toll Charge - 50");
        }
        else if (KmTr <= 20000) {
            System.out.println("Toll Charge - 150");
        }
        else if (KmTr <= 40000) {
            System.out.println("Toll Charge - 250");
        }
        else if (KmTr <= 60000) {
            System.out.println("Toll Charge - 350");
        }
        else if (KmTr > 60000) {
            System.out.println("Toll Charge - 500");
        }
    }
}
