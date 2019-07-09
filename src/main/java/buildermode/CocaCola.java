package buildermode;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: buildermode
 * @Author: ZhangJun
 * @CreateTime: 2019-07-09 09:39
 * @Description: 可口可乐
 */
public class CocaCola implements IDrink {
    @Override
    public void eat() {
        System.out.println("咕噜咕噜~~~");
    }

    @Override
    public double getPrice() {
        return 4D;
    }

    @Override
    public FoodEnum getFoodType() {
        return FoodEnum.DRINK;
    }

    @Override
    public void touch() {
        System.out.println("刚才摸了一下，有点冰啊");
    }
}
