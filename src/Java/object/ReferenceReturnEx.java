package Java.object;

public class ReferenceReturnEx {
    static Data copy(Data d) {
        Data temp = new Data();
        temp.x = d.x;
        return temp;
    }

    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }
}
