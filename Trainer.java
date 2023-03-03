package task.interview;

public class Trainer {
	
  String dept="JAVA";
  String institute="payilagam";
  private int salary=10000;
   
  
  public int getSalary()
  {
	return salary;  
  }
  
  void training()
  {
	  System.out.println("Training");
  }

  
     Trainer(String dept,String institute)
     {
    	 
     }
  public static void main(String[] args)
  {
	Trainer trainerKumar=new Trainer("CSE","Payilagam");
  }
}
