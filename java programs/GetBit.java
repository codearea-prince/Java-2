public class GetBit {
    public static void main(String[] args) {
        int n=5;//  n = 0101
        int pos=2;
        int bitMask=1<<pos;   //bitMask = 0100
         
        if((bitMask & n)==0)
        {
            System.out.println("bit is zero");
        }
        else{
            System.out.println("bit is non-zero");
        }
    }
}