import java.util.NoSuchElementException;
import java.lang.Math;
public class Range implements IntegerSequence{
  private int start,end,current;

  //@param start : the starting value (inclusive) which must be <= end.
  //@param end : the ending value which is also inclusive.
  public Range(int start1,  int end1){
  	start=start1-1;
  	end = end1;
  	current = start;
  }

  public void reset(){
  	current = start;
  }
  public int length(){
  	return (Math.abs(end-start));
  }


  public boolean hasNext(){
  	return ((current<end));
  }

  //@throws NoSuchElementException when hasNext() is false.
  public int next(){
  	if (hasNext()) {
  		current++;
  		return current;
  	} else {
  		throw new NoSuchElementException();
  	}
  }
  
}