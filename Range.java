import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  //@param start : the starting value (inclusive) which must be <= end.
  //@param end : the ending value which is also inclusive.
  public Range(int start,  int end){  }

  public void reset(){  }
  public int length(){  }
  public boolean hasNext(){  }

  //@throws NoSuchElementException when hasNext() is false.
  public int next(){    }
  
}