public class Super {
    public static void main(String[] args) {
        P p1 = new P(4,5);
        Q q1 = new Q(p1);
        System.out.println(p1.x + " "+ p1.y);
        System.out.println(q1.x + " " +q1.y + " " +q1.z);
    }
}

class P {
    int x, y;

    P(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Q extends P {
    int z;

    Q(P p1) {
        super(7,8);
    }
}