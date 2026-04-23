package Lesson35.SpecsClasses.VineyardAppWithSpecs;


/**
 * The RareAttributes class is designed to encapsulate attributes
 * that are NOT frequently used in the system, but are still relevant
 * for extended functionality, edge cases, or future expansion.
 *
 * WHY THIS CLASS EXISTS:
 * In large systems, having too many attributes inside one class
 * (e.g., Crop or Grape) makes the code harder to read, maintain,
 * and extend. Many attributes are only used in rare scenarios,
 * such as special events, debugging, analytics, or premium features.
 *
 * Instead of cluttering the main class, these attributes are grouped
 * into a separate object. This follows good Object-Oriented Design:
 *
 * ✔ Separation of Concerns
 * ✔ Cleaner primary classes
 * ✔ Easier future expansion
 * ✔ Better readability for students and developers
 *
 * WHEN TO USE:
 * - Attributes used only occasionally
 * - Experimental or "fun" features
 * - Rare conditions (disease, mutation, VIP status, etc.)
 *
 * ⚠ IMPORTANT:
 * This object can be null if not needed, meaning we avoid wasting memory
 * and complexity unless the feature is actually used.
 *
 * Example:
 * A normal grape does NOT need radioactiveLevel or celebrityOwner.
 * But a special grape might
 */
public class RareAttributes {

    // 🌟 Rare / fun / edge-case attributes
    private boolean isHaunted;
    private double mutationLevel;
    private String celebrityOwner;
    private boolean isAwardWinning;
    private int timesFeaturedInWineMagazine;
    private boolean radioactive;
    private String secretNickname;

    public RareAttributes(boolean isHaunted, double mutationLevel, String celebrityOwner) {
        this.isHaunted = isHaunted;
        this.mutationLevel = mutationLevel;
        this.celebrityOwner = celebrityOwner;
    }

    // Getters & setters
    public boolean isHaunted() {
        return isHaunted;
    }

    public void setHaunted(boolean haunted) {
        isHaunted = haunted;
    }

    public double getMutationLevel() {
        return mutationLevel;
    }

    public void setMutationLevel(double mutationLevel) {
        this.mutationLevel = mutationLevel;
    }

    public String getCelebrityOwner() {
        return celebrityOwner;
    }

    public void setCelebrityOwner(String celebrityOwner) {
        this.celebrityOwner = celebrityOwner;
    }
}