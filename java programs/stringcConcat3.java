public class stringcConcat3 {
    public static void main(String[] args) {
        //string concatenation
        String firstname = "prince";
        String lastname = "kumar";
        String fullname = firstname + lastname;
        String fullName = firstname + " "+ lastname;
        System.out.println(fullname);
        System.out.println(fullName);
        System.out.println(fullName.length());
        for(int i=0;i<fullName.length();i++)
        {
            System.out.println(fullName.charAt(i));

        }
       
    }
    
}
