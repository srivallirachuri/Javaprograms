package hello;

 class Students {
		void marks()
		{
			int score=100;
			System.out.println("Student score is:"+score);
		}
}
	
	class Stu2 extends Students{
		void marks()
		{
			int score=200;
			System.out.println("Student score is:"+score);
		}
	}
		class Stu3 extends Stu2{
			void marks()
			{
				int score=400;
				System.out.println("Student score is:"+score);
			}
		}
		class Minheritence
		{

	public static void main(String[] args) {
	       Stu3 m=new Stu3();
		m.marks();
		m.marks();
		m.marks();
	}
		}
	