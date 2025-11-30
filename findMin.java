class findMin{
    public static void main(String args[]){
        int arr[] = {2,666,76,24,-9};

        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(min);

        for(int i=0; i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}