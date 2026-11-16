
import java.util.Scanner;

class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int books = 5;
        int choice;



        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. View Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available Books: " + books);
                    break;

                case 2:
                    if (books > 0) {
                        books--;
                        System.out.println("Book issued successfully!");
                    } else {
                        System.out.println("No books available.");
                    }
                    break;

                case 3:
                    books++;
                    System.out.println("Book returned successfully!");
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}

