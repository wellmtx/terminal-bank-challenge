import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Enter the account number:");
        Integer number = scanner.nextInt();

        System.out.println("Enter the agency:");
        String agency = scanner.next();

        System.out.println("Enter the client name:");
        String client_name = scanner.next();

        System.out.println("Enter the balance:");
        Double balance = scanner.nextDouble();

        TerminalAccount account = new TerminalAccount(number, agency, client_name, balance);

        System.out.println("Hello " + account.client_name + ", thank you for creating an account in our bank, your agency is " + account.agency + ", account " + account.number + " and your balance " + account.balance + " is already available for withdrawal");
    }
}