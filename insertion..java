package Sortings;

import java.util.Scanner;

class insertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        sort(a);
    }
    static void sort(int[] a){
        for(int i=1;i<a.length;i++){
            int temp=a[i];
            int j=i-1;
            
            while( j>=0 && temp<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
            for(int k=0;k<a.length;k++){
                System.out.print(a[k] +" ");
            }
            System.out.println();
        }
    }
}
