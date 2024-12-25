public class am {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.setAccountName("Manoj");
        myAccount.changePassword("123");

        System.out.println(myAccount.accname);
    }
}
class BankAccount{
    public String accname;
    private String passsword;

    void setAccountName(String name){
        accname = name;
    }
    public void changePassword(String pwd){
        passsword = pwd;
    }
}
