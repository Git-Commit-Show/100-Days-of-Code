package generics;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;

public class Customarraylist {


    private int DEFAULT_SIZE = 10;
    private int[] data;
    private int size = 0;

    public Customarraylist() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isfull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
         int temp[] = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
           temp[i]= data[i] ;
        }
        data = temp;
    }


    private boolean isfull() {
        return size == data.length;
    }

    public int remove(){
        return data[--size];
    }

    public int get(int n){
        return data[n];
    }

    public void print(){
        for (int i = 0; i < data.length; i++) {
            System.out.print(i +" ");
        }
    }

    @Override
    public String toString() {
        return "Customarraylist{" +
                "DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Customarraylist arr = new Customarraylist();
        arr.add(1);
        arr.add(2);
        System.out.println(arr.toString());
    }
}
