import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class BankAccount {
    private static ArrayList<Customer> allCustomers = new ArrayList<>();

    public static void main(String[] args) {
        allCustomers.add(new Customer(500, "Dale", 123456));
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Welcome to the Bank of Nash!");
        System.out.println("Are you an existing customer?");
        System.out.println("yes");
        System.out.println("no");
        String response = scanner.nextLine();
        if (response.equals("no")) {
            System.out.println("Let's make a new account!");
            System.out.println("What is the name for the account?");
            String response2 = scanner.nextLine();
            System.out.println("What is the beginning balance for the account?");
            int response3 = Integer.parseInt(scanner.nextLine());
            int response4 = random.nextInt(100000);
            System.out.println("Here is your account number: " + response4);
            allCustomers.add(new Customer(response3, response2, response4));
            System.out.println("Type yes if you want to go to the main menu: ");
            String response5 = scanner.nextLine();
            if (response5.equals("yes")) {
                mainMenu(response4);
            }
        } else {
            System.out.println("What is your account number? ");
            int response6 = Integer.parseInt(scanner.nextLine());
            mainMenu(response6);
        }
    }

    public static void mainMenu(int x) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < allCustomers.size(); i++) {
            if (x == allCustomers.get(i).number) {
                System.out.println("Hello " + allCustomers.get(i).name);
                System.out.println("Welcome to the Main Menu, what would you like to do today?");
                System.out.println("1. To check account balance");
                System.out.println("2. To make a withdrawal");
                System.out.println("3. To make a deposit");
                System.out.println("4. To make a transfer to another account");
                System.out.println("5. To Exit");
                int response7 = Integer.parseInt(scanner.nextLine());
                if (response7 == (1)) {
                    System.out.println("Your account balance is $" + allCustomers.get(i).balance);
                    mainMenu(x);
                }
                if (response7 == (2)) {
                    System.out.println("How much would you like to withdraw? ");
                    int response9 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Your old balance is $" + allCustomers.get(i).balance);
                    allCustomers.get(i).withdrawal(response9);
                    System.out.println("Your new balance is $" + allCustomers.get(i).balance);
                    mainMenu(x);
                }
                if (response7 == 3) {
                    System.out.println("How much would you like to deposit? ");
                    int response8 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Your old balance is $" + allCustomers.get(i).balance);
                    allCustomers.get(i).deposit(response8);
                    System.out.println("Your new balance is $" + allCustomers.get(i).balance);
                    mainMenu(x);
                }
                if (response7 == 4) {
                    transfer(x);
                }
                if (response7 == 5) {
                    System.out.println("Have a great day!");
                    break;
                }

            }

        }

    }

    public static void transfer(int x) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < allCustomers.size(); i++) {
            if (x == allCustomers.get(i).number) {
                System.out.println("Please enter the account number to transfer to: ");
                int response10 = Integer.parseInt(scanner.nextLine());
                System.out.println("Please enter the amount to transfer");
                int response11 = Integer.parseInt(scanner.nextLine());
                for (int y = 0; y < allCustomers.size(); y++) {
                    if (response10 == allCustomers.get(y).number) {
                        System.out.println("The name on the account is: " + allCustomers.get(i).name + " and they have a balance of " + allCustomers.get(i).balance);
                        System.out.println("The name on the account is: " + allCustomers.get(y).name + " and they have a balance of " + allCustomers.get(y).balance);
                        allCustomers.get(y).deposit(response11);
                        allCustomers.get(i).withdrawal(response11);
                        System.out.println(allCustomers.get(i).name + " has a new balance of " + allCustomers.get(i).balance);
                        System.out.println(allCustomers.get(y).name + " has a new balance of " + allCustomers.get(y).balance);
                        mainMenu(x);


                    }
                }


            }

        }

    }
}
