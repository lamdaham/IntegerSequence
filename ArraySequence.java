import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence{
	int currentIndex;
	int[] data;

	public ArraySequence(int[] other) {
		this.currentIndex = 0;
		this.data = new int[other.length];
		for (int i = 0; i<data.length; i++) {
			this.data[i] = other[i];
		}
	}

	public ArraySequence(IntegerSequence otherseq) {

	}


	public boolean hasNext() {
		return currentIndex<=(length()-1);
	}

	public int next() {
		if (hasNext()){
			currentIndex++;
			return data[currentIndex-1];
		} else {
			throw new NoSuchElementException();
		}
	}

	public int length() {
		return data.length;
	}

	public void reset() {
		currentIndex = 0;
	}
}