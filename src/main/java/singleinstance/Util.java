package singleinstance;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: singleinstance
 * @Author: ZhangJun
 * @CreateTime: 2019-07-02 10:45
 * @Description: 网络请求 懒汉式
 */
public class Util {
    private static Util util;
    private Util(){ System.out.println("util懒汉式初始化成功");}
    public static Util getInstance(){
        if(util==null){//这里没有加锁，多个判断都会进来，然后都会对util进行初始化,内存中就会保存多个副本
            util=new Util();
        }
        return util;
    }
    public void get(){
        System.out.println("get请求");
    }

}
