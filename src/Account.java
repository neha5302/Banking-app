public class Account {
    private String num;
    private String name;
    private String email;
    private String phone;
    private double bal;

    public Account(String num,String name,String email,String phone,double bal) {
        this.name = name;
        this.bal = bal;
        this.num = num;
        this.phone = phone;
        this.email = email;
    }

    public void deposit(double deposit){
        this.bal+=deposit;
        System.out.println("Deposit is successful, new balance is " + this.bal);
    }

    public void withdraw(double withdraw) {
        if (this.bal - withdraw < 0) {
            System.out.println("can't withdraw, " + this.bal + " balance is left");
        } else {
            this.bal -= withdraw;
            System.out.println("Withdraw is successful, new balance is " + this.bal);
        }
    }

    public void getNum() {
        System.out.println(num);
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getEmail() {
        System.out.println(email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void getPhone() {
        System.out.println(phone);
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void getBal() {
        System.out.println(bal);
    }

    public void setBal(double bal) {
        this.bal = bal;
    }



}
