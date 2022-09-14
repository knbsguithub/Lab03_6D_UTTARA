public class L3P8
{
	public static void main(String[] args)
	{
		int total=90, boys=45, AStud , ABoys=20 , AGirls ;
		int girls = total-boys;
		AStud=total*50/100; //50% of Total Students got A
		AGirls = AStud-ABoys;
		System.out.println("Total:"+total);
		System.out.println("Boys:"+boys);
		System.out.println("A Grade Boys:"+ABoys);
		System.out.println("Girls:"+girls);
		System.out.println("A Grade Girls:"+AGirls);
		System.out.println("Total A Grade Students:"+AStud);
	}
}