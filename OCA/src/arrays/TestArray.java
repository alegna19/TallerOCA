package arrays;

/**
 *
 * @author anggomez1
 */
public class TestArray {

    public static void main(String[] args) {
        int intArray[];
        intArray = new int[]{0, 1};
         int[] arr = new int[5];
         char[] arr3 = {'a', 'b'};
         int[] arr2 = new int[3];
         int[][] array2 =  {{1, 2, 3}, {}, {1, 2,3, 4, 5}};
        

        
      
        //int intArray2 = new int[2];Esto no compilará por que no se puede declarar instanciar y especificar el tamaño en la misma línea.
        
        
        TestArray t = new TestArray();
        int intAttay[];
        //intAttay[2] = new int; //Esto no compilará por que la posición del tamaño del arreglo esta mal.
        intAttay = new int[2];
        int multiArray[][];
        //multiArray = new int[][2];//Esto no compila por que los primeros [] no especifica un tamaño
        String strArray[];
        strArray = new String[4];
        for(int i=0; i<strArray.length; i++){
            strArray[i] = new String[i] + ("Hola" + i);
            System.out.println(strArray[i].toString());
        }
        strArray[1] = "Summer";
        strArray[3] = "Winter";
        strArray[0] = "Autumn";
        strArray[2] = "Spring";
        
    }
    
}
