package NewPackage;

public class GetMaxAndMin {
	public void getSmallestAndLargestFromOneDimensionlArray() {
		//THIS IS HOW WE GET AN SMALLEST AND LARGEST NUMBER FROM AN ARRAY
		
		int[]oneDimensional= {3,5,9,8};
		int smallest=oneDimensional[0];
		int largest=oneDimensional[0];
		for(int i=0; i<oneDimensional.length;i++) {
			if(oneDimensional[i]<smallest) {
				smallest=oneDimensional[i];
			}
			if(oneDimensional[i]>largest) {
				largest=oneDimensional[i];
			}
			
		}System.out.println("we found smallest number from an oneDimensional array::" + smallest);
		System.out.println("we found largest number from an oneDimensional array::" + largest);
	}
	
	public void getLargestAndSmallest() {
		
		//THIS IS HOW WE GET SMALLEST AND LARGEST NUMBER FROM AN ARRAY FOR TWO DIMENSIONAL ARRAY
	int[][]arr= {{4,10,8,9},{1, 13,2,1}};
	
 int smallest=arr[0][0];
 int largest =arr[0][0];
	for(int i=0; i<arr.length;i++) {
		for(int j =0; j<arr.length;j++) {
		
		  if(arr[i][j]<smallest){
			  smallest=arr[i][j];	
		   } 
		  if(arr[i][j]>largest) {
			  largest=arr[i][j];}
		  }
	} System.out.println("we found smallest value from an array::" + smallest);
	System.out.println("we found largest nuber out of an array::" + largest);
		
		
	}

	public static void main(String[] args) {
		GetMaxAndMin gmm = new GetMaxAndMin();
		gmm.getSmallestAndLargestFromOneDimensionlArray();
		gmm.getLargestAndSmallest();
		


	}

}
