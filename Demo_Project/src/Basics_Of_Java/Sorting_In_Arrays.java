package Basics_Of_Java;

public class Sorting_In_Arrays {
    public static void main(String[] args) {
        // for Bubble sort
        int Bblsrt [] = {50,3,11,60,70,65,4,7,6,2,8};
        System.out.println("Before Bubble Sorted: ");
        display(Bblsrt);
        BubbleSort(Bblsrt);
        System.out.println("After Bubble Sorted: ");
        display(Bblsrt);
        System.out.println("  ");

        // In case of Time and Space complexity , Merge Sort is better then Bubble Sort
        // for Merge Sort
        int MrgSrt [] = {1,10,2,8,3,4,9,3,2,11,5,7,6};
        System.out.println("Before Merge Sort: ");
        display(MrgSrt);
        Msort(MrgSrt,0,MrgSrt.length-1); // then sort the array
        System.out.println("After Merge Sort: ");
        display(MrgSrt);
    }

    // for Bubble Sort
    static void BubbleSort(int arr[]){
        int n = arr.length;
        boolean swapped;
        for(int i = 0; i < n-1; i++){
            swapped = false;
            for (int j = 0; j < n-i-1; j++){
                // for swapping the values
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            // if no two elements were,
            // swapped by inner loop break
            if(swapped == false)
                break;
        }
    }

    // for Merge Sort
    static void merge(int arr[],int l,int m,int r){
        int n1 = m-l+1, n2 = r-m;

        // create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // copy datas to temp arrays
        for(int i = 0;i < n1;++i)
            L[i] = arr[l+i];
        for(int i = 0;i < n2;++i)
            R[i] = arr[m+1+i];

        // Merge the temp arrays
        // initial indexes of first and second SubArrays
        int i = 0,j = 0;
        // initial index of merged subarray array
        int k = l;
        while(i<n1 && j<n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // copy remaining elements of l[] if any,
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }

        // copy remaining elements of R[] if any,
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }

    }
    static void Msort(int arr[],int l,int r){
        if(l<r){
            int mid = (l+r)/2;

            // sort first and second halves (half--s)
            Msort(arr,l,mid);
            Msort(arr,mid+1,r);

            // Merge the sorted halves (half--s)
            merge(arr,l,mid,r);
        }
    }

    // for show the sorted array
    static void display(int arr[]){
        System.out.print("The Array is: "+"{ ");
        for(int i = 0; i<arr.length; i++){
            if(i==0){
                System.out.print(arr[0]);
            }else {
                System.out.print(" , "+arr[i]);
            }
        }
        System.out.print(" }");
        System.out.println(" ");
    }
}
