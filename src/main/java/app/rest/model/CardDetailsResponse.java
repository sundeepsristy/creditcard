package app.rest.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Response for CardDetails
 */
public class CardDetailsResponse {
    /**
     * CardName.
     */
    private String name;

    /**
     * Card Number.
     */
    private String cardNumber;

    /**
     * Balance
     */
    private String balance;
    /**
     * Limit.
     */
    private String limit;

    /**
     * Set Card Name.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get Card Name.
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Set Card Number.
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Get Card Number.
     * @return String.
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Set Balance.
     * @param balance
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }

    /**
     * Get Balance.
     * @return String
     */
    public String getBalance() {
        return balance;
    }

    /**
     * Set Limit.
     * @param limit
     */
    public void setLimit(String limit) {
        this.limit = limit;
    }

    /**
     * Get Limit.
     * @return Long
     */
    public String getLimit() {
        return limit;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

