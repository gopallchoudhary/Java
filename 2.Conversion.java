class Conversion {
    public static void main(String args[]) {

       //byte b = 127;
        int a = 257;
        byte k = (byte)a; //!type-casting (257%256)
        System.out.println(k);

        float f = 6.32f;
        int x = (int) f; //!float f is converted into  int x
        System.out.println(x);

        byte c = 10;
        byte d = 30;
        int result = c * d; //! java promotes byte to int
        System.out.println(result);
    }
}