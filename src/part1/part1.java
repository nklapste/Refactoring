package part1;

class A {

    double potentialEnergy(double mass, double height) {

        return mass * height * 9.81;

    }

}

class B {

    static final double g = 9.81;

    double potentialEnergy(double mass, double height) {

        return mass * g * height;

    }

}

