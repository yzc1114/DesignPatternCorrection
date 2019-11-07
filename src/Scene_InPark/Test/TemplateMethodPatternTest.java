package Scene_InPark.Test;

import Scene_InPark.Class.TourPlan.RealizePlayPlan;

import java.util.Scanner;

public class TemplateMethodPatternTest {
    public static void templateMethodPatternTest(){
        System.out.println("\n" +"----------------------------------------");
        System.out.println("17. 模板模式(Template Method)：");
        System.out.println("\n"+"测试:");

        Scanner scan = new Scanner(System.in);
        String morningPlan = "";

        //获取游园计划模板实例
        RealizePlayPlan mPlan = new RealizePlayPlan();

        //默认设置下午计划
        mPlan.setStrategy(1);

        System.out.println("这是迪士尼乐园为您精心推荐的游园规划：进入迪士尼 上午活动（由您决定） 吃午饭 过山车 游乐园 滑雪 出门离去 吃晚饭 去住宿");
        System.out.println("迪士尼有很多神秘的目的地可以探索，您上午的行程需要自己决定哦～：");
        if(scan.hasNextLine()) {
            morningPlan = scan.nextLine();
        }

        //设置早上游玩计划
        mPlan.setMorningPlan(morningPlan);

        //打印最终游园计划表
        mPlan.agendaForTheDay();

        System.out.println("----------------------------------------");
    }
}
