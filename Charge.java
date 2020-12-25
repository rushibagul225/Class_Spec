public class Charge
{
	private final double x,y,z;
	
	public Charge(double c1,double c2,double c3)
	{
		x=c1;
		y=c2;
		z=c3;
	}
	
	public double potential(double rx,double ry)
	{
		double kx=1.23;
		double x1=rx-x;
		double x2=ry-y;
		return kx*x1*x2;
	}
	
	public String toString()
	{
		return x+"x: "+y+ "y: "+z+ "z: ";
	}

	public static void main(String[] args)
	{
		double rx=Double.parseDouble(args[0]);
		double ry=Double.parseDouble(args[1]);
		Charge charge=new Charge(1.2,2.3,4.5);
		double result=charge.potential(rx,ry);
		System.out.println("object reference variable "+Charge);

	}
}
