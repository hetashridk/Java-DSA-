

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        
        System.out.print("How many elments you want to be sort: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int  i = 0; i < n; i++){
            System.out.print("Enter the array numbers: "); 
            arr[i] = sc.nextInt();
        }    
        insertionSort(arr);

        System.out.print("Sorted array is: ");
        printArr(arr);                  
    }                 
     