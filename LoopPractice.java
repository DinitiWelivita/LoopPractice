package looppractice;

/**
 *
 * @author 802967
 */
public class LoopPractice  {
    
    public static void main(String[] args) {
       for (int i = 0; i<50 ; i++) {
            System.out.println("Hello");
        }
       
       for (int i = 1000; i>=0 ; i=i-25) {
            System.out.println(i);
        }
       
       for (int i = 0; i<9 ; i++) {
            for (int j = 0; j<9 ; j++) {
            if ((i+j)<10) {
                System.out.print(i+j+"  ");
            }
            else {
                System.out.print(i+j+" ");
            }
        }
            System.out.println("");
        }
       
       for (int i = 0; i<8 ; i++) {
             for (int j = 0; j<8 ; j++) {
                 if (((j+i)%2)==1) {
                 System.out.print("  Red  ");
             }
                 else {
                     System.out.print(" Black ");
                 }
             }
             System.out.println("\n");
        }
       
       
    }
    
    
}