public class oops5 {
    public static void main(String[] args) {
        copy a = new copy(1,2,3);
        copy b = new copy(a);
        a.x = 7; a.y = 11;
        System.out.println(a.x + " " + a.y + " " + a.z);
        System.out.println(b.x + " " + b.y + " " + b.z);

    }
}
class copy{
   static int x;  int y,z;
    copy(int x , int y , int z){
        this.x = x;
        this.y = y;
         this.z = z; 
    }
    copy(copy a){
        this.x = a.x;
        this.y = a.y;
        this.z = a.z; 
    }
}
