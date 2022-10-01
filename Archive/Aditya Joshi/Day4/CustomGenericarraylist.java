package generics;

import java.util.Arrays;

public class CustomGenericarraylist<T> {


    private int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;

    public CustomGenericarraylist() {

        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if (isfull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
         Object temp[] = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
           temp[i]= data[i] ;
        }
        data = temp;
    }


    private boolean isfull() {
        return size == data.length;
    }

    public Object remove(){
        return data[--size];
    }

    public Object get(int n){
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
        CustomGenericarraylist<Integer> arr = new CustomGenericarraylist<>();
        arr.add(1);
        arr.add(2);
        System.out.println(arr.toString());
    }
}
