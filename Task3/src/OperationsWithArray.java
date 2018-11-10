
public class OperationsWithArray {

	public static void main(String[] args) {
		int indexOfElement;

		double[] vector = new double[10];// { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 7.0, 8.0, 9.0 };
		vector = arrayFilling(vector);
		printArray(vector);
		System.out.println();
		System.out.println("Sorted array (Selection sort)");
		vector=selectionSort(vector);
		//vector = arrayFilling(vector);
		//printArray(vector);
		System.out.println();
		//System.out.println("Sorted array (Bubble sort)");
		//vector = bubbleSort(vector);
		printArray(vector);
		maxMinElement(vector);
		averageArithmeticAndGeometric(vector);
		isArraySort(vector);
		localMinAndMax(vector);
		reverseElement(vector);
		indexOfElement = linearSearch(vector, 6.0);
		System.out.println("index of searching element (Linear Search) " + indexOfElement);
		indexOfElement = binarySearch(vector, 6.0, 0, 9);
		System.out.println("index of searching element (Binary Search) " + indexOfElement);

	}

	static double[] selectionSort(double[] array) {
		int min;
		double temp;
		for (int i = 0; i < array.length-1; i++) {
			min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		return array;

	}

	static double[] bubbleSort(double[] array) {
		double temp;
		int sortedElem=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1-sortedElem; j++) {
				if (array[j + 1] < array[j]) {
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
			sortedElem++;
		}
		return array;
	}

	static int binarySearch(double[] array, double key, int minIndex, int maxIndex) {
		int midIndex = -1;
		while (minIndex <= maxIndex) {
			midIndex = findMidIndex(minIndex, maxIndex);
			if (maxIndex < minIndex) {
				return -1;
			}

			if (key > array[midIndex]) {
				minIndex = midIndex + 1;
			} else if (key < array[midIndex]) {
				maxIndex = midIndex - 1;

			} else if (key == array[midIndex]) {
				break;
			}
		}
		return midIndex;

	}

	static int findMidIndex(int maxIndex, int minIndex) {

		return (minIndex + maxIndex) / 2;

	}

	static int linearSearch(double[] array, double key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i;
			}
		}
		return -1;
	}

	static void reverseElement(double[] array) {
		double temp;
		for (int i = 0; i < array.length / 2; i++) {
			temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		printArray(array);
	}

	static void localMinAndMax(double[] array) {
		boolean isLocal = false;
		for (int i = 1; i < array.length - 1; i++) {
			if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
				System.out.println("Position of local minimum in array is: " + i);
				isLocal = true;
				break;
			}
			if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
				System.out.println("Position of local maximum in array is: " + i);
				isLocal = true;
				break;
			}
		}
		if (!isLocal) {
			System.out.println("there is no local element " + -1);
		}

	}

	static void isArraySort(double[] array) {
		int lengthCounter = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] <= array[i + 1]) {
				lengthCounter++;
			}
		}
		if (lengthCounter == array.length - 1) {
			System.out.println("Array is sorted");
		} else
			System.out.println("Array is not sorted");
	}

	static void averageArithmeticAndGeometric(double[] array) {
		double averageArithmetic = 0.0, averageGeometric = 1.0;
		for (int i = 0; i < array.length; i++) {
			averageArithmetic = averageArithmetic + array[i];
			averageGeometric = averageGeometric * array[i];
		}
		averageArithmetic = averageArithmetic / (double) array.length;
		averageGeometric = (double) Math.pow(averageGeometric, 1 / (double) array.length);
		System.out.println("average arithmetic is " + averageArithmetic);
		System.out.println("average geometric is " + averageGeometric);
	}

	static void maxMinElement(double[] array) {
		double maxElement = array[0], minElement = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxElement) {
				maxElement = array[i];
			} else if (array[i] < minElement) {
				minElement = array[i];
			}
		}
		if (maxElement == minElement) {
			System.out.println("-1");
		} else
			System.out.println("Maximal element: " + maxElement + " minimal element: " + minElement);
	}

	static double[] arrayFilling(double[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (Math.random() * 100);
		}
		return array;
	}

	static void printArray(double array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.format("%.2f", array[i]);
			System.out.print(" | ");
		}

	}
}
