class Amount {

    public static final Amount ZERO = of(0)

    private int value

    private Amount(int value) {
        this.value = value
    }

    static Amount of(int value) {
        new Amount(value)
    }

    Amount negative() {
        new Amount(-this.value)
    }

    Amount plus(Amount amount) {
        new Amount(this.value + amount.value)
    }

    String toString() {
        this.value
    }

    boolean equals(o) {
        if (this.is(o)) return true
        if (o == null || getClass() != o.class) return false

        Amount amount = (Amount) o

        if (value != amount.value) return false

        return true
    }

    int hashCode() {
        return value
    }
}