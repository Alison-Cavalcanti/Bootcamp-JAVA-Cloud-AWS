package digitalInovationOne;

public class App {

    public static void main(String[] args){
        singletonLazy lazy = singletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = singletonLazy.getInstancia();
        System.out.println(lazy);

        singletonEager eager = singletonEager.getInstancia();
        System.out.println(eager);
        eager = singletonEager.getInstancia();
        System.out.println(eager);

        singletonLazyHolder holder = singletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = singletonLazyHolder.getInstancia();
        System.out.println(holder);
    }
    
}
