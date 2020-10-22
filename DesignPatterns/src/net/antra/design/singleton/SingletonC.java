package net.antra.design.singleton;

// not recommend. to slow
public class SingletonC {
	private static SingletonC instance= null;
	private SingletonC(){
	}
	public synchronized static SingletonC getInstance(){
		if(instance == null){
			instance = new SingletonC();
		}
		return instance;
	}
}
