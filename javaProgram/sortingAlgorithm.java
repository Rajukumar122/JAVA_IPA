// heap sort
import java.util.*;
import java.util.Scanner;

class HeapSort
{
    // public static void swap(int a, int b)
    // {
    //     int c=a;
    //     a=b;
    //     b=c;
    // }
    public void heapify(int arr[],int n,int i)
    {
         int largest=i;
         int left=2*i+1;
         int right=2*i+2;
         if(n>left&&arr[left]>arr[largest])
         {
            largest=left;
         }
         if(n>right&&arr[right]>arr[largest])
         {
             largest=right;
         }
         if(i!=largest)
         {
            int c=arr[i];
              arr[i]=arr[largest];
              arr[largest]=c;
            // swap(arr[i],arr[largest]);
            heapify(arr,n,largest);
         }
    }

    public void createMaxHeap(int arr[],int n)
    {
        //first phase
        for(int i=(n/2)-1;i>=0;i--)
        {
            heapify(arr,n,i);
        }
        //second phase
        for(int i=n-1;i>0;i--)
        {
              int c=arr[i];
              arr[i]=arr[0];
              arr[0]=c;
            // swap(arr[0],arr[i]);
            heapify(arr,i,0);
        }
    }

    public void display(int arr[], int n)
    {
         System.out.println("The array Element are : ");
        for(int i=0;i<n;i++)
        { 
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}


class MergeSort
{
    public void mergesort(int arr[], int low, int high)
    {
        if(low>=high)return;
        int mid=low+(high-low)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public void merge(int arr[], int low, int mid, int high)
    {
        int [] temp= new int[high-low+1];
        int j=0;
        int left=low, right=mid+1;
        while(left<=mid&&right<=high)
        {
            if(arr[left]<arr[right]){
            temp[j++]=arr[left];
            left++;
            }
            else
            {
                 temp[j++]=arr[right];
                 right++;
            }
        }
        while(left<=mid)
        {
            temp[j++]=arr[left];
            left++;
        }
        while(right<=high)
        {
            temp[j++]=arr[right];
            right++;
        }
        for(int i=low;i<=high;i++)
        {
            arr[i]=temp[i-low];
        }
    }


     public void display(int arr[], int n)
    {
         System.out.println("The array Element are : ");
        for(int i=0;i<n;i++)
        { 
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

class A
{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of Element");
        int n=s.nextInt();
        int [] arr= new int[n];
        System.out.println("Please Enter "+n+" Element");
        for(int i=0;i<n;i++)
        { 
            arr[i]=s.nextInt();
        }
        // HeapSort obj=new HeapSort();
        // obj.display(arr,n);
        // obj.createMaxHeap(arr,n);
        // obj.display(arr,n);



        MergeSort obj=new MergeSort();
        obj.display(arr,n);
        obj.mergesort(arr,0,n-1);
        obj.display(arr,n);
    }
}
// class B 
// {

// }