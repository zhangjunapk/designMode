package singleinstance;

public class SingletonNotAttackByReflect
{
    private static boolean flag = false;
    private static final SingletonNotAttackByReflect INSTANCE;
    static {
         INSTANCE= new SingletonNotAttackByReflect();
    }

    //保证其不被java反射攻击
    private SingletonNotAttackByReflect()
    {
        synchronized (SingletonNotAttackByReflect.class) 
        {
            if(false == flag)
            {
                flag = !flag;
                System.out.println("初始化完成------->");
            }
            else
            {
                throw new RuntimeException("单例模式正在被攻击");
            }
            
        }
    }
    
    public static SingletonNotAttackByReflect getInstance()
    {
        return INSTANCE;
    }

}