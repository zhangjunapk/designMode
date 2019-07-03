package singleinstance;

import java.util.concurrent.CountDownLatch;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: singleinstance
 * @Author: ZhangJun
 * @CreateTime: 2019-07-02 10:53
 * @Description:
 */
public class Content {
    public static void main(String[] args) {
        //这里模拟多线程
        CountDownLatch latch=new CountDownLatch(1);
        for(int i=0;i<10000;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        latch.await();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    Util instance = Util.getInstance();
                    UtilSync instance1 = UtilSync.getInstance();
                    UtilActive instance2 = UtilActive.getInstance();
                }
            }).start();
        }
        latch.countDown();
    }


}
