import java.util.Arrays;

class mergeSortedArray 
{

    public static void main(String[] args) {

        int[] num1={1,2,3};int[] num2={1,2};
        int[] output= merge(num1,num1.length,num2,num2.length);
        //for (int i : output) {
           // System.out.println(i);
      //  }
    }

    static public int[] merge(int[] nums1, int m, int[] nums2, int n) 
    {
        

        //Dont complicate first, if merge means we need to thing in easy way to merge using for loop
        for(int i=0;i<n;i++)
        {
                nums1[m]=nums2[i];
                m++;
        }

        Arrays.sort(nums1);
       //System.out.println(nums1.toString());
        return nums1;
    }
}