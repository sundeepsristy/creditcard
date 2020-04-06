package app.persistence.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
public class Cards {
    /**
     * Credit card number
     */
    @Id
    private String cardNumber;

    /**
     * Name.
     */
    @NotNull
    private String name;

    /**
     * Credit card limit.
     */
    private Long creditLimit;

    /**
     * Card balance.
     */
    private BigDecimal balance;

    /**
     * Currency Symbol
     */
    private String currencySymbol="£";

    /**
     * Get Card Number.
     * @return long
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Set Card Number
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Get Name.
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Set Name.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get Limit.
     * @return long
     */
    public Long getCreditLimit() {
        return creditLimit;
    }

    /**
     * Set Limit.
     * @param creditLimit
     */
    public void setCreditLimit(Long creditLimit) {
        this.creditLimit = creditLimit;
    }

    /**
     * Get Balance.
     * @return BigDecimal
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Set Balance.
     * @param balance
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * Get Currency Symbol
     * @return Strin
     */
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    /**
     * Set Currency Symbol.
     * @param currencySymbol
     */
    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
                
    }
}
