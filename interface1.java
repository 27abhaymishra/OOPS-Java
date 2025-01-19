public class interface1 {
    public static void main(String[] args) {
        bacha b = new bacha();
        b.pitai();
        b.car();
        b.pyaar();
        b.khana(5);
    }
}

interface papa{

    public void pitai();
    public void car();
}
interface mummy{
    public void pyaar();
    public void khana(int roti);
}

class bacha implements papa , mummy{

    public void pitai(){
System.out.println("papa ki pitai");
    }
    public void car(){
        System.out.println("papa car lalo");
    }
    public void pyaar(){
        System.out.println("Mummy ka pyaar");
    }
    public void khana(int roti){
        System.out.println("Mummy 4 roti aur dedo");
    }
}