public class Abstraction1 {
    public static void main(String[] args) {
        // AB a = new AB();
        CD b = new CD();
        // a.show();
        // a.display();
        b.show();
     
        b.show(5);
        b.display(5);
        }
}
 abstract class AB{
    public void show(){
System.out.println("AB show");
    }
   abstract   public void display(int a);
}

class CD extends AB{
    public void show(int x){
        System.out.println("CD show");
            }
            public void display(int x){
        System.out.println("CD display");
            }
}