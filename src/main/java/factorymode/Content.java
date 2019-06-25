package factorymode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @BelongsProject: testDesignMode
 * @BelongsPackage: factorymode
 * @Author: ZhangJun
 * @CreateTime: 2019-06-24 10:11
 * @Description: 你懂得
 */
public class Content {
    static List<BossFactory> objectList;
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.currentThread().sleep(1000L);
                    fatchData();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }


    public static void fatchData(){
        objectList=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Set<Class<?>> factorymode = ClassUtil.getClasses("factorymode");
        for(Class c:factorymode){
            if(!BossFactory.class.isAssignableFrom(c)||c.isInterface()){
                continue;
            }
            try {
                objectList.add((BossFactory) c.newInstance());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        for(BossFactory b:objectList){
            b.say();
        }
        System.out.println("输入一个类名");
        try {
            Class.forName(scanner.nextLine().trim());
            fatchData();
            System.out.println("加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("加载失败，类没找到");
            fatchData();
        }
    }
}
