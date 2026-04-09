//find max element;

class Demo{
	public static void main(String[]args){
	int arr[]={3,9,1,7};
	int max=0;
	
	for(int i=0;i<arr.length-1;i++){
		if(arr[i]>arr[i+1]){
		max=arr[i];
		}
	}
	System.out.println("Maximum element is:"+max);
	}
}