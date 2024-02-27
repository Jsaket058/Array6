class Array9{
	void rightRotate(int arr[]){
	int n=arr.length;
	int x=arr[n-1];
	for(int i=n-1;i>0;i--){
		arr[i]=arr[i-1];
	}
	arr[0]=x;
	}
}
class Run{
	public static void main(String[] args){
        Array9 a=new Array9();
        int arr[]={1,2,3,4,5,6};
		a.rightRotate(arr);
		for(int i:arr){
			System.out.println(i);
		}
	}
}