package net.antra.design.singleton;

public class SingletonD {
//	private static volatile SingletonD instance= null; // visitable in main memory(让cache里的改变即使存到main memory里）让指令保持顺序
//	private SingletonD(){}
//	public static SingletonD getInstance(){
//		if(instance == null){
//			synchronized(SingletonD.class)
//			{
//				if(instance == null){
//					instance = new SingletonD();
//				}
//			}
//		}
//		return instance;
//	}

	private static volatile SingletonD instance;

	private SingletonD() {}

	public static SingletonD getInstance() {
		if(instance == null) {
			synchronized(SingletonD.class) {
				if(instance == null) {
					instance = new SingletonD();
				}
			}
		}
		return instance;
	}
}
