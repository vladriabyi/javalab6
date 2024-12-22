import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a necklace made up of gemstones.
 * Provides functionality to add gemstones, calculate total weight and value, and check the transparency range.
 */
public class Necklace {
    private List<Gemstone> gemstones;

    public Necklace() {
        gemstones = new ArrayList<>();
    }

    /**
     * Adds a gemstone to the necklace.
     * @param gemstone Gemstone to be added.
     */
    public void addGemstone(Gemstone gemstone) {
        gemstones.add(gemstone);
    }

    /**
     * Calculates the total weight of all gemstones in the necklace.
     * @return Total weight.
     */
    public double calculateTotalWeight() {
        double totalWeight = 0;
        for (Gemstone gemstone : gemstones) {
            totalWeight += gemstone.calculateWeight();
        }
        return totalWeight;
    }

    /**
     * Calculates the total value of all gemstones in the necklace.
     * @return Total value.
     */
    public double calculateTotalValue() {
        double totalValue = 0;
        for (Gemstone gemstone : gemstones) {
            totalValue += gemstone.calculateValue();
        }
        return totalValue;
    }

    /**
     * Checks if all gemstones in the necklace have transparency within the given range.
     * @param min Minimum transparency value.
     * @param max Maximum transparency value.
     * @return true if all gemstones are within the range, otherwise false.
     */
    public boolean checkTransparencyRange(double min, double max) {
        for (Gemstone gemstone : gemstones) {
            if (!gemstone.isInTransparencyRange(min, max)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Necklace{gemstones=" + gemstones + '}';
    }
}
