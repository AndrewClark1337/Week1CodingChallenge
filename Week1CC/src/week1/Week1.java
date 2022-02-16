package week1;

import java.util.ArrayList;

public class Week1 {

	public static String actualMemorySize(String size) {
		// TODO Auto-generated constructor stub
		
		String units = size.substring(size.length()-2, size.length());
		String num = size.substring(0, size.length()-2);
		float n = Float.valueOf (num).floatValue (); 
		n = (float) (n *.93);
		int x=0;
		String type="f";
		//System.out.println(units);
		if(n<1 && units.equals("GB"))
		{
	
			n = n*1000;
			units="MB";
		}
		if(units.equals("MB"))
		{
		
			type = "i";
			x =(int) n;
		}
		
		
		//System.out.println(n);
		if (type == "f")
		{
			String actual=String.valueOf(n)+units;
			return actual;
		}
		else
		{
			String actual=String.valueOf(x)+units;
			return actual;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(actualMemorySize("32GB"));
		System.out.println(actualMemorySize("2GB"));
		System.out.println(actualMemorySize("512MB"));
		
	}

}
