public class Ex8{
    public static void main(String[] args){
        int arr[] = {23, 23, 42, 12, 25};
        printArr(arr);
    }
    public static void selectionSort(int arr[]){
        //tim min roi hoan doi voi vi tri dang xet hien tai (tang dan)
        int n = arr.length;
        for (int i =0; i<n-1;i++){
            int min = i;
            for (int j=i+1;j<n;j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr(int arr[]){
        //selectionSort(arr);
        bubbleSort(arr);
        int n = arr.length;
        for (int i = 0; i <n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void bubbleSort(int[] arr){
        //trong 1 lan chay se dua duoc it nhat 1 phan tu ve vi tri
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}