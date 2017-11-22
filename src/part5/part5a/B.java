package part5.part5a;

public class B extends A {

    public int k(int i) {

        return 20;

    }

    public static void main(String[] args) {
        // A().k(2) call makes local k function unused
        // as we specify for superclass's k function
        // specifically
        System.out.println(new A().k(2));

    }

}