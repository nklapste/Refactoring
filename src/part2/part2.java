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
