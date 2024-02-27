class Array11{
	void rightRotate(int arr[],int d){
          int n=arr.length;
		  d=d%n;
          reverse(arr,0,d-1);
		  reverse(arr,d,n-1);
          reverse(arr,0,n-1);
	}
	
	void reverse(int[] arr,int low,int high){
		for(int i=low;i<(high+low)/2;i++){
			int x=arr[i];
			arr[i]=arr[high+low - i];
			arr[high+low - i]=x;
		}
	}
}
class Run{
	public static void main(String[] args){
		Array11 a=new Array11();
        int arr[]={1,2,3,4,5,6};
		a.rightRotate(arr,3);
		for(int i:arr){
			System.out.println(i);
		}
	}
}