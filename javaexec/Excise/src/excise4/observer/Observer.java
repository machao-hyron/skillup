package excise4.observer;

public abstract class Observer {
	protected CarStore carStore;
	public abstract void carPriceChanged();
	public abstract void askPriceFromStore(CarStore store);
	public abstract void leaveStore();
}
