package singleinstance;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: singleinstance
 * @Author: ZhangJun
 * @CreateTime: 2019-07-02 10:49
 * @Description: 双重锁
 */
public class UtilSync {
    private static UtilSync sync;
    private UtilSync(){
        System.out.println("util双重锁初始化成功");
    }

    public static UtilSync getInstance(){
        //如果为空才会进去
        if(sync==null){// 1
            //然后锁定这个工具
            synchronized (UtilSync.class){ // 1
                //做一下判断,因为有这种可能，就是1步骤判断为true进来了，
                // 然后另一个线程也成功判断了，并且都走完步骤，成功new了
                //然后我不判断是否为空的话，这里就创建多份util了
                if(sync==null){
                    sync=new UtilSync();
                }
            }
        }
        return sync;
    }
    public void show(){
        System.out.println("show----------->");
    }
}
