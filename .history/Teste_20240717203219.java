public class Teste {
  
  public static void main(String[] args) {
    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

      SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(eager);
    lazy = SingletonEager.getInstancia();
    System.out.println(lazy);

      SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
  }
  
}
