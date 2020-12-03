import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  //@param start : the starting value (inclusive) which must be <= end.
  //@param end : the ending value which is also inclusive.
  public Range(int start,  int end){
  	start = start;
  	end = end;
  	current = start;
  }

  public void reset(){
  	current = start;
  }
  public int length(){
  	return (Math.abs(end-start));
  }
  public boolean hasNext(){
  	return (!(current==end));
  }

  //@throws NoSuchElementException when hasNext() is false.
  public int next(){
  	if (hasNext()) {
  		return current+1;
  	} else {
  		throw new NoSuchElementException();
  	}
  }
  
}