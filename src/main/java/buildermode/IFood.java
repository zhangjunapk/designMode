package buildermode;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: buildermode
 * @Author: ZhangJun
 * @CreateTime: 2019-07-09 09:38
 * @Description: 食物
 */
public interface IFood {
    void eat();
    double getPrice();
    FoodEnum getFoodType();
}
