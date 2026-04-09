//second largest:

class Demo {
    public static void main(String[] args) {
        int arr[]={10, 5, 8, 20, 15};
	int largest=arr[0];
        int secLargest=arr[0];

        for (int i=1; i<arr.length;i++) {
            if(arr[i] > largest) {
		secLargest=largest;
		largest=arr[i];
	}
	else if(arr[i]>secLargest && arr[i] !=largest){
	secLargest=arr[i];
}	 
}
	System.out.println("Second largest:"+ secLargest);               
	


}
}