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
public class Part2_inline_temp {
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
public class Part2_extract_method_blah {
    public int funny(int a, int b) {

        int temp = a * b;

        if (temp > 100) {

            return temp * 0.95;

        } else {

            return temp * 0.25;

        }
    }
}

//TODO discuss which refactor method is better
/*
 *
 *
 */