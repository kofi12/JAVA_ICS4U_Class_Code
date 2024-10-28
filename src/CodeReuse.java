public class CodeReuse {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int[] moreNumbers = {2,3,6,34,78};

       // System.out.printf("The sum of the array is %d", sum(moreNumbers));
    }

    public int sum(int[] arr){
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}
