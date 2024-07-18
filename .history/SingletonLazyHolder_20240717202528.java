public class SingletonLazyHolder {
private static class  inholder {
  private static SingletonLazyHolder instancia = new SingletonLazyHolder();
}
    private SingletonLazyHolder(){
      super();
    }

    public static SingletonLazyHolder getInstancia() {
      return instancia;
    }
}
