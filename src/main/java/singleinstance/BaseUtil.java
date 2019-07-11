package singleinstance;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.Date;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: singleinstance
 * @Author: ZhangJun
 * @CreateTime: 2019-06-25 15:45
 * @Description: 工具
 */
public class BaseUtil {
static Unsafe unsafe=getUnsafe();
static final boolean is64bit=true;
    public static void pringAddress(Object obj){
        long last=0;
        int offset = unsafe.arrayBaseOffset(obj.getClass());
        int scale = unsafe.arrayIndexScale(obj.getClass());
        switch (scale){
            case 4:
                long factor=is64bit?8:1;
                final long i1=unsafe.getInt(obj,offset)&0XFFFFFFFFL*factor;
                System.out.print(Long.toHexString(i1));
                last=i1;
                final long i2=(unsafe.getInt(obj,offset)&0xFFFFFFFFL)*factor;
                if(i2>last){
                    System.out.println(Long.toHexString(i2- last));
                }else{
                    System.out.println(Long.toHexString(last-i2));
                }
        }
    }

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());
        //pringAddress(new Double[]{55D,66D});
    }

    private static Unsafe getUnsafe()  {
        try {
            Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafe.setAccessible(true);
            return (Unsafe) theUnsafe.get(null);
        }catch (Exception e){
            e.printStackTrace();
            throw new AssertionError(e);
        }
    }
}
