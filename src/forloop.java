public class forloop {
    public static void main(String[] args) {
        for (int i = 0; i <=100; i++) {
            if(i%7==0)
            {
                System.out.println("Varun");
                continue;
                //continue will skip the current iteration
            }
            System.out.println(i);
        }
    }
}
