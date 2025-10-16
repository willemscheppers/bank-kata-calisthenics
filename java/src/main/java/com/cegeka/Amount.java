package com.cegeka;

import java.util.Objects;

public class Amount {

    public static final Amount ZERO = of(0);

    private final int value;

    private Amount(int value) {
        this.value = value;
    }

    static Amount of(int value) {
        return new Amount(value);
    }

    Amount negative() {
        return new Amount(-value);
    }

    Amount plus(Amount amount) {
        return new Amount(value + amount.value);
    }

    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amount amount = (Amount) o;
        return value == amount.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
