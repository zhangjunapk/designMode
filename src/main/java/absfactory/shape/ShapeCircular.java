package absfactory.shape;

/**
 * @BelongsProject: testDesignMode
 * @BelongsPackage: absfactory.shape
 * @Author: ZhangJun
 * @CreateTime: 2019-06-24 10:57
 * @Description: 圆形的
 */
public class ShapeCircular implements Shape{

    @Override
    public void show() {
        System.out.println("这是一个圆形");
    }
}
