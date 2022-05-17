import java.util.*;
import java.util.function.*;
import java.util.function.Predicate;
public class TestStudent {

	public static void main(String[] args) {
		ArrayList<Student> stud=new ArrayList<>();
		stud.add(new Student("john",99));
		stud.add(new Student("Arjun",50));
		stud.add(new Student("ajay",59));
		stud.add(new Student("vinod",79));
		stud.add(new Student("json",89));
		stud.add(new Student("bob",91));
		Predicate<Student> p=s->s.marks>60;
		//p.test(new Student("john",99));
		Function<Student,String> f=	s->{
			int marks=s.marks;
			if(marks>=80) {
				return "A grade";
			}
			else if(marks>=60) {
				return "B grade";
			}
			else if(marks>=50) {
				return "C grade";
			}
			else if(marks>=35) {
				return "D grade";
			}
			else {
				return "fail";
			}
		};
		Consumer<Student> c=s->{
			System.out.println("Student name  "+s.name);
			System.out.println("Student marks "+s.marks);
			System.out.println("Student grade "+f.apply(s));
			System.out.println();
		};
		for(Student s:stud) {
			c.accept(s);
		}


	}

}
