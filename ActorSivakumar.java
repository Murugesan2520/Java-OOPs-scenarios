package task.interview;

public class ActorSivakumar implements Actor {

	@Override
	public void act() {
		// TODO Auto-generated method stub
   System.out.println("Acting");
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
     System.out.println("Dancing");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
    System.out.println("Singing");
	}
	 static String address="Coimabtore";
	 
	 void speaking()
	 {
		System.out.println("ActorSivakumar is a motivational speaker "); 
	 }
	 ActorSivakumar(String age,String car)
	 {
		System.out.println("object specfic values"+age);
		System.out.println("object specfic values"+car);
	 }
	 ActorSivakumar()
	 {
		System.out.println("This is  no argument constructor"); 
	 }
	 public static void main(String[] args) {
		
	
	 ActorSivakumar as = new ActorSivakumar("65","Audicar");
	 as.act();
	 as.dance();
	 as.sing();
	 as.speaking();
	 System.out.println(address);
	 System.out.println(ActorSivakumar.address);
	 System.out.println(as.address);
	 Actor ac = new ActorSivakumar();
	 ac.act();
	 ac.dance();
	 ac.sing();
	 System.out.println(ac.address);
	 
	 }
}
