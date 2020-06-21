public enum Plane {
    AIRBUS(150, 1000),
    BOEING(100, 500),
    PRIVATEJET(2, 100);

    public final int capacity;
    public final int totalWeight;

    Plane(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
