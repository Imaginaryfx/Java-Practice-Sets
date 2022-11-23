package Practice_Sets;
import java.util.Scanner;

public class Practice_Paper_Vit_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

                                        //--- RUN 1 QUESTION AT A TIME ---//

/*
   Q.01 - A student will not be allowed to sit in exam if his/her attendance is less than 75% Take following input from
          user such as Number of classes held, Number of classes attended and also  student medical proof availability
          [1(for Yes)/0(for No)].
          Display percentage of class attended and eligibility detail (Allowed/Not Allowed) for exam. If student is
          having less than 75% but having medical proof, he/she is 'Allowed' for exam, otherwise 'Not Allowed'.
*/

          System.out.print("Number Of Classes Held By College In One Year :- ");                       // - My Solution
          int held = sc.nextInt();
          System.out.print("Number Of Classes Attended :- ");
          int attend = sc.nextInt();
          System.out.
          print("Do You Have Medical Proof, Press [1(for Yes)/0(for No)] :- ");
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

/*
   Q.02 - Petrol is collected for Indian Oil Corporation for sales form nearest 'n' storage points to the Collection
          point. Given the amount of petrol from 'n' storage point in liters(L) milli liter (mL), Write a java code to
          compute the total quantity of oil in the collection point.
*/

        System.out.print("From How Many Storage Points, Oil Is Being Collected - ");                   // - My Solution
        int storagePoints = sc.nextInt();

        int sum = 0;
        int sum1 = 0;

        for (int t = 0; t < storagePoints; t++) {
            System.out.println("How Much Oil Is Collected In Litres & Millilitres Respectively - ");
            System.out.print("l - ");
            int quntL = sc.nextInt();
            System.out.print("ml - ");
            int quntmL = sc.nextInt();

            sum += quntL;
            sum1 += quntmL;
        }
        if (sum1 < 1000) {
            System.out.println("Total Oil Collected = " + sum + "L " + sum1 + "mL");
        }
        else {
            int mli = sum1/1000;
            int mli2 = sum + mli;
            int mli3 = sum1 - mli * 1000;
            System.out.println("Total Oil Collected = " + mli2 + "L " + mli3 + "mL");
        }

/*
   Q.03 - Calculate the toll charge, by considering kilometers travelled by vehicle. Display the toll charge of the
          two-wheeler to be paid as per below.
          Kilometers travelled    |    Charge
               >1000KM                   0
              >=10000KM                 50
              >=20000KM                150
              >=40000KM                250
              >=60000KM                350
              >60000KM                 500
*/

          System.out.print("Kilometers Travelled :- ");                                                // - My Solution
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
          else {
              System.out.println("Toll Charge - 500");
          }

/*
   Q.04 - Create a java program to get the 'n' (number of times) the earthquake has occurred and print the number of
          times in which the magnitude was low , medium and high. The magnitude value is given in microns. If the value
          is less than 5.4 (inclusive) in microns then it is low, 5.4 to 7.0 (inclusive) it is medium and more than 7.0
          it is high.
          Also, if the number of times recorded is Zero, display as "No earthquake predicted" and if the number of times
          recorded is negative, display as "Invalid Input"
*/

        int summg = 0;
        int summg1 = 0;
        int summg2 = 0;

        System.out.print("How many no. of times the earthquake had occurred -> ");                     // - My Solution
        int oc = sc.nextInt();

        if (oc < 0) {
            System.out.println("!! Invalid Input !!");
        }
        else if (oc == 0) {
            System.out.println("No earthquake predicted.");
        }
        else {
            for (int i = 0; i < oc; i++) {
                System.out.print("Of what magnitude was the earthquake (in microns) -> ");
                float mg = sc.nextFloat();

                if (mg > 7.0f) {
                    summg += 1;
                }
                else if (mg >= 5.4f) {
                    summg1 += 1;
                }
                else {
                    summg2 += 1;
                }
            }
            System.out.println("Magnitude of the earthquake is high " + summg + " times.");
            System.out.println("Magnitude of the earthquake is medium " + summg1 + " times.");
            System.out.println("Magnitude of the earthquake is low " + summg2 + " times.");
        }
    }
}
