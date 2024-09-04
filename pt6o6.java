public class pt6o6 {
    public static void main(String[] args) {
        int[] arr = {10,8,30,5,2,90};
        int max=0;
        for (int i : arr) {
            if(max<i){
                max =i;
            }
        }
        System.out.println(max);
    }
    
}
