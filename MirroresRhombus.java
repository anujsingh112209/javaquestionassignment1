//Mirrored Rhombus Star Pattern
public class MirroresRhombus {
    public static void main(String args[]){ 
        int n= 5;
        for(int i=1; i<=5; i++){
            for(int j=i; j>=1; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=5; k++){
                System.out.print(" * ");
            }
            System.out.println("");
        }

    }
    
}
