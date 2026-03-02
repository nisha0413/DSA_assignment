import java.util.* ;

class Demo{
	public static void main(String[]args){
	System.out.print("input number:");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
				if((i+j)%2==0){
					System.out.print("*");
				}else{
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
}