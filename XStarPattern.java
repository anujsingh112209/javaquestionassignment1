//X Star Pattern
public class XStarPattern {
    public static void main(String args[]){ 
        int n=7;
        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                if(i==j || i+j==7-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    
}
