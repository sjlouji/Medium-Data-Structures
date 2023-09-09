import java.time.Duration;
import java.time.Instant;

class BinarySearch {

    public static int binarySearch(int inputList[], int searchElement) {
        int position = -1;
        int leftIndex = 0;
        int rightIndex = inputList.length;
        while (leftIndex <= rightIndex) {
            int mid = leftIndex + (rightIndex - leftIndex) / 2;
            if (inputList[mid] == searchElement) {
                position = mid;
            } else if (inputList[mid] > searchElement) {
                rightIndex = mid - 1;
            } else {
                leftIndex = mid + 1;
            }
        }
        return position;
    }

    public static int recursiveBinarySearch(int inputList[], int searchElement, int leftIndex, int rightIndex) {
        if (leftIndex <= rightIndex) {
            int mid = leftIndex + (rightIndex - leftIndex) / 2;
            if (inputList[mid] == searchElement) {
                return mid;
            } else if (inputList[mid] > searchElement) {
                return BinarySearch.recursiveBinarySearch(inputList, searchElement, leftIndex, mid - 1);
            } else {
                return BinarySearch.recursiveBinarySearch(inputList, searchElement, mid + 1, rightIndex);
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int inputList[] = { 1, 3, 4, 5, 7, 8, 9, 13 };
        int searchElement = 13;

        int position = BinarySearch.recursiveBinarySearch(inputList, searchElement, 0, inputList.length);

        if (position != -1) {
            System.out.println("Search Element found at position: " + (position + 1));
        } else {
            System.out.println("Search Element not found");
        }
    }
}
