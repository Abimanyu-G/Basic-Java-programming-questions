class secondLargest{
    public static void main(String[] args) {
        int nums[] = {4,67,89, 20, 15};
        
        //largest 

        int highest = Integer.MIN_VALUE;

        for(int j =0; j<nums.length;j++){
           if(nums[j] > highest){
            highest = nums[j];
           }
        }
        System.out.println("Highest: " +highest);

        //second largest

        int largest = nums[0];
        int secLargest = nums[0];

        for(int i = 1; i<nums.length;i++){
            if(nums[i] > largest){
                secLargest = largest;
                largest = nums[i];
            }
            else if(nums[i] > secLargest){
                secLargest = nums[i];
            }
        }

        System.out.println("Second Largest: " +secLargest);


    //     class Main {
    // public static void main(String[] args) {
    //     int nu[] = {12, 70 , 63, 43};
        
    //     int max = Integer.MIN_VALUE;
    //     int secMax = Integer.MIN_VALUE;
        
    //     for(int n : nu){
    //         if(n > max){
    //             secMax = max;
    //             max = n;
    //         }
    //         else if(n > secMax){
    //             secMax = n;
    //         }
    //     }
    //     System.out.println(secMax);
    }
}

    }

}
