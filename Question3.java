// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class Question3 {
   

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      if (var2 >= 90) {
         System.out.println("Grade A");
      } else if (var2 >= 80 && var2 < 90) {
         System.out.println("Grade B");
      } else if (var2 >= 70 && var2 < 80) {
         System.out.println("Grade c");
      } else {
         System.out.println("Grade D");
      }

   }
}
