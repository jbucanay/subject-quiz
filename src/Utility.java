public final class Utility {

    public static int findIndex(int target, int[] arr){
        for(int index = 0; index < arr.length; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }

    public static int findIndex(char target, char[] arr){
        for(int index = 0; index < arr.length; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
