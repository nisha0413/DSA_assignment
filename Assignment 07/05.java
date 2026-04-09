// all elements are even

class Demo{
	public static void main(String[]args){
	int arr[]={2,4,6};
	boolean alleven=true;

	for(int i=0;i<arr.length;i++){
	if(arr[i]%2==1){
		alleven=false;
		break;
		}
	}
	if(!alleven){
		System.out.println("All elements are not even");
	}else{
		System.out.println("All elements are even");
	}
}
}