package giuaky.bai4;

public abstract class ToppingDecorator extends Bread {
	Bread bread;

	public ToppingDecorator() {

	}

	public abstract String getDescription();
}
