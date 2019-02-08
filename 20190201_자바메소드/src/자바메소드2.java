// return의 위치와 메소드 종료 (중간에서 종료)
// return ==> 메소드가 종료 
public class 자바메소드2 {

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
			System.out.println("display 강제종료");
			return;
		}
		System.out.println("display end...");
		return; // void는 return값을 생략 가능. Why? JVM에서 자동으로 추가해줌 (return명령)
	}
	
}
