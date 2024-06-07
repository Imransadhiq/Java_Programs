public class Arrays {
    public static void main(String[] args) {
        
        int[] numbers = {5, 10, 15, 20, 25};
        
       
        System.out.println("Element at index 0: " + numbers[0]); 
        System.out.println("Element at index 2: " + numbers[2]); 
        
       
        numbers[1] = 12;
        System.out.println("Modified element at index 1: " + numbers[1]);
        
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
