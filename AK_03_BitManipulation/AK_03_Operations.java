package AK_03_BitManipulation;

public class AK_03_Operations {
    public static int getIthBit(int num, int i) {
        int bitMask = 1<<i;
        if((num & bitMask) == 0) {
            return 0;
        }
        return 1;
    }

    public static int setIthBit(int num, int i) {
        int bitMask = 1<<i;
        return (num | bitMask);
    }

    public static int clearIthBit(int num, int i) {
        int bitMask = ~(1<<i);
        return (num & bitMask);
    }

    public static int updateIthBit(int num, int i, int newBit) {
        if(newBit == 0) {
            return  clearIthBit(num, i);
        } else {
            return setIthBit(num, i);
        }

//        num = clearIthBit(num, i);
//        int BitMask = newBit<<i;
//        return (num | BitMask);
    }

    public static int clearLastIthBit(int num, int i) {
        int bitMask = ~(0)<<i;
        return (num & bitMask);
    }

    public static int clearBitsInRange(int num, int i, int j) {
        int a = ((~0) << (j+1));
        int b = (1<<i) - 1;
        int bitMask = a | b;
        return (num & bitMask);
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
        System.out.println(getIthBit(10, 3));

        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearLastIthBit(15, 2));
        System.out.println(clearBitsInRange(10, 2, 4));
    }
}
