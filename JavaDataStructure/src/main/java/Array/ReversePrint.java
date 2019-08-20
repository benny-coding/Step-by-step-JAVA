package Array;

public class ReversePrint {
    public static void main(String[] args) {

        int[] a = {28,21,10,3,6,9,18};	 int size = a.length; for(int i=0; i<size/2;i++) { a[i] = a[i]^a[size-i-1]; a[size-i-1] = a[size-i-1]^a[i]; a[i] = a[size-i-1] ^ a[i]; } for(int j=0;j<size;j++) { System.out.print(a[j] + " "); } System.out.println();


    }
}
