package primitive_types;

public class ByteShortIntLong {
    public static void main(String[] args){
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        // int is 32 bit = 2^31 - 1 for max and -2^31 for min
        // 1 is sign bit
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        //Int overfollow
        System.out.println("Busted max value = " + (myMaxIntValue + 1));
        System.out.println("Busted min value = " + (myMinIntValue - 1));


        // byte is a 8 bit. max = 2^8 - 1
        //and min = -2^8
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinByteValue);
        System.out.println("Integer Maximum Value = " + myMaxByteValue);

        //short is a 16 bit
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinShortValue);
        System.out.println("Integer Maximum Value = " + myMaxShortValue);


        //ended with capital "L" that can be understood that it is a long value
        //without capital L it gives you error
        long myLongValue = 100L;

        //long is a 64 bit
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinLongValue);
        System.out.println("Integer Maximum Value = " + myMaxLongValue);



    }
}
