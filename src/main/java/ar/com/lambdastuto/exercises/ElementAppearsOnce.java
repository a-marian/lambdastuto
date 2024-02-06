package ar.com.lambdastuto.exercises;

public class ElementAppearsOnce {


    public static int findElement(int[] arr){

        int start = 0;
        int end= arr.length - 1;

        while(start <= end){
            int mid = (start + end)/2;
            if(start == end){
                return arr[start];
            } else if ( mid % 2 != 0){ //if mid is odd
                if(arr[mid - 1] == arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                //if mid is even
                if (arr[mid] == arr[mid+1]){
                    start = mid +2;
                }else {
                    end = mid;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
            int [] arrayints = {1,1,2,2,3,3,4,4,5};

            int res = findElement(arrayints);
            System.out.println(res);
    }
}
