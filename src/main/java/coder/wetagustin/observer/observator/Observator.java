package coder.wetagustin.observer.observator;

import coder.wetagustin.observer.configuration.EventType;

public class Observator {

    public void update( EventType e ) {
        System.out.println("Observator " + this + " Updated in response to " + e.toString() + ".\n");
    }

}
