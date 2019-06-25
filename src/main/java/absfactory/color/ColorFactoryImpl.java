package absfactory.color;

import absfactory.AbstractFactory;
import absfactory.shape.Shape;
import absfactory.shape.ShapeEnum;

/**
 * @BelongsProject: testDesignMode
 * @BelongsPackage: absfactory.color
 * @Author: ZhangJun
 * @CreateTime: 2019-06-24 11:19
 * @Description: 抽象颜色工厂
 */
public  class ColorFactoryImpl extends AbstractFactory {

    @Override
    public Color getColor(ColorEnum colorEnum) {
        if(colorEnum==ColorEnum.RED){
            return new ColorRed();
        }
        if(colorEnum==ColorEnum.YELLOW){
            return new ColorYellow();
        }
        return null;
    }

    @Override
    public Shape getShape(ShapeEnum shapeEnum) {
        return null;
    }
}
