package task.interview;

public abstract class Smartphone {
 
	abstract int call(int seconds);
	abstract void sendMessage();
	abstract void receiveCall();
	void browse()
	{
		System.out.println("smartphone browsing");
	}
	public Smartphone()
	{
		System.out.println("Smartphone under development");
	}
	

}
