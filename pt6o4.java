public class pt6o4 {
    public static void main(String[] args) {
        int [][]mat1 ={{3,4,5},{4,5,6}};
        int [][]mat2 ={{4,5,6},{7,8,9}};
        int [][]mat3 = new int [2][3];
        for(int i =0;i<2;i++){
            for(int j= 0;j<3;j++){
                mat3[i][j]=(mat1[i][j]) + (mat2[i][j]);
                System.out.print(mat3[i][j]+" ");
            }
            System.out.print("\n");
        }
        
            
        
    }
    
}
