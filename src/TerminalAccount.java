public class TerminalAccount {
    Integer number;
    String agency;
    String client_name;
    Double balance;

    public TerminalAccount(Integer number, String agency, String client_name, Double balance) {
        this.number = number;
        this.agency = agency;
        this.client_name = client_name;
        this.balance = balance;
    }
}
