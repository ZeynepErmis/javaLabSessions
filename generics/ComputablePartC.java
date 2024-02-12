// This interface represents a generic computable operation that takes two input parameters of types U and V,
// both of which must extend the Number class, and returns a result of type T.
public interface ComputablePartC<T, U extends Number, V extends Number> {
    // Method signature for the compute operation.
    // It takes two parameters of types U and V (both extending Number), and returns a result of type T.
    public T compute(U x, V y);
}
