import java.util.Arrays;
import java.util.Collection;

/**
 * A class representing a resizable list.
 * Implements the List interface and uses an array to store elements,
 * increasing the size of the array by 30% when needed.
 *
 * @param <T> the type of elements in the list
 */
public class ResizableList<T> implements List<T> {
    private static final int INITIAL_CAPACITY = 15;
    private static final double GROWTH_FACTOR = 1.3;
    private T[] elements;
    private int size;

    /**
     * Default constructor that initializes an empty list.
     */
    public ResizableList() {
        this.elements = (T[]) new Object[INITIAL_CAPACITY];
        this.size = 0;
    }

    /**
     * Constructor that initializes the list with one element.
     *
     * @param element the element to add
     */
    public ResizableList(T element) {
        this.elements = (T[]) new Object[INITIAL_CAPACITY];
        this.size = 1;
        this.elements[0] = element;
    }

    /**
     * Constructor that initializes the list with a collection of elements.
     *
     * @param collection the collection of elements to add
     */
    public ResizableList(Collection<T> collection) {
        this.elements = (T[]) new Object[INITIAL_CAPACITY];
        this.size = collection.size();
        collection.toArray(this.elements);
    }

    /**
     * Adds an element to the list. If the array is full, it grows by 30%.
     *
     * @param element the element to add
     */
    @Override
    public void add(T element) {
        ensureCapacity();
        elements[size++] = element;
    }

    /**
     * Removes the element at the specified index. Shifts subsequent elements to the left.
     *
     * @param index the index of the element to remove
     */
    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;
    }

    /**
     * Retrieves the element at the specified index.
     *
     * @param index the index of the element to retrieve
     * @return the element at the specified index
     */
    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return elements[index];
    }

    /**
     * Returns the size of the list.
     *
     * @return the size of the list
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Ensures the internal array has enough capacity to add a new element.
     * If not, the array is resized by 30%.
     */
    private void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = (int) (elements.length * GROWTH_FACTOR);
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    @Override
    public String toString() {
        return "ResizableList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(Arrays.copyOf(elements, size)) +
                '}';
    }
}
