
public class CreateStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChocolateStore store=new ChocolateStore();
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
	
		   Chocolate[] chocolateArray=new Chocolate[10];
		   chocolateArray[0]= cadburydairymilk;
		   chocolateArray[1]=fivestar;
		   chocolateArray[2]=snickers;
		   chocolateArray[3]=darkFantasy;
		   chocolateArray[4]=kitkat;
		   chocolateArray[5]=munch;
		   chocolateArray[6]=perk;
		   chocolateArray[7]=milkybar;
		   chocolateArray[8]=alpenliebe;
		   chocolateArray[9]=kaccha;
		   store.setChocolates(chocolateArray);
		   Chocolate c[]=store.getChocolates();
		   for(Chocolate c1:c){
				System.out.println(c1);
			}
		   System.out.print(cadburydairymilk.getClass().getName());

	}

}
