public class pt6o3 {
    public static void main(String[] args) {
        int sum =0;
        int [] marks = {45,35,50,75,95,85,100,80,90};
        for (int i : marks) {
            sum+=i;
        }
        float len =marks.length+0.f;
        float avg =sum/len;
        System.out.println(avg);
    }
}
