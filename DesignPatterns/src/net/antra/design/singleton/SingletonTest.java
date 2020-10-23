package net.antra.design.singleton;

import net.antra.design.scan.Apple;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;
import java.util.concurrent.*;

public class SingletonTest {
	public static void main(String[] args) throws ExecutionException, InterruptedException, IllegalAccessException, InvocationTargetException, InstantiationException {

//		SingletonD a = SingletonD.getInstance();
//		Constructor<SingletonD> con = (Constructor<SingletonD>) SingletonD.class.getDeclaredConstructors()[0];
//		con.setAccessible(true);
//		SingletonD b = con.newInstance();
//		System.out.println(a == b); // cannot work in singletonA

		Runnable r = ()->System.out.println(SingletonB.getInstance());
//		Runnable r1 = new Runnable(){
//			public void run() { 
//				System.out.println(SingletonA.getInstance());		
//			}
//		};
		ExecutorService es = Executors.newFixedThreadPool(40);
		for(int i = 0 ; i < 50; i++){
			es.submit(r);
		}
//		es.shutdown();

		Callable<String> c = ()->{
			Thread.sleep(5000);
			return "Apple";
		};
		Future<String> f = es.submit(c);
		System.out.println("1");
		System.out.println(f.get());
		System.out.println("2");
		es.shutdown();
	}
}
