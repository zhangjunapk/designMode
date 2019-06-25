package absfactory.color;

/**
 * @BelongsProject: testDesignMode
 * @BelongsPackage: absfactory.color
 * @Author: ZhangJun
 * @CreateTime: 2019-06-24 10:55
 * @Description: 红色
 */
public class ColorRed implements Color {
    @Override
    public void draw() {
        System.out.println("开始画了，红色的");
    }
}
