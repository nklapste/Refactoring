package part4;

// B -> A Introduce Explaining Variable refactoring
/*
 * Introduce Explaining Variable refactoring could be useful if the context of this code
 * indicates that "offset" could possibly need updates to the future. Eg: testing multiple
 * different embedded systems where offset could change from board to board. Thus a identifying
 * 128 to the unique name of "offset" could help in updating code later. Giving a name to 128
 * as "offset" helps centralize this value, and gives a definite note of where its use is.
 * Eg: say we did have to change "offset" to 132 if inline temp refactoring was done instead
 * it would require extra effort to ensure all changes of 128 to 132 were proper (maybe at NOTE_1
 * it should remain 128). Thus, by using Introduce Explaining Variable refactoring we directly avoid
 * doing this extra effort as all uses of 128 as an "offset" are directly applied and stated. Allowing
 * users to dicern offset useages of 128 to other constant useages of 128.
 *
 * Also if this code was to be expanded in the future it can be beneficial to have 128 labeled as "offset"
 * as it can be later used in new code segments easily without having to remember the exact value.
 * This shows explicitly in what actually uses the 128 "offset" and explicitly states that 128 is the offset
 * value.
 *
 * Good for expansion and gives explicit context of the system and use of the code.
 *
 * Makes changing "offset" easy, implying that changing offset could be common.
 *
 * Can be overkill for extremely simple uses.
 */
class A {

    public static Long valueOf(long l) {

        final int offset = 128;

        // TODO: NOTE_1
        if (l >= -128 && l <= 127) {// will cache

            return LongCache.cache[(int) l + offset];

        }
        return new Long(l);

    }
}

// A -> B Inline Temp refactoring
/*
 * Inline temp refactoring could be seen useful if this was the only use 128 as an "offset".
 * Maybe the code being developed is for a specific embedded system where this "offset" is
 * ensured to always be 128. In which case leaving it as 128 is simple enough and is
 * easily identifiable for people working within the project. Essentially this pattern is
 * useful if the context surrounding the code gives clear indication what 128 is, and notes
 * that 128 should not change anytime soon.
 *
 * Another potentially useful context for this pattern is if this was the ONLY point where a 128
 * "offset" was needed (ever in any system), thus, making safe to permanently write-in 128.
 *
 * Additionally, by not stating that its an "offset" it leaves out (in this case useless)
 * information on the system which could help "simplify" the code as outside concepts are "ignored".
 *
 * Good for extremely small or rare cases where either project background knowledge makes 128
 * obvious of its use or 128 is known to NEVER change.
 *
 * Lacking knowledge of the actual use of 128 can make understanding the code easier as
 * developers don't get tangled in its actual background use, and simply accept 128 as the
 * value that goes there.
 *
 * Makes changing "offset" or 128 harder, implying that it shouldn't be changed.
 *
 * Can become a burden in expanding code.
 */
class B {
    public static Long valueOf(long l) {

        if (l >= - 128 && l <= 127) {// will cache

            return LongCache.cache[(int) l + 128];

        }

        return new Long(l);

    }
}
