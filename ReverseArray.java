public class ReverseArray {
    public static void main(String[] args) {

        int[]arr={12,3,5,7,1};
        int temp;
        int l=arr.length;
        int a=Math.floorDiv(arr.length, 2);
        for(int i=0;i<a;i++)
        {
            temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
        for(int element:arr)
        {
            System.out.println(element);
        }

    }
    
}
