package three.arr.heap;

import java.io.*; // Do not import anything else.

class Heap3 {

    long arr[] = new long[320000000];

    int n = 0;
    // construct an empty 3-ary heap
    public Heap3(){
    }

    // add an item to the 3-ary heap
    public void insert(int item){
        insertNode(item);
    }

    // return the maximum integer in the 3-ary heap
    public int delMax(){
        int m = (int) arr[0];
        deleteRoot();
        return m;
    }

    void insertNode( int Key)
    {
        n = n + 1;
        arr[n - 1] = Key;
        heapifyByBottom( n - 1);
    }

    private void heapifyByBottom( int i)
    {
        int parent = (i - 1) / 3;
        if (arr[parent] > 0) {
            if (arr[i] > arr[parent]) {
                long swap = arr[i];
                arr[i] = arr[parent];
                arr[parent] = swap;
                heapifyByBottom(parent);
            }
        }
    }

    private void heapify(int n, int i)
    {
        int largest = i;
        int l = 3 * i + 1;
        int r = 3 * i + 2;
        int o = 3 * i + 3;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (o < n && arr[o] > arr[largest])
            largest = o;

        if (largest != i) {
            long swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(n, largest);
        }
    }

    private void deleteRoot()
    {
        long lastElement = arr[n - 1];
        arr[0] = lastElement;
        n = n - 1;
        heapify(n, 0);
    }

}

/*
 * Do not modify the main function
 * */
public class Solution {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        Heap3 heap3 = new Heap3();
        int NumOfQueries = Integer.parseInt(bufferedReader.readLine().trim());
        while(NumOfQueries-- > 0){
            String[] query = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            if(query[0].equals("insert")){
                int item = Integer.parseInt(query[1]);
                heap3.insert(item);
            }
            else if(query[0].equals("delMax")){
                bufferedWriter.write(heap3.delMax() + "\n");
            }
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
