
package Scene_KFC.Test;
import Scene_KFC.Class.ProducerAndComcumer.*;
public class PAndCPatternTest {
    public static void pandcPatternTest ()
    {
        System.out.println("\n" +"----------------------------------------");
        System.out.println("31.生产者消费者模式(Producer consumer Pattern)：");
        System.out.println("\n"+"测试一：");

        Storage storage = new Storage();
        Producer p1=new Producer(storage);
        Producer p2=new Producer(storage);
        Consumer c1=new Consumer(storage);
        Consumer c2=new Consumer(storage);

        c1.setNum(10);
        p1.setNum(20);
        c2.setNum(30);
        p2.setNum(20);
        c1.start();
        c2.start();
        p1.start();
        p2.start();
        try{
            c1.join();
            c2.join();
            p1.join();
            p2.join();
        }catch (Exception e){

        }


        System.out.println("\n" +"----------------------------------------");
    }
}
