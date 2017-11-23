package part1;

/*
 * A is more smaller
 * A has less fluff than B
 * g is directly substituted with 9.81
 *
 * 9.81 should not change during runtime thus having the same effect as "static final".
 * But it fails to show in any direct way to coders that care and concern should be
 * present in changing 9.81.
 *
 * Without background knowledge of the actual application users could be confused as to
 * what 9.81's purpose is. Primitive values usualy fail to give their context explicitly.
 *
 * A is implicit in its useage of 9.81. Users are required to have background knowledge on
 * the code (and its physics context) to fully understand the useage of 9.81.
 */
class A {

    double potentialEnergy(double mass, double height) {

        return mass * height * 9.81;

    }

}


/*
 * B can be considered more readible.
 *
 * The feild name g helps give context to what the value actually represents (gravity constant g).
 * Creating a more identifable generic formula (P=mgh) for potentialEnergy that reflects "normal"
 * world mathmateical potential energy formulas.
 *
 * B helps indicate explicity that g (gravity constant) is a constant and shouldn't be messed around
 * with by using "static final". It still can be changed (through re-writing the code), but, it makes
 * coders give more care and concern when doing such update.
 *
 * B is more explicit than A in its use of 9.81 as a constant and in the context of using g (9.81) as a
 * gravity constant in a physics context.
 */
class B {

    static final double g = 9.81;

    double potentialEnergy(double mass, double height) {

        return mass * g * height;

    }

}

