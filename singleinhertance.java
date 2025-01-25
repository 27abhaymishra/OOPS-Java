public class singleinhertance {
   
    
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.show();
        b.display();
        b.show();
    //    a.display();
    b.show(5);
    b.show("Arin");
      
    }
}

class A{
 
    public void show(){
        System.out.println("A class");
    }

}

class B extends A{
   public void display(){
    System.out.println("B class display'");
   }
   public void show(int x){
    System.out.println("B class show");
}
public void show(String x){
    System.out.println("B ");
}

}