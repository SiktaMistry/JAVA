public class pt6o5 {
    public static void main(String[] args) {
        int [] arr={10,9,8,7,6,5,4,3,2,1};
        int n= arr.length;
        int a = 0;int b= 0;
        for(int i=0;i<=(n-1)/2;i++){
            a=arr[n-1-i];
            b =arr[i];
            arr[i]=a;
            arr[n-1-i]=b;
        }
        for (int i : arr) {
            System.out.print(i+" ");
            
        }       
        }
    }
