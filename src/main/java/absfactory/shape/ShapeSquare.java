package absfactory.shape;

/**
 * @BelongsProject: testDesignMode
 * @BelongsPackage: absfactory.shape
 * @Author: ZhangJun
 * @CreateTime: 2019-06-24 11:02
 * @Description: 正方形
 */
public class ShapeSquare implements Shape{

    @Override
    public void show() {
        System.out.println("这是一个正方形");
    }
}
