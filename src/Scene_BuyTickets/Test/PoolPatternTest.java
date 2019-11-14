package Scene_BuyTickets.Test;

import Scene_BuyTickets.Class.Pool.Connection;
import Scene_BuyTickets.Class.Pool.Pool;

import java.util.Scanner;

public class PoolPatternTest {
    public static void poolPatternTest(){
        System.out.println("9. 对象池模式(ObjectPoolPattern):");  
        System.out.println("\n测试:");  
        System.out.println("当前对象池共有5个空连接等待");  
  
        String con1_name="connect1";  
        Pool pool = new Pool();    
        Connection conn = new Connection(con1_name);  
        pool.get(conn);  
        Thread.sleep(1000);  
        pool.release(conn);  
        System.out.println("----------------------------------------" + "\n");  
    }
}

//System.out.println("");