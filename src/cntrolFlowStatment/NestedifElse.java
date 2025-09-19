package cntrolFlowStatment;

public class NestedifElse {

	public static void main(String[] args) {
		//if ke andar if
		//two condition astil tr NestedIfElse
		
		
		//usrname password filed
		
		String usrname = "poojadethe";
		String passowrd = "pooja457";
		
		if ( usrname=="poojadethe")
		{
			System.out.println("username is correct");
			System.out.println("log in sucesfully");
			if(passowrd=="pooja457")
			{
		           System.out.println("Entre correct pasword ");
		           System.out.println("log in sucessfully");
			}
			else 
			{
				System.out.println("kindliy entre correct password");
			}
		

	   }
		else
		{
			 System.out.println("Entre correct username");
			 
		}

}}
