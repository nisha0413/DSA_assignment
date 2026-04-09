// check if array contains the target

class Demo{
	public static void main(String[]args){
	int arr[]={1,2,3,4};
	int target=5;
	boolean contain=false;

	for(int i=0;i<arr.length;i++){
		if(arr[i]==target){
			contain=true;
			break;
		}
	}
	if(!contain){
		System.out.print("Array does not contains the target");
		}else{
			System.out.print("Array  contains the target");
		}

	}

}