package Day_2.Array_DS;

class LineaSearch {
    public static void main(String[] args) {
        
        int arr [] = {1,2,3,4,5,6};

        int target = 6;

       int ans =  search(arr,target);
      // int ans2 = binarySearch(arr,target);
    }

    public static int search(int arr [] , int target){

        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return  -1;
    }

//     public static int binarySearch(int arr [] , int target){

//        int left = 0;
//        int right = arr.length;

//        while(left < right){
//         int mid = left + ( right - left) /2;

//         if(arr[mid] == target){
//             return mid;
//         }
//         if(arr[mid] > target){
// // 1 2 3 4 5 6 7 /// 5
//         }
//         if(arr[mid] < target){

//         }
//        }

//         return  -1;
//     }
}