
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.currentTimeMillis();
		Section cap1=new Section("Playboy");
		cap1.add(new Image("Pamela Anderson"));
		Section Cap2=new Section("AutoShow");
		Cap2.add(new Image("My dream BMW"));
		Cap2.add(new Image("My car is a Trabi"));
		
		cap1.print();
		long endTime=System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}

}
