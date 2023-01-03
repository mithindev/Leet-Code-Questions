package JANUARY.DAY4;

public class Main2 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4};
        double sum = 0;
        for (int i = 0;i < nums1.length;i++){
            sum += nums1[i];
        }
        for (int i = 0;i < nums2.length;i++){
            sum += nums2[i];
        }
        double avg = sum/(nums1.length+nums2.length);

//        return avg;
        System.out.println(avg);
    }

}
