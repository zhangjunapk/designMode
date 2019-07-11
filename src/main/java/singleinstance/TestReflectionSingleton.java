package singleinstance;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: singleinstance
 * @Author: ZhangJun
 * @CreateTime: 2019-07-11 22:26
 * @Description: 测试反射攻击单例
 */
public class TestReflectionSingleton {
    public static void main(String[] args) {
        test2();

    }
    public static void test1(){
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


    public static void test2(){
        try {
            Constructor<UtilCantReflection> declaredConstructor = UtilCantReflection.class.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            UtilCantReflection utilSync = declaredConstructor.newInstance();
            System.out.println(utilSync);
          //  System.out.println(UtilCantReflection.GetInstance());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
