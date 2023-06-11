package telran.util.test;

import java.util.Comparator;

public class EvenOddComparator implements Comparator<Integer> {
	@Override
    public int compare(Integer o1, Integer o2) {
        boolean isEven1 = Math.abs(o1) % 2 == 0;
        boolean isEven2 = Math.abs(o2) % 2 == 0;

        if (isEven1 && !isEven2) {
            return -1; 
        } else if (!isEven1 && isEven2) {
            return 1;
        } else if (isEven1 && isEven2) {
            return o1.compareTo(o2); 
        } else {
            return o2.compareTo(o1); 
        }
    }
}