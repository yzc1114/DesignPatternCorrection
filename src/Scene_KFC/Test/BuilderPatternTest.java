package Scene_KFC.Test;


import Scene_KFC.Class.meal.*;
/*
*建造者模式的测试类
 */
public class BuilderPatternTest {
    public static void builderPatternTest() {
        Director director = new Director();
        MealBuilder A_mealbuilder=new AMealBuilder();
        MealBuilder B_mealbuilder=new BMealBuilder();
        director.setMealBuilder(A_mealbuilder);
        director.constructMeal();;
        NormalMeal mealA=director.getMeal();
        System.out.println("\n" +"----------------------------------------");
        System.out.println("29. 建造者模式(Builder)：");
        System.out.println("\n测试:");
        System.out.println("创建A套餐");
        System.out.println("A Meal");
        mealA.showItems();
        System.out.println("Total Cost: " +mealA.getCost());
        System.out.println("创建A套餐成功");
        director.setMealBuilder(B_mealbuilder);
        director.constructMeal();;
        NormalMeal mealB=director.getMeal();
        System.out.println("创建B套餐");
        System.out.println("B Meal");
        mealB.showItems();
        System.out.println("Total Cost: " +mealB.getCost());
        System.out.println("创建B套餐成功");
        System.out.println("----------------------------------------" + "\n");

    }
}
