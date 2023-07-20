class AssignmentOperators {
  public static void main(String[] args) {
    int a = 30;
    System.out.println("a+=2 value is " + (a += 2));
    System.out.println("a-=5 value is " + (a -= 5));
    System.out.println("a*=3 value is " + (a *= 3));
    System.out.println("a/=5 value is " + (a = 5));
    System.out.println("a%=6 value is" + (a %= 6));
  }
}