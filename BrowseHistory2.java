import java.util.ArrayList;
import java.util.List;

public class BrowseHistory2 {
/// create an array to store history. 
/// Note array size is immutalbe 
  private ArrayList<String> urls = new ArrayList<String>();
/// default value is 0
  private int count;

/// add url at index plus one
  public void push(String url) {
/// assign a value to an element
    urls.add(url);
    ++count;
  }

/// return url at index minus one
  public String pop() {
    --count;
    return urls.get(count);
  }

/// coupled to the iterator class
  public Iterator createIterator() {
    /// main class as parameter
    return new ListIterator(this);
  }

/// nested class: separated from main class
/// modify this class to implement this interface, if further change is needed
  public class ListIterator implements Iterator {
    private BrowseHistory2 history;
    /// default value is 0
    private int index;
/// constructor: import data from main class
    public ListIterator(BrowseHistory2 history) {
      this.history = history;
    }

    @Override
    public boolean hasNext() {
/// element index < number of urls stored in main class
      return (index < history.urls.size());
    }

    @Override
    public String current() {
      return history.urls.get(index);
    }

    @Override
    public void next() {
      ++index;
    }
  }

}