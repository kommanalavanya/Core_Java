public class Day2Task {
	public static void main(String[] args) {
		Chocolate c[]=new Chocolate[10];
		int temp=0;
		int temp1=0;
		Chocolate cadburydairymilk=new Chocolate("DarkMilk",2.00,
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
		c[0]=cadburydairymilk;
		c[1]=fivestar;
		c[2]=snickers;
		c[3]=darkFantasy;
		c[4]=kitkat;
		c[5]=munch;
		c[6]=perk;
		c[7]=milkybar;
		c[8]=alpenliebe;
		c[9]=kaccha;
		
		double max=c[0].price;
		double min=c[0].weight;
		//Find the costliest price of chocolate
		for(int i=1;i<c.length;i++)
		{
			if(c[i].price>max){
				max=c[i].price;
				temp=i;
			}
		}
		System.out.println("The costliest chocolate is "+c[temp].description
				+" and the price is  "+max);
		//find the chocolate with least weight
		for(int i=1;i<c.length;i++)
		{
			if(c[i].weight<min)
			{
				min=c[i].weight;
				temp1=i;
			}
		}
		System.out.println("The chocolate with least weight is "
		+c[temp1].description+" and the weight is  "+min);
	}

}
