class Main {
  public static void main(String[] args) {
    var history = new BrowseHistory();
    history.push("history entry 01");
    history.push("history entry 02");
    history.push("history entry 03");

    Iterator iterator = history.createIterator();
    /// a for loop
    while (iterator.hasNext()){
      var url = iterator.current();
      System.out.println(url);
      iterator.next();
    }
  }
}