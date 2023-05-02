package chap03.ch01;

public class GenericPrinter<T> {
	private T material;

	public void setMaterial(T material) {
		this.material = material;
	}

	public String toString() {
		return material.toString();
	}
}
