import java.util.NoSuchElementException;
import java.lang.Math;
public class Range implements IntegerSequence{
  private int start,end,current;

  //@param start : the starting value (inclusive) which must be <= end.
  //@param end : the ending value which is also inclusive.
  public Range(int start,  int end){
    if (start > end) {
      throw new IllegalArgumentException("Start value cannot be greater than the end value");
    }
    this.start = start;
    this.end = end;
    this.current = start;
}

  public void reset(){
  	current = start;
  }
  public int length(){
  	return end-start+1;
  }


  public boolean hasNext(){
  	return ((current<=end));
  }

  //@throws NoSuchElementException when hasNext() is false.
  public int next(){
  	if (hasNext()) {
  		current++;
  		return current-1;
  	} else {
  		throw new NoSuchElementException();
  	}
  }
  
}