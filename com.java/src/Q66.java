import java.util.ArrayList;

public class Q66 {

	static ArrayList<String> nameL = new ArrayList<>();
	public Q66(String name) {
		this.nameL.add(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q66 q1 = new Q66("q1");
		Q66 q2= new Q66("q2");
		Q66 q3 = new Q66("q3");
		try {
			
		q1=q3;
			//System.gc();
		q3=q2;
		//System.gc();
		q2=null;
		
		System.gc();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exc");
		}

	}
	protected void finalize() {
		System.out.println(nameL);
	}
	

}
