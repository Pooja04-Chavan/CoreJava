package src.basics_24Dec;

public class Lab084 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

      System.out.println(arr1==arr2); //check reference name return false

        int[] arr3 = arr1;
       System.out.println(arr1==arr3); //true

        System.out.println(arr1.equals(arr2)); // false
        // If String -> True Why - Values
        // Arrays -> Compare Don't -> Ref - Not equal

        arr3[0] = 24;
        System.out.println(arr1[0]);
        System.out.println(arr3[0]);



    }

}
