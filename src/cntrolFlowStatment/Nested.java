package cntrolFlowStatment;

public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SBI bank card entre int pin 
		
		
		String bankcard ="SBI";
		int pint =347899;
		
		if (bankcard=="SBI")
		{
			System.out.println("This is correct bank");
			System.out.println("Then log in sucessufully");
			if(pint ==347899)
			{
				System.out.println("This is correct pin");
				System.out.println("Then witdraw cash");
			}
			else
			{
				System.out.println("plese entre correct pin");
			}
		}
		else
		{
			System.out.println("insert correct ATM card");
		}
		

	}

}
