import java.util.Scanner;

public class updateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //oper = 1 : set oper=0 : clear
        int n=5;    //0101 -> 0111 -> dec 7
        int pos=1;
        
        //set opr
        int bitMask=1<<pos;
        if(oper==1)       
        {
            int newnumber = bitMask | n;            
            System.out.println(newnumber);
        }
        else{
            int newbitmask = ~(bitMask);
            int newnumber = newbitmask & n;
            System.out.println(newnumber);
        }
        
    }
    
}
