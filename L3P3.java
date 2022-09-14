public class L3P3
{
	public static void main(String[] args)
	{
		/*a
		/*int i = 0;
		boolean t = true;
		boolean f = false, b;
		b = (t & ((i++) == 0));
		System.out.println(b);
		b = (f & ((i+=2) > 0));
		System.out.println(b);
		System.out.println(i);*/
		
		/*b
		/*int x=5;
		x=x++ *2 +3*-x;
		System.out.println(x);*/
		
		/*c
		/*int a=9;
		a++;
		System.out.println(a);
		a-=a---a;
		System.out.println(a);*/
		
		/*d
		/*int a=7;
		a+=a++ + ++a + --a + a-- ;
		System.out.println(a);*/
		
		/*e
		/*int x = 20;
		int y = 10;
		double z = x++ - y * 7 / --y + x * 10;
		System.out.println(z);*/
		
		/*f
		int a = 12 + 21 * 3 - 9 / 2;
		int b = 14 - 32 * 4 + 175 / 8 - 3;
		if(++a > 71 && --b < 20)
		{
			System.out.println("a = " + a + " b = " + b);
		}
		if(b-- == -97 || a-- < 100)
		{
			System.out.println("a = " + a + " b = " + b);
		}*/
		
		/*g
		boolean mola = true;
		boolean katthe = false;
		boolean chiratae = true;
		if (mola & katthe | katthe & chiratae | katthe)
			System.out.print("DOGGIE ");
		if (mola & katthe | katthe & chiratae | katthe | mola)
			System.out.println("CATTIE");*/
		
		/*h
		int x = 2, y = 5;
		int exp1 = (x * y / x);
		int exp2 = (x * (y / x));
		System.out.println(exp1);
		System.out.println(exp2);*/
		
		/*i
		int x = y = z = 10;
		System.out.println(x + " " + y + " " + z);
		
		int x = 10, y = 5;
		int exp1 = (y * (x / y + x / y));
		int exp2 = (y * x / y + y * x / y);
		System.out.println(exp1);
		System.out.println(exp2);*/
		
		/*j
		double exp1 = 3.0*2/4;
		int exp2 = (3* -2%4);
		System.out.println(exp1);
		System.out.println(exp2);*/
		
		/*k
		int x = 9, y = 12, z = 3;
		int exp1 = x - y/3 + z * 2 - 1;
		int exp2 = (x - y)/3 + ((z * 2) - 1);
		System.out.println(exp1);
		System.out.println(exp2);*/
		
		/*m
		int x = 9, y = 12;
		int a = 2, b = 4, c = 6;
		int exp = (3 + 4 * x)/5 - 10 * (y - 5) * (a + b + c)/x + 9 * (4/x + (9 + x)/y);
		System.out.println(exp);*/
		
		/*n
		int x = 9, y = 12;
		int a = 2, b = 4, c = 6;
		int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
		System.out.println(exp);*/
		
		/*o
		int x = 9, y = 12;
		int a = 2, b = 4;
		boolean exp = 4/3 * (x + 34) < 9 * (3 + y * (2 + a)) / (a + b*y);
		System.out.println(exp);*/
		
		/*p
		int x = 200, y = 50, z = 100;
		if(x > y && y > z)
		{
		System.out.println("Hello");
		}
		if(z > y && z < x)
		{
		 System.out.println("Java");
		}
		if((y+200) < x && (y+150) < z)
		{
		 System.out.println("Hello Java");
		}*/
		
		/*q
		int x = 20, y = 30, z = 50;
		x += y;
		y -= x + z;
		z *= x * y;
		System.out.println("x = " +x );
		System.out.println("y = " +y );
		System.out.println("z = " +z );*/
		
		/*r
		int x = 1, y = 2, z = 5;
		if(x == 1 || x > y || x > z)
		{
			System.out.println("One");
		}
		if(x == y || y == 2 || z == 5)
		{
			System.out.println("Two");
		}
		if(x == y || y == z || z == x)
		{
			System.out.println("Three");*/
			
		/*s	
		int x = 1, y = 2, z = 5;
		System.out.println("x: " +(!((x + 2) == (1 + 2))));
		System.out.println("y: " +(!(y == z)));
		System.out.println("z>x: " +(!(z > x)));
		if(!(x == y) && ((y + 5) > z) && (!((z - 3) == 0)))
		{
			System.out.println("Hello");
		}
		else
			System.out.println("bye");*/
	}
}