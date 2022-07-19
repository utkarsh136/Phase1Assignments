package typecasting;

public class typecasting {

	public static void main(String[] args) {
		char c='U';
		//implicit
		int a=c;//changing an character into integer by implicit casting
		System.out.println(a);
		float f=c;//changing an character into float by implicit casting
		System.out.println(f);
		//explicit type casting
		int y=(int)f;
		System.out.println(y);
		char b=(char)f;
		System.out.println(b);
		
		// TODO Auto-generated method stub

	}

}
