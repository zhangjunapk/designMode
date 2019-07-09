package buildermode;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: buildermode
 * @Author: ZhangJun
 * @CreateTime: 2019-07-09 09:44
 * @Description: 水饺
 */
public class Dumplings implements IMeat {
    @Override
    public void eat() {
        System.out.println("吃饺子，没想到吧，这里也有饺子");
    }

    @Override
    public double getPrice() {
        return 10D;
    }

    @Override
    public FoodEnum getFoodType() {
        return FoodEnum.MEAT;
    }

    @Override
    public void smell() {
        System.out.println("这饺子，真香，我开始吃了");
    }
}
