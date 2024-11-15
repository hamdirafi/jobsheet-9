public class LinearSearch01 {
    public static void main(String[] args) {
        int[] array = {34, 18, 26, 48, 72, 20, 56, 63};
        int key = 20;
        int result = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                result = i;
                break;
            }
        }

        System.out.println("The key in the array is located at index position " + result);
    }
}
