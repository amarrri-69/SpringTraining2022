 public static void fizzBuzz(int number) {
   for (int i=1; i <= number; i++) {
     if ((i % 3 == 0) && (i % 5 != 0)) {
       System.out.println("fizz");
     }
     else if ((i % 3 != 0) && (i % 5 == 0)) {
       System.out.println("buzz");
     }
     else if (i % 15 == 0) {
       System.out.println("fizz buzz");
     }
     else {
       System.out.println(i);
     }
   }
 }
