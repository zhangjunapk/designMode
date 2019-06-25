package absfactory;

import absfactory.color.Color;
import absfactory.color.ColorEnum;
import absfactory.shape.Shape;
import absfactory.shape.ShapeEnum;

/**
 * @BelongsProject: testDesignMode
 * @BelongsPackage: absfactory
 * @Author: ZhangJun
 * @CreateTime: 2019-06-24 10:45
 * @Description: 抽象工厂
 */
public abstract class AbstractFactory {
    abstract public Color getColor(ColorEnum colorEnum);
    abstract public Shape getShape(ShapeEnum shapeEnum);
}
