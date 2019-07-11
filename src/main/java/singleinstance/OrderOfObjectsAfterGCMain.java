package singleinstance;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class OrderOfObjectsAfterGCMain {
    static final Unsafe unsafe = getUnsafe();
    static final boolean is64bit = true;

    public static void main(String... args) {
        Double[] ascending = new Double[]{55D,66D};
        for(int i=0;i<ascending.length;i++)
            ascending[i] = (double) i;

        System.out.println("Before GC");
        printAddresses("ascending", ascending);

     //   System.gc();
        System.out.println("\nAfter GC");
        printAddresses("ascending", ascending);

        long l = unsafe.allocateMemory(50);
        System.out.println(l);
    }

    public static void printAddresses(String label, Object object) {
        System.out.print(label + ": 0x");
        long last = 0;
        int offset = unsafe.arrayBaseOffset(object.getClass());
        int scale = unsafe.arrayIndexScale(object.getClass());
        long addr;
        switch (scale) {
            case 4:
                long factor = is64bit ? 8 : 1;
                final long i1 = (unsafe.getInt(object, offset) & 0xFFFFFFFFL) * factor;
                System.out.print(Long.toHexString(i1));
                last = i1;
                    final long i2 = (unsafe.getInt(object, offset + 0 * 4) & 0xFFFFFFFFL) * factor;
                    if (i2 > last)
                        addr=i2 - last;
                    else
                        addr=last - i2;
                    last = i2;
                System.out.println(Long.toHexString(addr));
                break;
            case 8:
                throw new AssertionError("Not supported");
            default:
                throw new IllegalStateException("Unexpected value: " + scale);
        }
        //接下来搞破坏
       // unsafe.putAddress(addr,11L);

    }

    private static Unsafe getUnsafe() {
        try {
            Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafe.setAccessible(true);
            return (Unsafe) theUnsafe.get(null);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }
}