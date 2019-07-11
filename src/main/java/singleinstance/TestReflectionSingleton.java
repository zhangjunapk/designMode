package singleinstance;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: singleinstance
 * @Author: ZhangJun
 * @CreateTime: 2019-07-11 22:26
 * @Description: 测试反射攻击单例
 */
public class TestReflectionSingleton {
    public static void main(String[] args) {
        //test2();
        try {
            Field flag = SingletonNotAttackByReflect.class.getDeclaredField("flag");
            flag.setAccessible(true);
            flag.set(null, false);

            Constructor<SingletonNotAttackByReflect> declaredConstructor = SingletonNotAttackByReflect.class.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            SingletonNotAttackByReflect utilSync = declaredConstructor.newInstance();
            System.out.println(utilSync);
            System.out.println(UtilCantReflection.GetInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test1() {
        try {
            Constructor<UtilSync> declaredConstructor = UtilSync.class.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            UtilSync utilSync = declaredConstructor.newInstance();
            Method show = UtilSync.class.getMethod("show");
            show.invoke(utilSync);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void test2() {
        try {
            CountDownLatch latch = new CountDownLatch(1);
            for (int i = 0; i < 10000; i++) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            latch.await();
                            Field flag = SingletonNotAttackByReflect.class.getDeclaredField("flag");
                            flag.setAccessible(true);
                            synchronized (SingletonNotAttackByReflect.class) {
                                flag.set(null, false);
                                try {
//                                    SingletonNotAttackByReflect.getInstance().pringFlag();
                                    Constructor<UtilCantReflection> declaredConstructor = UtilCantReflection.class.getDeclaredConstructor();
                                    declaredConstructor.setAccessible(true);
                                    UtilCantReflection utilSync = declaredConstructor.newInstance();
                                    System.out.println(utilSync);
                                    System.out.println(UtilCantReflection.GetInstance());
                                } catch (Exception e) {
                                    System.out.println("反射失败");
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
            latch.countDown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test3() {
        try {
            Field instance = SingletonNotAttackByReflect.class.getDeclaredField("INSTANCE");
            instance.setAccessible(true);
            Object o = instance.get(null);
            System.out.println(o);
            System.out.println(SingletonNotAttackByReflect.getInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
