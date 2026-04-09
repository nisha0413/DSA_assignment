// last occurrence:

class Demo{
	public static void main(String[]args){
	int arr[]={5,2,3,2,4};
	int target=2;
	
	for(int i=arr.length-1;i>=0;i--){
	if(arr[i]==target){
		System.out.print(i);
		break;
		}
	}
}
}