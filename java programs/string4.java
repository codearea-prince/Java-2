public class string4 {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        // strings comparison
        // if s1>s2 : return +value
        // if s1==s2 : return 0
        // if s1<s2 : return -value
        // if(s1.compareTo(s2))
        // System.out.println("strings are equal");
        // else
        // System.out.println("strings are not equal");
        // if(s1==s2)
        // System.out.println("strings are equal");
        if (new String(s1) == new String(s2)) // in this case we == function which returns inappropriate ans in some
                                              // cases due to which we dont use == function we have to use comareto
                                              // function
        {
            System.out.println("strings are equal");
        } else
            System.out.println("strings are not equal");
    }
}
