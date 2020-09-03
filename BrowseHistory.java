import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
/// create an array to store history. 
/// Note array size is immutalbe 
  private String[] urls = new String[10];
/// default value is 0
  private int count;

/// add url at index plus one
  public void push(String url) {
/// assign a value to an element
    urls[count++] = url;
  }

/// return url at index minus one
  public String pop() {
    return urls[--count];
  }

/// coupled to the iterator class
  public Iterator createIterator() {
    /// main class as parameter
    return new ArrayIterator(this);
  }

/// nested class: separated from main class
/// modify this class to implement this interface, if further change is needed
  public class ArrayIterator implements Iterator {
    private BrowseHistory history;
    /// default value is 0
    private int index;
/// constructor: import data from main class
    public ArrayIterator(BrowseHistory history) {
      this.history = history;
    }

    @Override
    public boolean hasNext() {
/// element index < number of urls stored in main class
      return (index < history.count);
    }

    @Override
    public String current() {
      return history.urls[index];
    }

    @Override
    public void next() {
      index++;
    }
  }

}