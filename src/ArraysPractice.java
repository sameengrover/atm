public class ArraysPractice {


    static Boolean linearSearch(int[] arr, int target){
        Boolean found = false;
        int comparisons = 0;

        for(int i =0; i<arr.length; i++) {
            comparisons++;
            if (arr[i] == target) found = true;
            if(found) break;
        }

        System.out.println(comparisons);
        return found;
    }

    static boolean binarySearch(int[] arr, int s, int e, int target){
        if(s>=e) return false;
        int mid = (s+e)/2;
        if(arr[mid] == target) return true;

        if(target > arr[mid]) return binarySearch(arr, mid+1, e, target);
        else return binarySearch(arr, s, mid-1, target);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,7,9,10,67,100,130,678,897,999};

        System.out.println(binarySearch(arr, 0, 11, 678));

    }


}
