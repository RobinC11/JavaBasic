// return�� ��ġ�� �޼ҵ� ���� (�߰����� ����)
// return ==> �޼ҵ尡 ���� 
public class �ڹٸ޼ҵ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}
	static void process()
	{
		display(3);
	}
	static void display(int a)
	{
		System.out.println("display start...");
		if(a==3)
		{
			System.out.println("display ��������");
			return;
		}
		System.out.println("display end...");
		return; // void�� return���� ���� ����. Why? JVM���� �ڵ����� �߰����� (return���)
	}
	
}
