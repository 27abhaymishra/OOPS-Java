//Constructor OverLoading

public class oops4 {
    public static void main(String[] args) {
        copycons a = new copycons(5,"bmw");
        copycons b = new copycons(7);
        copycons c = new copycons("audi");
        System.out.println(a.x + " " + a.s);
        System.out.println(b.x + " " + b.s);
        System.out.println(c.x + " " + c.s);


    }
}
class copycons{
    int x;
    String s = "car";
    copycons(int x , String t){
        this.x = x;
        s=t;
    }
    copycons(int x){
        this.x = x;
    }
    copycons(String t){
        s = t;
    }
}