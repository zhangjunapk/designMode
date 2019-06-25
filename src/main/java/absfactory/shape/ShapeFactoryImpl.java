package absfactory.shape;

import absfactory.AbstractFactory;
import absfactory.color.Color;
import absfactory.color.ColorEnum;

/**
 * @BelongsProject: testDesignMode
 * @BelongsPackage: absfactory.shape
 * @Author: ZhangJun
 * @CreateTime: 2019-06-24 11:27
 * @Description: 形状工厂实现
 */
public class ShapeFactoryImpl extends AbstractFactory {
    @Override
    public Color getColor(ColorEnum colorEnum) {
        return null;
    }

    @Override
    public Shape getShape(ShapeEnum shapeEnum) {
        if(shapeEnum== ShapeEnum.CIRCULAR){
            return new ShapeCircular();
        }
        if(shapeEnum== ShapeEnum.SQUARE){
            return new ShapeSquare();
        }
        return null;
    }
}
