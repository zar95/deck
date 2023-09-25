public class Test {
    public static void main(String[] args) {
        Music m1 = new Music("Alone","2:35","English",new Singer("serhet dermis","male","USA",new Date(18,9,2017)));
        Music m2 = new Music("Alone","3:55","English",new Singer("Alan walker","male","USA",new Date(18,9,2016)));
        System.out.println(m2);
        System.out.println(m1);
        System.out.println(m1.equals(m2));
    }
}
