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
commonly used, and are used all the time by Swing, a graphics library which you will be using towards the end of the 
year and for your final project. There are a lot of them, but they can be divided into a few major categories, which are
then further divided based on what type they accept as input. The categories are:
* `UnaryOperator`, which accepts one input and gives an output of the same type
* `BinaryOperator`, which accepts two inputs and gives one output of the same type
* `Consumer`, which accepts one input and gives no output
* `Supplier`, which accepts no input and gives one output
* `Predicate`, which accepts one input and returns a boolean
* `Function`, which accepts one input and returns an output of a different type

These categories have versions for each basic type (for example, you can have an `IntUnaryOperator`, a `DoubleUnaryOperator`,
a `LongUnaryOperator`, etc).
