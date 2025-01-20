public class oops1 {

    public static void main(String[] args) {
        padosi jetha = new padosi(51 , "gada Electronic");
        jetha.show();
        System.out.println(jetha.age);
        System.out.println(jetha.work);
        jetha.work ="Sleeping";
        System.out.println(jetha.work);
     System.out.println(jetha.income);
     
        jetha.income = 10000;
        System.out.println(jetha.income);
    }
}

 class padosi{

    int age ,income;
    String work;
   
     padosi(int age , String w) {
        // age = a;
        // work = w;
        // this.age = age;
        // this.work = work;
        this.age = age;
               work = w;
               income = 50000;

    }
    public void show(){
        System.out.println("Welcome Padosi");
    }
}