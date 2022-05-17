
public class Post {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String contacts[]= {"john","doe","json"};
	CreatePosts m=new CreatePosts("lavanya","urgentcallsonly",
	"998765433",contacts,"lavanya6@gmail.com");
	     m.register();
        System.out.println(m.getname());
        System.out.println(m.getabout());
        System.out.println(m.getPhoneno());
        System.out.println(m.getemail());
        
     
        

	}

}
