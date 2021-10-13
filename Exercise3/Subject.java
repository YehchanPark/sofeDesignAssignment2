package Exercise3;

public abstract class Subject {

    abstract void register(Observer o);//Creates method that will be used by pther clased linked to the observer
    abstract void unregister(Observer o);
    abstract void notifyObservers();
}
