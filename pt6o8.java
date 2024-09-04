public class pt6o8 {
    public static void main(String[] args) {
        int []arr={3,4,5,8,6,7,8,9};
        // int temp =0;
        int n = arr.length-1;
        for(int i =0;i<=n;i++){
            for(int j= i+1;j<=n;j++){
                if(arr[i]>arr[j]){
                    System.out.println("The array is not sorted");
                    break;
                }
            }
    }
}}
