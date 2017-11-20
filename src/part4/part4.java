package part4;

class A {

    public static Long valueOf(long l) {

        final int offset = 128;

        if (l >= -128 && l <= 127) {// will cache

            return LongCache.cache[(int) l + offset];

        }
        return new Long(l);

    }
}

class B {
    public static Long valueOf(long l) {

        if (l >= - 128 && l <= 127) {// will cache

            return LongCache.cache[(int) l + 128];

        }

        return new Long(l);

    }
}
