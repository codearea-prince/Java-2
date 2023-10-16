public class SetBit {
    public static void main(String[] args) {
        int n=5;//  n = 0101 -> (0111)base2 = (7)base10
        int pos=1;
        int bitMask=1<<pos;   //bitMask = 0100
         
        int number = bitMask | n;
        {
            System.out.println(number);
        }  
    }
}