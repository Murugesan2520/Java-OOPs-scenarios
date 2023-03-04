package task.interview;

public class Samsung extends FactoryDemo {
	static int price=500;
public static void main(String[] args) {
	Samsung sam=new Samsung();
	sam.browse();
	System.out.println(sam.price);
}	

	@Override
	void verifyFingerPrint() {
		// TODO Auto-generated method stub
		System.out.println("VerifyFingerPrint");
	}

	@Override
	void providePattern() {
		// TODO Auto-generated method stub
		System.out.println("ProvidePattern");
	}

	@Override
	int call(int seconds) {
		// TODO Auto-generated method stub
		System.out.println("Call");
		return 0;
	}

	@Override
	void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("send Message");
	}

	@Override
	void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("receiveCall");
	}

}
