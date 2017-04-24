
public class MergeSort {

	public static void mergeSort(int[] arr){
		int n = arr.length;
		
		if(n<2){
			return;
		}
		int mid = n/2;
		int[] leftArr = new int[mid];
		int[] rightArr = new int[n-mid];
		for(int i=0;i<mid;i++){
			leftArr[i] = arr[i];
		}
		for(int i= mid;i<n;i++){
			rightArr[i-mid] = arr[i];
		}
		mergeSort(leftArr);
		mergeSort(rightArr);
		merge(leftArr,rightArr,arr);
	}
	
	public static int[] merge(int[] leftArr, int[] rightArr, int[] arr){
		
		int i=0,j=0,k=0;
		while(i<leftArr.length && j<rightArr.length){
			if(leftArr[i]<rightArr[j]){
				arr[k] = leftArr[i];
				i++;
			}
			else{
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while(i<leftArr.length){
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while(j<rightArr.length){
			arr[k] = rightArr[j];
			j++;
			k++;
		}
		return arr;
	}
	
	public static void main(String[] args){
		int[] input = {59,7,99,155,22,3,46,02,15};
		mergeSort(input);
		for(int i=0;i<input.length;i++){
		System.out.println(input[i]);
		}
	}
}
