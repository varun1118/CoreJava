public class LargestOfThree {
    public static void main(String[] args) {
        int x=50;
        int y=62;
        int z=56;
        int large;
        if(x>y){
            large=x;
        }
        else {
            large=y;
        }

        if(large<z){
            large=z;
        }
        System.out.println(large);
    }
}
