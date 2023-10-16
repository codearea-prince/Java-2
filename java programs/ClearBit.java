public class ClearBit {
    public static void main(String[] args) {
        int n=5;//  n = 0101 -> (0111)base2 = (7)base10
        int pos=2;
        int bitMask=1<<pos;   //bitMask = 0100
         
        int notbitMask = ~bitMask;
        int newnumber = notbitMask & n;
        {
            System.out.println(newnumber);
        }  
    }
}