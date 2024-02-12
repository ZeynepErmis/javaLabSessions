// This interface represents a generic computable operation that takes two input parameters of types U and V,
// and returns a result of type T.
public interface Computable<T, U, V> {
    // Method signature for the compute operation.
    // It takes two parameters of types U and V, and returns a result of type T.
    public T compute(U x, V y);
}
