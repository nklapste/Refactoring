package part2;

public class part2 {
    public int funny(int a, int b) {

        int temp = a * b;

        if (temp > 100) {

            return temp * 0.95;

        } else {

            return temp * 0.25;

        }
    }
}

//TODO
/*
 * This is preferred as it is straightforward and easy to read. At each step we know that we are multiplying and due to
 * the method being extremely simple and easy to read these qualities are transferred to the code.
 */
public class Part2_inline_temp {
    public int funny(int a, int b) {
        if (a * b > 100) {

            return a * b * 0.95;

        } else {

            return a * b * 0.25;

        }
    }
}

//TODO
/*
 * This is not preferred as it is redundant for such a simple method. For a more advanced or lengthy method
 * this can be useful, but, for a small and simple function of multiplying two numbers this is overkill.
 *
 */
public class Part2_extract_method_blah {
    public int funny(int a, int b) {
        if (getTemp(a, b) > 100) {

            return getTemp(a, b) * 0.95;

        } else {

            return getTemp(a, b) * 0.25;

        }

    }

    int getTemp(int a, int b){
        return a * b;
    }
}
