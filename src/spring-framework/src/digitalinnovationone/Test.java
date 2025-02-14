package digitalinnovationone;

import digitalinnovationone.facade.Facade;
import digitalinnovationone.singleton.*;
import digitalinnovationone.strategy.*;

public class Test {

    public static void main(String[] args) {

        // Singleton:
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        // Strategy:
        Comportamento normal = new ComportamentoPadrao();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();

        // Facade:
        Facade facade = new Facade();
        facade.migrarCliente("Ingrid", "08341-210");
    }
}