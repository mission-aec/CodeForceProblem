import java.util.Scanner;

public class PetyaAndStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        int result = str1.compareTo(str2);

        if (result > 0) {
            System.out.println("1");
        } else if (result < 0) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }

    }

}
