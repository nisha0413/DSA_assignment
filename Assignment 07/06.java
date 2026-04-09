//any element is negative:

class Demo{
	public static void main(String[]args){
	int arr[]={1,2,-3,4};
	Boolean isnegative = false;

	for(int i=0;i<arr.length;i++){
	if(arr[i]<0){
		isnegative=true;
		break;
			}
		}
	if(!isnegative){
		System.out.println("no element is negative");
	}else{

		System.out.println("elements are negative ");
	}
}
}