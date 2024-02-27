class Array10{
	void rightRotate(int arr[],int d){
	int n=arr.length;
	d=d%n;
	int temp[]=new int[d];
	for(int i=d;i>0;i--){
		temp[d-i]=arr[n-i];
	}
	for(int i=0;i<n-d;i++){
		arr[i+d]=arr[i];
	}
	for(int i=0;i<d;i++){
		arr[i]=temp[i];
	}
	}
}
class Run{
	public static void main(String[] args){
        Array10 a=new Array10();
        int arr[]={1,2,3,4,5,6};
		a.rightRotate(arr,3);
		for(int i:arr){
			System.out.println(i);
		}
	}
}