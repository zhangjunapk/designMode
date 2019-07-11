package singleinstance;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: singleinstance
 * @Author: ZhangJun
 * @CreateTime: 2019-07-11 22:30
 * @Description: 不能实例化的单例对象
 */
public final class UtilCantReflection {
    private static boolean flag = false;
    protected static final UtilCantReflection instance;
    static {
        instance=new UtilCantReflection();
    }
    private UtilCantReflection(){

        System.out.println(flag);
        synchronized (UtilCantReflection.class)
        {
            if(false == flag)
            {
                flag = !flag;
            }
            else
            {
                throw new RuntimeException("单例模式正在被攻击");
            }

        }
    }

    public static UtilCantReflection GetInstance(){
        return instance;
    }
    public void show(){
        System.out.println("show------>");
    }

}
