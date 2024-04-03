public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello and welcome!");
        String s1 = "s1: My name is Alexander";
        s1+= " Zenkov";
        System.out.println(s1);
        String s2 = "s2: Number of my group is: ";
        s2 += 5030102;
        s2 += "/" + (10100 + 1);
        System.out.println(s2);
        if(s2!=s1)
            System.out.println("s1 " +"is not " + "s2");
        String s3 = "Alexander";
        if(s3 == "Alexander")
            System.out.println("s3" +" = " + "Alexander");
        if(!s3.equals((s1)))
            System.out.println("s3 " + "is not " + "s1");
        String s4 = null;
        String s5 = "";
        if(s5 == s4)
            System.out.println("s5 " + " is " + "null");
        else
            System.out.println("s5 " + " is not " + "null");
        String s6 = "ALEXANDER";
        System.out.println(s6);
        if(s6.equalsIgnoreCase(s3))
            System.out.println("s6 " + " has the same letter sequence as " + "s3");
        String s7 = " Test string ";
        System.out.println("s7.length() : " + s7.length());
        System.out.println("s7.trim().length() : " + s7.trim().length());
        String s8 = s7.substring(1,s7.length() - 1);
        System.out.println("s8.length() : " + s8.length());
        System.out.println(String.join(",", "1", "2", "3"));

    }
}