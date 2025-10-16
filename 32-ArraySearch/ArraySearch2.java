public class ArraySearch2 {

    public static void main(String[] main) {

        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        int target = 2;
        boolean isFound = false;

        for(int i = 0; i < numbers.length; i++) {
            if(target == numbers[i]) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound) {
            System.out.println("Element not found in the array");
        }
    }
}
