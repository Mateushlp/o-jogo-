public class Teste {
  
  private static final SingletonLazy SingletonLazyHolder = null;

  /**
   * @param <SingletonLazyHolder>
   * @param args
   */
  public static <SingletonLazyHolder> void main(String[] args) {
    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

      SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(eager);
    eager = SingletonEager.getInstancia();
    System.out.println(eager);
        
    
    SingletonLazyHolder lazyHolder = SingletonLazy.getInstancia();
    System.out.println(lazyHolder);
    lazyHolder = SingletonLazy.getInstancia();
    System.out.println(lazyHolder);
  }
  
}
