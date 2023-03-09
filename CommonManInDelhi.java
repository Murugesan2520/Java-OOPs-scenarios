package india.newDelhi;

import tamilnadu.chennai.TrafficRules;

public class CommonManInDelhi implements TrafficRulesDelhi,TrafficRules {
   public static void main(String[] args) {
	   CommonManInDelhi ob = new  CommonManInDelhi ();
	   ob.goByBicycle();
	   ob.dontGoByDieselVehicle();
	   ob.goByDieselVehicle();
}

@Override
public void dontGoByDieselVehicle() {
	// TODO Auto-generated method stub
	System.out.println("dnotGoByDieselvehicle");
}

@Override
public void goByBicycle() {
	// TODO Auto-generated method stub
	System.out.println("TrafficRulesDelhiinterface");
}

@Override
public void goByDieselVehicle() {
	// TODO Auto-generated method stub
	System.out.println("goDieselVehicle");
}
}
