public class SingletonLazyHolder {
private static class  holder {

  

  private static SingletonLazyHolder instancia = new SingletonLazyHolder();
}
    private SingletonLazyHolder(){
      super();
    }

    public static SingletonLazyHolder getInstancia() {
      return instancia;
    }
}
