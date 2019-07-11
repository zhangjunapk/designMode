package singleinstance;

public class SingletonNotAttackByReflect
{
    private static final SingletonNotAttackByReflect INSTANCE;
    static {
         INSTANCE= new SingletonNotAttackByReflect();
    }

    //保证其不被java反射攻击
    private SingletonNotAttackByReflect()
    {
        synchronized (SingletonNotAttackByReflect.class) 
        {
           if(INSTANCE!=null){
               throw new IllegalStateException("已经被实例化了");
           }
            
        }
    }
    
    public static SingletonNotAttackByReflect getInstance()
    {
        return INSTANCE;
    }

}