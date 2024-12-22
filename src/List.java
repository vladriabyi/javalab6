/**
 * Interface representing a generic list.
 * Defines basic operations like adding, removing, and retrieving elements by index.
 *
 * @param <T> The type of elements in the list.
 */
public interface List<T> {
    /**
     * Adds an element to the list.
     *
     * @param element the element to add
     */
    void add(T element);

    /**
     * Removes the element at the specified index.
     *
     * @param index the index of the element to remove
     */
    void remove(int index);

    /**
     * Retrieves the element at the specified index.
     *
     * @param index the index of the element to retrieve
     * @return the element at the specified index
     */
    T get(int index);

    /**
     * Returns the size of the list.
     *
     * @return the size of the list
     */
    int size();
}
