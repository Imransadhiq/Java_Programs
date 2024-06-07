public class ArrAB {
    public static void main(String[] args) {
        char[][] array = new char[3][3]; 
        char c = 'a';
        
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = c;
                c++; 
            }
        }
        
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
