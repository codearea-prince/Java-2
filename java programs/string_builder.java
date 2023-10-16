public class string_builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);
        // char at index 0
        System.out.println(sb.charAt(0));
         //set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        //insert character ina string
        sb.insert(0,'S');
        System.out.println(sb);
        //delete charater in string
        sb.delete(2,4);  // here index number 2 and index number 3 character are deleted
        System.out.println(sb);
        //append funtn uses to add string in the end
        sb.append("Stark");
        sb.append("kapoor");
        System.out.println(sb);
        System.out.println(sb.length());
        




    }
    
}
