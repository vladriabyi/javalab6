/**
 * Abstract class representing a generic gemstone.
 * Contains properties such as name, weight, value, and transparency,
 * and provides methods to calculate the weight, value, and check transparency range.
 * This class also defines a comparator for sorting gemstones by their value.
 */
public abstract class Gemstone {
    protected String name;
    protected double weight;
    protected double value;
    protected double transparency;

    // Constructor
    public Gemstone(String name, double weight, double value, double transparency) {
        this.name = name;
        this.weight = weight;
        this.value = value;
        this.transparency = transparency;
    }

    /**
     * Method to calculate the weight of the gemstone.
     * @return Weight of the gemstone.
     */
    public double calculateWeight() {
        return weight;
    }

    /**
     * Method to calculate the value of the gemstone.
     * @return Value of the gemstone.
     */
    public double calculateValue() {
        return value;
    }

    /**
     * Checks if the transparency of the gemstone is within the given range.
     * @param min Minimum transparency value.
     * @param max Maximum transparency value.
     * @return true if transparency is within the range, otherwise false.
     */
    public boolean isInTransparencyRange(double min, double max) {
        return transparency >= min && transparency <= max;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getValue() {
        return value;
    }

    public double getTransparency() {
        return transparency;
    }

    @Override
    public String toString() {
        return "Gemstone{name='" + name + "', weight=" + weight + ", value=" + value + ", transparency=" + transparency + '}';
    }
}
