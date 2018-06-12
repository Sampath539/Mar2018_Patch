
public class Q65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]
				= new int[4];
		a[0]=1;
		a[1]=2;
		a[2]=4;
		a[3]=5;
		int sum=0;
		try {
			for(int pos=0;pos<=4;pos++) {
				sum=sum+a[pos];
			}
		}catch(Exception e) {
			System.out.println("Invalid index");
		}
		System.out.println(sum);
	}

}
