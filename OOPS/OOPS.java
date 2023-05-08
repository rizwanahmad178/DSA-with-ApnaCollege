package OOPS;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Red";
        System.out.println(p1.color);

        BankAccount obj = new BankAccount();
        obj.username = "Rizwan Ahmad";
        //obj.password = "abc123@";//showing error because password is private
        obj.setPassword("abc123@");
        System.out.println(obj.username);
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}