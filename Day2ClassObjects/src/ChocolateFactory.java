
public class ChocolateFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Chocolate cadburydairymilk=new Chocolate("DarkMilk",156.00,
				199.00,"Paperbox",false);
	Chocolate fivestar=new Chocolate("new soft bar",25.00,10.00,
			   "silverfoil",false);
	Chocolate snickers=new Chocolate("peanutfilledchocalte",
			   100.00,50.00,"silverfoil",false);
	Chocolate darkFantasy=new Chocolate("Chocofills",75.00,210.00,
			"paperbox",false);
	Chocolate kitkat=new Chocolate("Rich Choco fudge",27.5,19.00,
			"papercover",true);
	Chocolate munch=new Chocolate("long chocolate bar",208.00,85.00,
			"silverfoil",false);
	Chocolate perk=new Chocolate("Home treats",28.00,10.00,
			"papercover",false);
	Chocolate milkybar=new Chocolate("More yummy",25.00,18.80,
			"silverfoil",false);
	Chocolate alpenliebe=new Chocolate("cream strawberry",152.00,47.00,
			"plasticcover",true);
	Chocolate kaccha=new Chocolate("mango bite",27.00,10.00,
			"plasticcover",true);
	
	
//	   System.out.println(cadburydairymilk);
//	   System.out.println(fivestar);
//	   System.out.println(snickers);	
//	   System.out.println(darkFantasy);	
//	   System.out.println(kitkat);	
//	   System.out.println(munch);	
//	   System.out.println(perk);	
//	   System.out.println(milkybar);	
//	   System.out.println(alpenliebe);	
//	   System.out.println(kaccha);	
	   boolean result=cadburydairymilk==kaccha;
	   System.out.println(result);
	   if(cadburydairymilk instanceof Chocolate &&
			   fivestar instanceof Chocolate) {
		   result=cadburydairymilk==snickers;
		   System.out.println("using instanceof "+result);
	   }
	   Chocolate chok=cadburydairymilk;
	    result=(cadburydairymilk==chok);
	    System.out.println(result);
	   
	 
	   
	   
	   
	   
	   
	   
	   
	}

}
