public class opps6 {
    public static void main(String[] args) {
        Father ajay = new Father(32,"black");
        child anjali = new child(ajay , 32);
        System.out.println(ajay.age + " " + ajay.color);
        System.out.println(anjali.age + " " + anjali.color + " " + anjali.x);


    }
}
class Father{
    int age;
    String color;
    Father(int a , String c){
        age = a;
        color = c;
    }
}
class child extends Father{
    int x;
    child(Father f , int x){
        super(6,f.color);
        this.x = x;
    }
}