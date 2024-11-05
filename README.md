# Functional Interfaces Optional Lesson

In this assignment, you'll be learning about functional interfaces. Functional interfaces are interfaces that describe
functions, as you might be able to guess from the name. However, you likely don't yet know what an interface is.

### Interfaces

Interfaces can be thought of as the outline or blueprint for a class. Just like a class, they have methods, and can
extend other interfaces. However, interfaces' methods have no code; instead, they are descriptions of an expected
method. For example, the interface `List` (which is implemented by `ArrayList`) includes methods like `List.size()` or 
`List.contains(object)`, which every List should be able to perform. When someone writes a class like `ArrayList` which
implements `List`, they need to override every method in List so that it has actual code.

### Functional Interfaces

Functional interfaces are a special type of interface which represents a single function. These interfaces are fairly
commonly used 
