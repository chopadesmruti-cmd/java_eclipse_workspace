import java.util.Scanner;
import java.util.Arrays;

public class Hello {

    public static void main(String[] args) {

                System.out.println("Hello World !");
                System.out.println("Khushi Chopade");
               
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter cost price: ");
                double cost_price = sc.nextDouble();

                System.out.print("Enter selling price: ");
                double selling_price = sc.nextDouble();

                if (selling_price > cost_price) {
                    double profit = selling_price - cost_price;
                    System.out.println("Profit = " + profit);
                } else if (cost_price > selling_price) {
                    double loss = cost_price - selling_price;
                    System.out.println("Loss = " + loss);
                } else {
                    System.out.println("No Profit, No Loss");
                }

                System.out.print("Enter a number: ");
                int num = sc.nextInt();

                if (num % 2 == 0) {
                    System.out.println("The number is Even");
                } else {
                    System.out.println("The number is Odd");
                }

                System.out.print("Enter your age: ");
                int age = sc.nextInt();

                if (age < 0) {
                    System.out.println("Invalid age");
                } else if (age >= 18) {
                    System.out.println("You are eligible for voting");
                } else {
                    System.out.println("You are not eligible for voting");
                }

                sc.nextLine();

                System.out.print("Enter word 1: ");
                String word1 = sc.nextLine();

                System.out.print("Enter word 2: ");
                String word2 = sc.nextLine();

                char[] arr1 = word1.toLowerCase().toCharArray();
                char[] arr2 = word2.toLowerCase().toCharArray();

                Arrays.sort(arr1);
                Arrays.sort(arr2);

                if (Arrays.equals(arr1, arr2)) {
                    System.out.println("The words are Anagrams");
                } else {
                    System.out.println("The words are Not Anagrams");
                }

                sc.close();
    }
}
