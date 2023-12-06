
# Java 21

- [ ] Record Patterns - instanceOf pattern matching for Records
- [ ] Pattern Matching for Switch
- [ ] String templates
- [ ] Virtual Threads

## Pattern Matching for Switch

- Selector Expression Type
    ```java
    record Point(int x, int y) { }
  
    enum Color { RED, GREEN, BLUE }
    
    static void typeTester(Object obj) {
        switch (obj) {
        case String s -> {
                if (s.length() == 1) {
                    System.out.println("Short: " + s);
                } else {
                    System.out.println(s);
                }
                break;
        }
        case Color c  -> System.out.println("Color with " + c.values().length + " values");
        case Point p  -> System.out.println("Record class: " + p.toString());
        case null, default       -> System.out.println("Something else");
        }
    }
    ```

- When clauses
    ```java
    record Point(int x, int y) { }
  
    enum Color { RED, GREEN, BLUE }
    
    static void typeTester(Object obj) {
        switch (obj) {
        case String s when s.length() == 1 -> System.out.println("Short: " + s);
        case String s                      -> System.out.println(s);
        case Color c  -> System.out.println("Color with " + c.values().length + " values");
        case Point p  -> System.out.println("Record class: " + p.toString());
        case null, default       -> System.out.println("Something else");
        }
    }
    ```