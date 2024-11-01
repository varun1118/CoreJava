package VectorsPractice;

import java.lang.reflect.Array;
import java.util.*;

public class books {

    public static void main(String[] args) {

        ArrayList<Integer> vector = new ArrayList<>();
        Vector<Integer> vector1=new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
       vector1.add(1);
       vector1.add(2);
        System.out.println(vector.equals(vector1));
        Iterator<Integer> it = vector.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        it.remove();
        System.out.println(vector.get(0));
        System.out.println(vector.get(0));

        List<Integer> al = Collections.synchronizedList(new ArrayList<>());

        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        System.out.println(vector);

        Enumeration<Integer> enumeration = Collections.enumeration(vector);

        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
