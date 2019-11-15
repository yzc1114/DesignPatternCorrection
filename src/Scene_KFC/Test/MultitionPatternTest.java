package Scene_KFC.Test;
import Scene_KFC.Class.Tourist;
public class MultitionPatternTest {

	public static void main(String[] args) {
		multitionPatternTest();
	}
	public static void multitionPatternTest() {
		System.out.println("\n"+"测试：");
		System.out.println("\n" +"----------------------------------------");
		System.out.println("24. 多例模式(Multition)：");

		Tourist tom = new Tourist("Tony");
		tom.gotoKFC();

		System.out.println("访问随机KFC门店成功");
		tom.gotoKFC(0);
		tom.gotoKFC(1);
		System.out.println("访问指定门店成功");
        System.out.println("----------------------------------------" + "\n");
	}

}
