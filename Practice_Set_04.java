package Practice_Sets;
import java.util.Scanner;

public class Practice_Set_04 {
    public static void main(String[] args) {

        //Q.01 - What will be the Output of this program.

        int a = 10;
        if (a == 11) {
            System.out.println("I am 11");
        }
        else {
            System.out.println("I am not 11");
        }

        //Q.02 - Write a program to find out weather a student is Pass or Fail, if it requires total 40%
        //       and at least 33% in each subject to Pass. Assume 3 subjects and take marks as an input from the user.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Marks Below :-");

        float marks1,marks2,marks3;
        int outOf1,outOf2,outOf3;

        System.out.print("1st Subject : ");
        marks1 = sc.nextFloat();
        System.out.print("Out Of - ");
        outOf1 = sc.nextInt();

        System.out.print("2nd Subject : ");
        marks2 = sc.nextFloat();
        System.out.print("Out Of - ");
        outOf2 = sc.nextInt();

        System.out.print("3rd Subject : ");
        marks3 = sc.nextFloat();
        System.out.print("Out Of - ");
        outOf3 = sc.nextInt();

        float sub1percentage = marks1*100/outOf1;
        float sub2percentage = marks2*100/outOf2;
        float sub3percentage = marks3*100/outOf3;

        float totalPercentage = (marks1 + marks2 + marks3)*100/(outOf1 + outOf2 + outOf3);

        System.out.println("Your total Percentage = " + totalPercentage + " %");

        if (totalPercentage>40 && sub1percentage>=33 && sub2percentage>=33 && sub3percentage>=33) {
            System.out.println("You Are Pass!");
        }
        else {
            System.out.println("You Are Fail!");
        }

        //Q.03 - Calculate income tax paid by  an employee to the government as per the slabs mentioned below :-
        //
        //       Income slab         tax
        //       2.5l - 5.0l    -    5%
        //       5.0l - 10.0l   -    10%
        //       Above 10.0l    -    30%
        // There is no tax below 2.5l, Take input amount as an input from the user.

        System.out.print("Enter Your Income : Rs. ");
        long income = sc.nextLong();

        if (income>1000000){
            System.out.println("You Have To Pay Rs. " + income*30/100 + " Tax.");
        }
        else if (income>500000) {
            System.out.println("You Have To Pay Rs. " + income*20/100 + " Tax.");
        }
        else if (income>250000) {
            System.out.println("You Have To Pay Rs. " + income*5/100 + " Tax.");
        }
        else {
            System.out.println("You Have To Pay RS. 0 Tax.");
        }

        //Q.04 - Write a java Program to find out the day of the week given the no. [ 1 for Monday, 2 for Tuesday ..... and so on! ]

        // I thought I had to make it for the month { so,here it is }

        System.out.print("Enter Date : ");
        int date;
        date = sc.nextInt();

        if (date==1 || date==8 || date==15 || date==22 || date==29) {
            System.out.println("Monday");
        }
        if (date==2 || date==9 || date==16 || date==23 || date==30) {
            System.out.println("Tuesday");
        }
        if (date==3 || date==10 || date==17 || date==24) {
            System.out.println("Wednesday");
        }
        if (date==4 || date==11 || date==18 || date==25) {
            System.out.println("Thursday");
        }
        if (date==5 || date==12 || date==19 || date==26) {
            System.out.println("Friday");
        }
        if (date==6 || date==13 || date==20 || date==27) {
            System.out.println("Saturday");
        }
        if (date==7 || date==14 || date==21 || date==28) {
            System.out.println("Sunday");
        }

        //Q.05 - Write a java Program to find whether a year entered by the user is a leap year or not.


        System.out.print("Enter Year : ");
        int year;
        year = sc.nextInt();

        if (year<1752) {
            System.out.println("Please Enter Year More Than 1752,\nBecause 1752 Was The First Leap Year In The Modern Sense In Britain.");
        }
        if (year%4==0) {
            System.out.println(year + " Is A Leap Year.");
        }
        else {
            System.out.println(year + " Is Not A Leap Year.");
        }

        //Q.06 - Write a program to find out the type of website from the URL.

        System.out.print("Enter Your URL Below :-\nURL - ");
        String url = sc.next();

        if (url.endsWith(".com")) {
            System.out.println("This is a Commercial website.");
        }
        else if (url.endsWith(".org")) {
            System.out.println("This is an Organizational website.");
        }
        else if (url.endsWith(".in")) {
            System.out.println("This is an Indian website.");
        }
    }
}
