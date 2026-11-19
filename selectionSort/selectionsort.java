// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Main {
    public static void main(String[] args) {
        int[] nums = {1,67,12,77,3,45,1,77,234,534,645};

        for(int i = 0 ; i < nums.length - 1; i++){
               int min = i ;
            for(int j = i + 1 ; j < nums.length; j++){
                if(nums[j] < nums[min]){
                    min = j;
                } 
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }

          for(int n : nums){
              System.out.print(n + " ");
          }
    }

  
}