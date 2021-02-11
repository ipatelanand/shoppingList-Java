package finalgui;

public class bubblesort {
static  void bubbleSort(String arr[][]) {
       int arrayLength = arr.length;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 1; j < (arrayLength - i); j++) {
                String nameTemp, scoreTemp;
                int leftValue, rightValue;
                leftValue = Integer.valueOf(arr[j - 1][1]);
                rightValue = Integer.valueOf(arr[j][1]);
                if (leftValue > rightValue) {
                    //swap elements
                    nameTemp = arr[j - 1][0];
                    scoreTemp = arr[j - 1][1];
                    arr[j - 1][0] = arr[j][0];
                    arr[j - 1][1] = arr[j][1];
                    arr[j][0] = nameTemp;
                    arr[j][1] = scoreTemp;
                }

            }
        }
}
}
