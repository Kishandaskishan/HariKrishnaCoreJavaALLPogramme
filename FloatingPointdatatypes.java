public class FloatingPointdatatypes {
   public static void main(String[] args) {
     // float f1=10.5: CE:
      float f2=(float)10.5;
      float f3=10.5f;
      System.out.println(f2);
      System.out.println(f3);
      double d1 =10.5;
      double d2=10.5d;
      System.out.println(d1);
      System.out.println(d2);

      // boolean bo1=5;
      //boolean bo2=5l;
      //boolean bo3=5f;
      //boolean bo4=5d;

      M1(5);
      //M1(5.0); //CE
      M1(5.0f);
      M1(5f);
      //M1(5d);
   } 

   static void M1(int i){
    System.out.println("Int param i :"+ i);
   }
   static void M1(float f){
    System.out.println(" float param f:" +f);
   }
}
