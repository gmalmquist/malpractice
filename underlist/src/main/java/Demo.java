public class Demo {

  public static void main(String[] args) {
    ____<String> list = new ____<String>();
    list._("Hello");
    list._("This");
    list._("Is");
    list._("A");
    list._("List.");

    testEqual(0, list.___._("Hello"));
    testEqual(1, list.___._("This"));
    testEqual(2, list.___._("Is"));
    testEqual(3, list.___._("A"));
    testEqual(4, list.___._("List."));
    testEqual(-1, list.___._("Not here."));
  }

  private static void testEqual(Object a, Object b) {
    if (a != b) {
       System.err.println("Expected " + a + ", Got " + b);
    } else {
       System.out.println("Correctly got " + b);
    }
  }

}
