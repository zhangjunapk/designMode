package absfactory.color;

/**
 * @BelongsProject: testDesignMode
 * @BelongsPackage: absfactory.color
 * @Author: ZhangJun
 * @CreateTime: 2019-06-24 10:56
 * @Description: 黄色的
 */
public class ColorYellow implements Color {

    @Override
    public void draw() {
        System.out.println("这是黄色的");
    }
}
