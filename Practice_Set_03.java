package Practice_Sets;

public class Practice_Set_03 {
    public static void main(String[] args) {

        //Q.01 - Write a program to convert a String to lowercase.

        String name = "AvInAsH";
        String lCaseName = name.toLowerCase();
        System.out.println(lCaseName);

        //Q.02 - Write a java program to replace spaces with underscores.

        String name2 = "My Name Is Avinash";
        String noSpace = name2.replace(" ","_");
        System.out.println(noSpace);

        //Q,03 - Write a java program to fill in a letter template which looks like below.

        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","Avinash");
        System.out.println(letter);

        //Q.04 - Write a program to format the following sentence using escape sequence.

        String motivation = "Dear Avinash,\n\tKeep learning,\n\tYou're doing great!";
        System.out.println(motivation);
    }
}
