import java.util.ArrayList;

public static boolean isPrime(int possiblePrime) {
    if (possiblePrime == 1) {
        return false;
    }
        
    if (possiblePrime == 2) {
        return true;
    }
        
    for (int i=2; i<possiblePrime; i++){
        if (possiblePrime % i == 0) {
            return false;
        }
    }
    return true;
}
    
public static void nPrime(int x) {
    ArrayList<Integer> pList = new ArrayList<Integer>();
    int possiblePrime = 2;
    while (true) {
        if (isPrime(possiblePrime)) {
            pList.add(possiblePrime);
        }
        possiblePrime++;
        if (pList.size() == x) {
            break;
        }
    }
        
    System.out.println(pList);
}
