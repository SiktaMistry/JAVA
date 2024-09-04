public class pt6o7 {
    public static void main(String[] args) {
        int []arr = {2,3,5,1,88,6,44,33};
        int min=arr[0];
        for (int i : arr) {
            if(min>i){
                min=i;
            }
        }
        System.out.println(min);
    }
}
