// ����ó��(����)
// �ּ��Դϴ�
// +, -, *, /
// ����ڰ� �� �Է�
import java.util.Scanner;
public class �ڹٸ޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Thread.currentThread().getName()); ������ ������� ������
		process();
		
	}
	
	// ��ü ����
	
	static void process() // index & ���� => ���μ����� ������ ��(web)
	{
		  Scanner scan=new Scanner(System.in);
		  System.out.print("ù��° ������ �Է��ϼ���:");
		  int a=scan.nextInt();
		  
		  System.out.print("�����ڸ� �Է��ϼ���(+,-,*,/):");
		  String op=scan.next();
		  
		  System.out.print("�ι�° ������ �Է��ϼ���:");
		  int b=scan.nextInt();
		  
		  calc(a,op.charAt(0),b);
		  // String�� char�� ������ �� charat�� ����ϸ� ��
		  
		  
	}
	// �޼ҵ� �ȿ��� �����ϴ� ���� (1. �Ű����� 2. ��������)
	// +
	static int plus(int a, int b)
	{
		int c=a+b; 
		// �������� => �޼ҵ带 �����ϰ� ���� ������� ���� => �� ���� �������� ����ϴ� ����
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
		if(b==0) //����ó��
		{
			d=0.0;
			// return d; ���ǿ��� return����� �����ϸ� ���� else���� ���� �ʰ� ���ϴ� ��ġ���� �ٷ� �������� �� ����. => ������ ���� ���� �ɾ���
		}
		else
		{
			d=a/(double)b;
		}
		return d;
	}
	// ����
	static void calc(int a, char op, int b)
	{
		switch(op) // ���� Ű���̱� ������ if������ switch case�� �� ������~
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
			System.out.printf("%d%c%d=%.2f\n",a,op,b,div(a,b)); // �Ǽ����� �Ѿ���� ������ %f~�� �ٲ��� ��
			break;
		default: 
			System.out.println("����� �� ���� �������Դϴ�.");
		}
		
	}
}
