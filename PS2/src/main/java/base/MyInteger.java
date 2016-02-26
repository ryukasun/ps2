package base;

public class MyInteger {
	
	private int iValue;
	
	
	public MyInteger(int Value){
		iValue = Value;
		
		
	}
	
	public int get_iValue(){
		return (iValue);
		
	}

	public boolean isEven() {
		return (get_iValue()%2 == 0);
	}
	public boolean isOdd() {
		return (get_iValue()%2 == 1);
	}
	public boolean isPrime() {
		if(get_iValue() > 2 && (get_iValue() & 1)==0)
			return false;
		for(int x = 3;x*x <= get_iValue();x+=2)
			if (get_iValue() % x == 0)
				return false;
		return true;
	}
	
	public static boolean isEven(MyInteger Value){
		return (Value.isEven());
	}
	public static boolean isOdd(MyInteger Value){
		return (Value.isOdd());
	}
	public static boolean isPrime(MyInteger Value){
		return (Value.isPrime());
	}
	
	
	public static boolean isEven(int Value){
		return (Value%2 == 0);
	}
	public static boolean isOdd(int Value){
		return (Value%2 == 1);

	}
	public static boolean isPrime(int Value){
		if(Value > 2 && (Value & 1)==0)
			return false;
		for(int x = 3;x*x <= Value;x+=2)
			if (Value % x == 0)
				return false;
		return true;
	}
	
	public boolean equals(int Value){
		return (Value == iValue);
	}
	public boolean equals(MyInteger Value){
		return (Value.get_iValue() == iValue);
	
	}



}
