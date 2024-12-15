public class Substring {

    public static void main(String[] args) {

        String a = "Java is great.";
        System.out.println(a);
        System.out.println("---------");
        String b = a.substring(5);
        System.out.println(b);
        System.out.println("---------");
        String c = a.substring(5, 7);
        System.out.println(c);
        System.out.println("---------");
        String d = a.substring(5, a.length());
        System.out.println(d);



    }
}
