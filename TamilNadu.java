package Oops;

public class TamilNadu extends SouthIndia {
	
	static String  captial1="chennai";
 public static void main(String[] args) {
	SouthIndia si=new TamilNadu();
	si.eat();
	si.dress();
	si.cultivate();
	si.livingStyle();
	si.nativeLanguage();
	
	 System.out.println(India.capital1);
	 System.out.println(TamilNadu.captial1);
	 
}
 void speakLanguage()
 {
	System.out.println("Speak English Fluently"); 
 }
 void eat()
 {
	 System.out.println("Eat healthy foods");
 }
 void dress()
 {
	 System.out.println("wear Dress properly");
 }
 void cultivate()
 {
	 System.out.println("Rice and sugar cane cultivation");
 }
 void livingStyle()
 {
	 System.out.println("Above average development");
 }
}
