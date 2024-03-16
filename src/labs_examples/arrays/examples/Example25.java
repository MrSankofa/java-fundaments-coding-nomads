package labs_examples.arrays.examples;

// Display the bits within a byte.
class ShowBits_2 {
    public static void main(String args[]) {
        int t;
        byte val;

        val = 17; //TODO: why does byte 1 and t 128 evalate to 0?
        for(t=128; t > 0; t = t/2) {
            if((val & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}