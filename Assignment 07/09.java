// sum of elements at odd index

class Demo{
	public static void main(String[]args){
	int arr[]={10,20,30,40,50};
	int sum=0;
	
	for(int i=0;i<arr.length;i++){
		if(i%2==1){
		sum=sum+arr[i];
		}
	}
	System.out.println("sum of elements at odd index:"+sum);
	}
}