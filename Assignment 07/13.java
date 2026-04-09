//Count element Greater than X

class Demo{
	public static void main(String[]args){
	int arr[]={1,5,3,7,2};
	int X=3;
	int count=0;

	for(int i=0;i<arr.length;i++){
		if(arr[i]>X){
		count++;
		}
	}
	System.out.println("Count of element greater than "+X+" is: "+count);
	}
}