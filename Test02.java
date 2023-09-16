/* DATA TYPES PROGRAMES
 * ======================
 */

// BWElow the proggrame  Explain All the above Points
public class Test02 {
    public static void main(String[] args) {
        System.out.println("Main Method");
        // boolean bo= 5; CE:int cannot be converted to boolean.
        // Approach #1: with =operator(Variables assignment)
        byte b1 = 5;
        short s1 = 5;
        long l1 = 5;
        M1(5);
        M1(b1);
        M1(s1);
        M1(l1);
        System.out.println();

        // Approach #2: by using CastOperator [(datatype) Value]
        M1(5);
        M1((byte) 5);
        M1((short) 5);
        M1((long) 5);
        System.out.println();

        // Approach #3 : by using suffix charcter
        M1(5);
        M1(5l);
        M1(5L);

        // M1(5B); //CE:
        // M1(5b); //CE;
        // M1(5S);
        // M1(5S);

        // boolean bo =5l; // CE: Long can not converted into boolean
        // if we want to represent an interger value as long directly number .
        // => with suffix L, Copmipler and JVM reads this Interger as long directly not
        // as it

    }

    static void M1(byte b) {
        System.out.println("byte Param");
    }
     static void M1 (short s){
        System.out.println("short Param");
     }
     static void M1 (int i){
        System.out.println("int Param");
     }
     static void M1 (Long L){
        System.out.println("Long Param");
     }

}
