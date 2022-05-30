import java.util.ArrayList;

class Fibonacci {
    public static void nFibonacci(int x, int a, int b) {
        if (a>b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        ArrayList<Integer> fList = new ArrayList<Integer>();
        fList.add(a);
        fList.add(b);
        
        if (x==1){
            System.out.println(a);
        }
        if (x==2) {
            System.out.println(a + ", " + b);
        }
        if (x>2) {
            for (int i = 0; i < x; i++) {
                int nextNum = fList.get(i) + fList.get(i+1);
                fList.add(nextNum);
                if (fList.size()==x) {
                    break;
                }
            }
            System.out.println(fList);
        }
    }
}
