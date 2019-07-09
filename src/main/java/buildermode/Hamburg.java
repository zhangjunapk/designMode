package buildermode;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: buildermode
 * @Author: ZhangJun
 * @CreateTime: 2019-07-09 09:40
 * @Description: 汉堡
 */
public class Hamburg implements IMeat {
    @Override
    public void eat() {
        System.out.println("双层汉堡，真香~~~");
    }

    @Override
    public double getPrice() {
        return 15D;
    }

    @Override
    public FoodEnum getFoodType() {
        return FoodEnum.MEAT;
    }

    @Override
    public void smell() {
        System.out.println("这汉堡，羊肉味儿+驴肉味儿，迫不及待了");
    }
}
