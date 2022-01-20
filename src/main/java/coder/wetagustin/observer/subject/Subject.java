package coder.wetagustin.observer.subject;

import coder.wetagustin.observer.configuration.EventType;
import coder.wetagustin.observer.observator.Observator;

import java.util.HashSet;

public class Subject {

    private final HashSet<Observator> observators;

    public Subject() {
        this.observators = new HashSet<Observator>();
    }

    public void addObservator( Observator o ) {
        observators.add(o);
    }

    public void deleteObservator( Observator o ) {
        observators.remove(o);
    }

    public void notifyObservators( EventType e ) {
        for ( Observator o : observators ) {
            o.update(e);
        }
        System.out.println("Todos los observadores han respondido al cambio.\n");
    }

}
