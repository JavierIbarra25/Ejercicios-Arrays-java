public class Binary {
    public static void main(String[] args) {

        int [] Array = {1,3,5,7,9};

        System.out.println(binarySearch(Array, 3));
        System.out.println(binarySearch(Array, -1));
    }

    public static Integer binarySearch (int []Array, int item){

        int low = 0;
        int high = Array.length -1;

        while (low <= high) {

            int mid = (low + high)/ 2;
            int guess = Array[mid];

            if (guess > item){
                high = mid -1;
            } else if (guess < item) {
                low = mid + 1;
            }else {
                return mid;
            }
        }
        return null;
    }
}
