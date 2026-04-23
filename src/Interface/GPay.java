package Interface;
public class GPay implements SeasonalOffers,Base {
	int amt=0;
	public void MoneyTransfer(){	
		int bal=1000;
		if (amt<=100 && amt>50){
			bal=bal-amt;
			System.out.println("Minimum 10 Cash " + "back received for transction amount of " + amt);
		bal=bal+10;	
		}
		else {System.out.println("Minimum 5 " + "Cash back received " + "for transction amount of "+ amt);}
		}
		public String season(String Name){ 
		
			if(Name.equals("Xmas")) {
				System.out.println("Flat 70% discount on " + "purchase of khadi Clothes for Diwali");
				
			}return "Comming Soon";
			
		}
		public static void main(String[] args) {
			GPay g=new GPay();
			g.amt=51; g.MoneyTransfer();
			System.out.println(g.season("Xmas" ));
		
	}

}
