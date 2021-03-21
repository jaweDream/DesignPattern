package exercise2.test1;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);

    public void notifyObserver();
}
