public static void nPrime(int number) {
  for (int i=0; i<number; i++) {
    int difference = (i+1)*(i+1) - i * i;
    System.out.println(difference);
  }
}
