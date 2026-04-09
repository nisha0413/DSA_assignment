// Strictly increasing:

class Demo{
	public static void main(String[]args){
	int arr[]={1,2,3,3};
	Boolean isIncreasing=true;

	for(int i=0;i<arr.length-1;i++){
		if(arr[i]>=arr[i+1]){
			isIncreasing=false;
				break;
			}
		}
	if(isIncreasing){
		System.out.println("Array is strictly increasing");
	}else{
		System.out.println("Array is not strictly increasing");
	}
   }
}