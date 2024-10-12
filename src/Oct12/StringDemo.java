package Oct12;


import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String companyName = "Pragr";
        char[] reverse = new char[companyName.length()];
        int length = companyName.length();
        for(int i=0;i<=(companyName.length())/2;i++){
            reverse[length-1] = companyName.charAt(i);
            reverse[i]=companyName.charAt(length-1);
            length --;
        }
        System.out.println(Arrays.toString(reverse));
    }
    }

