class Main {
  public static void main(String[] args) {
    var history = new BrowseHistory2();
    history.push("history entry 21");
    history.push("history entry 22");
    history.push("history entry 23");

    Iterator iterator = history.createIterator();
    /// iterate elements
    while (iterator.hasNext()){
      var url = iterator.current();
      System.out.println(url);
      iterator.next();
    }
  }
}