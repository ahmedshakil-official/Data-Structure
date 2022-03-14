import java.util.Arrays;

public class ArrayProblems {
    private int[] arr;


    public ArrayProblems(int[] arr) {
        this.arr = arr;
    }

    boolean isSorted(){
        for (int i = 1; i<arr.length; i++){
            if (arr[i-1]>arr[i])
                return false;
        }
        return true;
    }

    int secondLargestElementNaive(){
        int i;
        int res = -1;
        int largest = 0;

        for (i = 1; i < arr.length; i++){
            if (arr[i] > arr[largest])
                largest = i;
        }

        for (i = 0; i < arr.length; i++){
            if(arr[i] != arr[largest]){
                if (res == -1)
                    res = i;
                else if (arr[i] > arr [res])
                    res = i;
            }
        }
        return res;
    }

    int secondLargestElement(){
        int i;
        int res = -1;
        int largest = 0;

        for(i =1; i<arr.length; i++){
            if(arr[i] > arr[largest]){
                res = largest;
                largest = i;
            }
            else if(arr[i] != arr[largest]){
                if(res == -1 || arr[i] > arr [res])
                    res = i;
            }
        }
        return res;
    }

    void reverse(){
        int tmp;
        int low = 0;
        int high = arr.length-1;
        while (low<high){
            tmp = arr[low];
            arr[low] = arr[high];
            arr[high] = tmp;
            low++;
            high--;
        }
        System.out.println(Arrays.toString(arr));
    }

    int remDupNaive(){
        int [] tmp = new int[arr.length];
        int res = 1;
        tmp [0] = arr [0];

        for( int i = 1; i<arr.length; i++){
            if(tmp[res-1] != arr[i]){
                tmp[res] = arr[i];
                res++;
            }
        }
        for (int i = 0; i<res; i++)
            arr[i] = tmp[i];
        for (int i = 0; i < res; i++) {
            System.out.print(arr[i]+" ");
        }
        return res;
    }

    int remDup(){
        int res = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[res-1]!=arr[i]){
                arr[res] = arr[i];
                res++;
            }

        }
        for (int i = 0; i < res; i++) {
            System.out.print(arr[i]+" ");
        }
        return res;
    }

    void lRotateOne(){
        int tmp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = tmp;
    }

}
