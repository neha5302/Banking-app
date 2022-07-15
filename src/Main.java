public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("123","Neha","neha@email.com","589654789",0.0);
        account1.deposit(200);
        account1.setName("Neha");
        account1.getName();
        account1.getBal();
        account1.getEmail();
        account1.getNum();
        account1.getPhone();

    }
}
