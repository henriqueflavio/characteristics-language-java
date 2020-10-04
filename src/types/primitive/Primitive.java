package types.primitive;

public class Primitive {
    public static void main(String[] args) {

//      byte nullByte = null;
        byte b;             //8 bits
        byte b1 = 127;
        byte b2 = -128;
//      byte b3 = -129;     //to large

        char c; //16 bits
        char c1 = 'A';
        char c2 = 16;
//      char c3 = 'AA'; //NOK
//      char c4 = -100; //NOK

        short s;            //16 bits
        short s1 = 32767;
        short s2 = -32768;
        short s3 = 'A';

        int i = 2147483647; //32 bits
        int i2 = -2147483648;
//      int i3 = -21474836478 //TOO LARGE

        long l = 9223372036854775807L; //64 bits
        long l2 = -9223372036854775808L;
//      long l3 = 9223372036854775808L; //TOO LARGE

        float f = 65f;  //32 bits
        float f1 = 60.5f;
        float f2 = -60.5f;

        double d = 1024.99; //64bits
        double d1 = -2048.50;

        boolean bol = true;
        boolean bol2 = false;
//      boolean b2 = "false"; //NOK
//      boolean b3 = "true";  //NOK
    }
}
