package encapsulation;

public class Test {
    public static void main(String[]args){
        Bank b = new Bank();
        b.setBalance(5000);
        b.setAccount_number(10233);
        System.out.println( b.getAccount_number());
        System.out.println("your money after deposit"+b.deposit(200));
        System.out.println("your money after withdrawl"+b.withdraw(3000));
    }
}
