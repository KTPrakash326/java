abstract class Musician
{
	 abstract void sing();
}

class Vp extends Musician
{
	@Override
	void sing() 
	{
	System.out.println("Kannad singer");	
	}	
}

class Sn extends Musician
{
	@Override
	void sing() {
		System.out.println("Hindi singer");
	}
}

class Demo{
	public static void main(String[] args) {
		Musician v=new Vp();
		Musician s=new Sn();
		v.sing();
		s.sing();
	}
}