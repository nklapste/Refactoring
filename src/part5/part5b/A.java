package part5.part5b;

public class A {

    // unused
    public int k(long i) {

        return 10;

    }

    // This k function is used in B (due to overloading and by
    // having its input parameter type (int) being closer type to
    // int than long in the other k function) thus, output will be 20
    public int k(int i) {

        return 20;

    }

}