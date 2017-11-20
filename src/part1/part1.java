package part1;

/*
 * A is more readable and smaller
 * A has less fluff than B
 * G is directly substituted with 9.81
 * 9.81 should not change during runtime thus having the same effect as "static final"
 */
class A {

    double potentialEnergy(double mass, double height) {

        return mass * height * 9.81;

    }

}


/*
 * B helps indicate that g (gravity constant) is a constant and shouldn't be messed around
 * with by using "static final". But, B can be more confusing as more rules are now applied
 * to using g properly.
 */
class B {

    static final double g = 9.81;

    double potentialEnergy(double mass, double height) {

        return mass * g * height;

    }

}

