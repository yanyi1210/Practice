package yy.practice.datastructure.chapter6;

public class MergeSort {

	static int[] array1={1,5,7};
	static int[] array2={2,7,9};

	public static void main(String[] args) {
		displayArray(array1);
		displayArray(array2);
		int[] resultArray = doMerge(array1, array2);
		displayArray(resultArray);

	}

	private static int[] doMerge(int[] array1, int[] array2) {
		int length1 = array1.length;
		int length2 = array2.length;
		int[] result = new int[length1 + length2];
		int index1 = 0;
		int index2 = 0;
		int index = 0;

		while (index1 < length1 && index2 < length2) {
			if (array1[index1] <= array2[index2]) {
				result[index] = array1[index1];
				index1++;
			} else {
				result[index] = array2[index2];
				index2++;
			}
			index++;
		}

		while (index1 < length1) {
			result[index] = array1[index1];
			index1++;
			index++;
		}
		while (index2 < length2) {
			result[index] = array2[index2];
			index2++;
			index++;
		}
		return result;
	}
	
//	public static int[] mergeSort(int[] input){
//		
//	}
	
	
	public static void displayArray(int[] array){
		
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"; ");
		}
		System.out.println("");
	}

}
