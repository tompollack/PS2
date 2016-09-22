package base;

public class MyInteger 
{
	private int iValue = 0;
	public MyInteger(int i)
	{
		iValue = i;
	}
	public int get()
	{
		return iValue;
	}
	public boolean isEven()
	{
		if(iValue%2 == 0)
			return true;
		else
			return false;
	}
	public boolean isOdd()
	{
		if(iValue%2 != 0)
			return true;
		else
			return false;
	}
	public boolean isPrime()
	{
		int place = 0;
		for (int i = 2; i < iValue/2;i++)
		{
			if(iValue%i == 0)
				place++;
		}
		if(place==0)
			return true;
		else
			return false;
	}
	public static boolean isEven(int i)
	{
		if(i%2 == 0)
			return true;
		else
			return false;
	}
	public static boolean isOdd(int i)
	{
		if(i%2 != 0)
			return true;
		else
			return false;
	}
	public static boolean isPrime(int i)
	{
		
		int place = 0;
		for (int j = 2; j < i/2;j++)
		{
			if(i%j == 0)
				place++;
		}
		if(place==0)
			return true;
		else
			return false;
	}
	public static boolean isEven(MyInteger i)
	{
		if(i.get()%2 == 0)
			return true;
		else
			return false;
	}
	public static boolean isOdd(MyInteger i)
	{
		if(i.get()%2 != 0)
			return true;
		else
			return false;
	}
	public static boolean isPrime(MyInteger i)
	{
		
		int place = 0;
		for (int j = 2; j < i.get()/2;j++)
		{
			if(i.get()%j == 0)
				place++;
		}
		if(place==0)
			return true;
		else
			return false;
	}
	public boolean equals(int i)
	{
		if(i == this.iValue)
			return true;
		else
			return false;
	}
	public boolean equals(MyInteger i)
	{
		if(i.get() == this.iValue)
			return true;
		else
			return false;
	}
}
