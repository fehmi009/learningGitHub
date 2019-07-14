package aslanherseyburadaPACKAGE;

public interface Q {

	public abstract void methodAbstact();
	default void methodDefault() {
		System.out.println("I am default implementation");
	}
	static void methodStatic() {
		System.out.println("I am static method");
	}
}
