package buildermode;

import java.util.List;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: buildermode
 * @Author: ZhangJun
 * @CreateTime: 2019-07-09 09:35
 * @Description:
 */
public class Content {
    public static void main(String[] args) {
        PackageSelection packageSelection =new PackageSelection();
        Double checkout = packageSelection.addFood(new IceCream()).addFood(new Hamburg()).addFood(new CocaCola()).checkout();
        System.out.println("结账喽:---> "+checkout);

        List<IFood> iFoods = packageSelection.takeFood();
        for(IFood food:iFoods){
            //接下来判断食物类型
            switch (food.getFoodType()){
                case MEAT:{
                    //肉要先闻一下香不香，香就是好肉
                    ((IMeat)food).smell();
                    food.eat();
                    break;
                }
                case DRINK:{
                    //喝的一定要先用手感受一下他的温度
                    ((IDrink)food).touch();
                    food.eat();
                    break;
                }
                case DESSERT:{
                    //甜品一定要先欣赏
                    ((IDessert)food).look();
                    food.eat();
                    break;
                }
                case VEGETARIAN:{
                    //素食要先感受下
                    ((IVegetarian)food).feeling();
                    food.eat();
                    break;
                }
                default:{
                    food.eat();
                    break;
                }
            }
        }
    }
}
