public class multiLevelInhertance {
public static void main(String[] args) {
    // X x = new X();
    // Y y = new Y();
    // Z z = new Z();
    // x.show();
    // x.show(3);
    // x.show("re");
    // y.show();
    // y.show(5);
    // y.show("gf");
    // z.show();
    // z.show(7);
    // z.show("go");
    X x = new Z();
    x.show();
    // x.show(5);
    // x.show("hi");

  

}
    
}

class X {
    public void show(){
        System.out.println("x class");
    }
}
    class Y extends X {
        public void show(int x){
            System.out.println("y class");
        }
    }
        class Z extends Y {
            public void show(String x){
                System.out.println("z class");
            }
}