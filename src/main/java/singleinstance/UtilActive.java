package singleinstance;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: singleinstance
 * @Author: ZhangJun
 * @CreateTime: 2019-07-02 10:47
 * @Description: 饿汉式
 */
public class UtilActive {
    //这个类被加载的时候就会初始化util
    private static UtilActive utilActive=new UtilActive();
    private UtilActive(){
        System.out.println("util饿汉式加载成功");
    }
    public static UtilActive getInstance(){
        return utilActive;
    }
}
