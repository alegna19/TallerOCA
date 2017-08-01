package arrays;

/**
 *
 * @author anggomez1
 */
public class EjemArray {

    public static void main(String... $n) {
        EjemArray[] eJump2 = new EjemArray[22];
//        String[] s = new String[2];
//        s[0] = "hola ";
//        s[1] = "mundo ";
//
//        for (String st : s) {
//            System.out.print(st);
//        }
//
//        String[] s2 = {"hola ", "mundo"};
//
//        for (String st : s) {
//            System.out.print(st);
//        }
//
//        String[][] m = new String[2][2];
//        m[0][0] = "hola ";
//        m[0][1] = "mundo ";
//        m[1][0] = "angela ";
//        m[1][1] = "maria";
//
//        for(int i=0;i<2;i++)
//            for (String ma : m[i]) {
//                System.out.print(ma);
//            }
//        
//        
         String[][] m2 = {{new String("hola "),"mundo "},
                          {null," gomez"}};

//         for(int i=1;i>=0;i--)//fila
//            for (int j=1; j>=0; j--) {//columna
//                System.out.print(m2[i][j]);
//            }
         
           for(int i=0;i<=10;++i)//fila[]
           {
               
               System.out.println(i);
            }
           
        //0,1,2...10
        //gomez null mundo hola
        //hola gomez
        //gomez hola
        //null mundo
        //mundo null
        
        
    }

}
