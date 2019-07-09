package buildermode;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: buildermode
 * @Author: ZhangJun
 * @CreateTime: 2019-07-09 09:47
 * @Description: 选择套餐
 */
public class PackageSelection {
    private List<IFood> foods=new ArrayList<>();

    /**
     * 选择食物
     * @param food
     * @return
     */
    public PackageSelection addFood(IFood food){
        foods.add(food);
        return this;
    }

    /**
     * 结账
     * @return
     */
    public Double checkout(){
        double price = 0;
        for(IFood food:foods){
            price+=food.getPrice();
        }
        return price;
    }
    public List<IFood> takeFood(){
        return foods;
    }
}
