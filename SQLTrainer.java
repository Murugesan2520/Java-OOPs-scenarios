package task.interview;

public class SQLTrainer extends Trainer {
	
	SQLTrainer(){
		super("CSE","Payilagam");
	}
	public static void main(String[] args) {
		
	
 SQLTrainer ram=new SQLTrainer();
 System.out.println(ram.dept);
 System.out.println(ram.institute);
 System.out.println(ram.getSalary());
 ram.training();
}
}