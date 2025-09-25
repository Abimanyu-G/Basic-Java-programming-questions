public class Frequency{
    public static void main(String[] args) {
        
        int arr[] = new int[]{2,5,2,4,5,2,7,8,8,8};
        int visitedArr[] = new int[arr.length];
        int visited = -1;

        for(int i = 0; i<arr.length; i++){
            int count = 1;

            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                  count++;
                  visitedArr[j] = visited;
                }
            }
            if(visitedArr[i] != visited){
                visitedArr[i] = count;
            }
        }

        for(int i = 0; i<arr.length; i++){
            if(visitedArr[i] != visited){
            System.out.println("Frequency of " + arr[i] + " is " + visitedArr[i]);
        }
        }
    }
}