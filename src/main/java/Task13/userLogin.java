package Task13;

import java.util.Scanner;

public class userLogin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Your User Name: ");
        String userName = scanner.nextLine();

        System.out.println("Your Password: ");
        String password = scanner.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("You logged in !");
        } else {
            System.out.println("Your password is wrong !");

            if (password != "java123") {

                System.out.println("Would you like to reset your password?");

                System.out.println("1) Yes \n2) No");

                int choice = scanner.nextInt();
                String newPassword = scanner.nextLine();

                switch (choice){
                    case 1:
                    if (newPassword.equals("java123") || newPassword != ("java456")) {
                        System.out.println("Could not create password, please enter another password");
                    }
                    break;
                    case 2:
                    System.out.println("Password created!");
                    break;
                }
            }
        }

    }

}


