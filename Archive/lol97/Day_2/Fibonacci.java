import java.util.HashMap;

/**
 *
 * @author aglis
 */
public class Fibonacci {

    private HashMap<Integer, Long> memo = new HashMap<>();

    public long recFibon(int key) {
        long result;
        if (key == 1 || key == 2) {
            result = 1;
        } else {
            result = recFibon(key - 1) + recFibon(key - 2);
        }
        return result;
    }

    public long memoizeFibon(int key) {
        long result;
        if (memo.containsKey(key)) {
            return memo.get(key);
        } else if (key == 1 || key == 2) {
            result = 1;
        } else {
            result = memoizeFibon(key - 1) + memoizeFibon(key - 2);
            memo.put(key, result);
        }
        return result;
    }

    public long bottomUpFibon(int key) {
        long result;
        if (key == 1 || key == 2) {
            return 1l;
        }
        memo.put(1, 1l);
        memo.put(1, 1l);
        for (int i = 3; i <= key; i++) {
            System.out.print(i);
            result = bottomUpFibon(key - 1) + bottomUpFibon(key - 2);
            memo.put(key, result);
        }
        return memo.get(key);
    }

    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        
//        System.out.println(fibo.recFibon(5));
//        System.out.println(fibo.recFibon(20));
//        System.out.println(fibo.recFibon(30));
//        
//        System.out.println(fibo.memoizeFibon(5));
        // System.out.println(fibo.memoizeFibon(100));
       System.out.println(fibo.memoizeFibon(30));
        
//        System.out.println(fibo.bottomUpFibon(5));
//        System.out.println(fibo.bottomUpFibon(10));
//        System.out.println(fibo.bottomUpFibon(30));
//        buttom - up so slow :(
    }
}
