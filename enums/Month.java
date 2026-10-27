package enums;

public enum Month {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30);

    private final int daysAmount;

    Month(int daysAmount) {
        this.daysAmount = daysAmount;
    }

    public int getDaysAmount() {
        return daysAmount;
    }
}