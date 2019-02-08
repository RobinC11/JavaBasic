// 연산처리(계산기)
// 주석입니다
// +, -, *, /
// 사용자가 값 입력
import java.util.Scanner;
public class 자바메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Thread.currentThread().getName()); 메인이 쓰레드로 동작함
		process();
		
	}
	
	// 전체 조립
	
	static void process() // index & 메인 => 프로세스의 역할을 함(web)
	{
		  Scanner scan=new Scanner(System.in);
		  System.out.print("첫번째 정수를 입력하세요:");
		  int a=scan.nextInt();
		  
		  System.out.print("연산자를 입력하세요(+,-,*,/):");
		  String op=scan.next();
		  
		  System.out.print("두번째 정수를 입력하세요:");
		  int b=scan.nextInt();
		  
		  calc(a,op.charAt(0),b);
		  // String을 char로 변경할 때 charat을 사용하면 됨
		  
		  
	}
	// 메소드 안에서 설정하는 변수 (1. 매개변수 2. 지역변수)
	// +
	static int plus(int a, int b)
	{
		int c=a+b; 
		// 지역변수 => 메소드를 수행하고 나면 사라지는 변수 => 블럭 영역 내에서만 사용하는 변수
		return a+b;
	}
	// -
	static int minus(int a, int b)
	{
		return a-b;
	}
	// *
	static int gop(int a, int b)
	{
		return a*b;
	}
	// /
	static double div(int a, int b)
	{
		double d=0.0;
		if(b==0) //에러처리
		{
			d=0.0;
			// return d; 조건에서 return명령을 실행하면 밑의 else까지 가지 않고 원하는 위치에서 바로 빠져나갈 수 있음. => 조건이 있을 때만 걸어줌
		}
		else
		{
			d=a/(double)b;
		}
		return d;
	}
	// 계산기
	static void calc(int a, char op, int b)
	{
		switch(op) // 값이 키값이기 때문에 if문보다 switch case가 더 적합함~
		{
		case '+':
			System.out.printf("%d%c%d=%d\n",a,op,b,plus(a,b));
			break;
		case '-':
			System.out.printf("%d%c%d=%d\n",a,op,b,minus(a,b));
			break;
		case '*':
			System.out.printf("%d%c%d=%d\n",a,op,b,gop(a,b));
			break;
		case '/':
			System.out.printf("%d%c%d=%.2f\n",a,op,b,div(a,b)); // 실수값이 넘어오기 때문에 %f~로 바꿔줄 것
			break;
		default: 
			System.out.println("사용할 수 없는 연산자입니다.");
		}
		
	}
}
