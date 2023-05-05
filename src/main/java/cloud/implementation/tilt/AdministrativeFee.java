package cloud.implementation.tilt;

import com.fasterxml.jackson.annotation.*;

/**
 * The fee that refers to several copies.
 */
public class AdministrativeFee {
    private double amount;
    private String currency;

    /**
     * The amount of money to be paid for a copy.
     */
    @JsonProperty("amount")
    public double getAmount() { return amount; }
    @JsonProperty("amount")
    public void setAmount(double value) { this.amount = value; }

    /**
     * The currency in which the amount of money for one copy has to be provided acc. to ISO
     * 4217.
     */
    @JsonProperty("currency")
    public String getCurrency() { return currency; }
    @JsonProperty("currency")
    public void setCurrency(String value) { this.currency = value; }

    @Override
    public String toString() {
        return "AdministrativeFee{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
