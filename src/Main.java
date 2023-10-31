public class Main {
    public static void main(String[] args) {
        String m = "A";
        String n = "Aayush";
        System.out.println(m.hashCode());
        System.out.println(n.hashCode()+"\n");


        String n2 = "A";
        String m2 = new String("A");

        int hashValue_n = n2.hashCode();
        int hashValue_m = m2.hashCode();
        System.out.println(hashValue_m);
        System.out.println(hashValue_n+"\n");

        if (hashValue_n == hashValue_m) {
            System.out.println("Values Same");
        }
        else {
            System.out.println("Not Same");
        }
    }
}