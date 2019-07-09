package buildermode;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: buildermode
 * @Author: ZhangJun
 * @CreateTime: 2019-07-09 09:45
 * @Description: 冰淇淋
 */
public class IceCream implements IDessert {
    @Override
    public void eat() {
        System.out.println("冰淇淋，好吃");
    }

    @Override
    public double getPrice() {
        return 5D;
    }

    @Override
    public FoodEnum getFoodType() {
        return FoodEnum.DESSERT;
    }

    @Override
    public void look() {
        System.out.println("这冰淇淋，简直就是一件艺术品，开始吃了");
    }
}
