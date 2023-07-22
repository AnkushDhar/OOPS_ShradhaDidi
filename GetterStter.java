public class GetterStter {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setColor("Blue");
        System.out.println(p.getColor());
        p.setTip(5);
        System.out.println(p.getTip());

        // BankAccount myAcc = new BankAccount();
        // myAcc.userName = "ankush01";
        // myAcc.setPassword("A1234D");
        // myAcc.getPassword();
    }
}
// class BankAccount {
//     public String userName;
//     private String password;
//     public void setPassword (String password) {
//         this.password = password;
//     }
//     public void getPassword () {
//         System.out.println(password);
//     }
// }
class Pen {
    private String color;
    private int tip;

    void setColor (String color) {
        this.color = color;
    }
    String getColor () {
        return this.color;
    }
    void setTip (int tip) {
        this.tip = tip;
    }
    int getTip () {
        return this.tip;
    }
}