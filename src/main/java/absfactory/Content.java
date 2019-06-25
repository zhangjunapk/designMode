package absfactory;

import absfactory.color.Color;
import absfactory.color.ColorEnum;

/**
 * @BelongsProject: testDesignMode
 * @BelongsPackage: absfactory
 * @Author: ZhangJun
 * @CreateTime: 2019-06-24 11:09
 * @Description: 测试
 */
public class Content {
    public static void main(String[] args) {
        Factory factory = new Factory();
        AbstractFactory colorFactory = factory.getFactory(FactoryEnum.COLOR);
        Color color = colorFactory.getColor(ColorEnum.RED);
        color.draw();
    }
}
