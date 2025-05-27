package hello;

 class Student {
		void marks()
		{
			int score=100;
			System.out.println("Student score is:"+score);
		}
}
	
	class Inheritence extends Student{
		void marks()
		{
			int score=200;
			System.out.println("Student score is:"+score);
		}
	

	public static void main(String[] args) {
		Inheritence i=new Inheritence();
		i.marks();
		i.marks();
	}
	}