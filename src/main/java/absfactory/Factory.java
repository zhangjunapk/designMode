package absfactory;

import absfactory.color.ColorFactoryImpl;
import absfactory.shape.ShapeFactoryImpl;

/**
 * @BelongsProject: testDesignMode
 * @BelongsPackage: absfactory
 * @Author: ZhangJun
 * @CreateTime: 2019-06-24 11:07
 * @Description: 工厂
 */
public class Factory{
    AbstractFactory getFactory(FactoryEnum factoryEnum){
        if(factoryEnum== FactoryEnum.SHAPE){
            return new ShapeFactoryImpl();
        }
        if(factoryEnum== FactoryEnum.COLOR){
            return new ColorFactoryImpl();
        }
        return null;
    }
}
