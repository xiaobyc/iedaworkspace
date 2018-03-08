package observermode;

/**
 * Created by xiaobyc on 2018/3/1.
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
