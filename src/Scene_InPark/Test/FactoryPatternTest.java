package Scene_InPark.Test;

import Scene_InPark.Class.TourPlan.*;

public class FactoryPatternTest {
    public static void factoryPatternTest() {
        System.out.println("\n" +"----------------------------------------");
        System.out.println("19. 工厂模式(Factory Pattern)：");
        System.out.println("\n"+"测试:");

        //初始化策略工厂
        StrategyFactory myStrategies1 = new Strategy1Factory();
        StrategyFactory myStrategies2 = new Strategy2Factory();
        StrategyFactory myStrategies3 = new Strategy3Factory();

        //向策略工厂中添加策略
        myStrategies1.newStrategy("strategy1", "一哭", "二闹", "三上吊");
        myStrategies2.newStrategy("strategy2", "学习", "吃饭", "拔网线");
        myStrategies3.newStrategy("strategy3", "睡觉", "睡觉", "睡觉");

        //输出各策略工厂中策略地名字、项目、优势
        System.out.println("受委屈了怎么办：");
        myStrategies1.reportStrategy();
        System.out.println("想玩游戏怎么办：");
        myStrategies2.reportStrategy();
        System.out.println("发烧了怎么办：");
        myStrategies3.reportStrategy();
        System.out.println("\n" +"----------------------------------------");
    }
}
