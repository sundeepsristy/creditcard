package app.rest.model;

import app.common.CardValidator;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * This is the model for holding the request payload of card
 */

public class AddCardInfoRequest implements Serializable {

    private static final long serialVersionId = 1L;

    /**
     * Card Name.
     */
    @NotBlank(message = "{NotBlank.card.name}")
    private String name;

    /**
     * Card Number.
     */
    @NotBlank(message = "{NotBlank.card.number}")
    @CardValidator(message = "{CardNumber.not.valid}")
    private String cardNumber;

    /**
     * Card Limit.
     */
    @NotNull(message = "{NotNull.card.limit}")
    private Long limit;

    /**
     * Get Name.
     *
     * @return Name as String
     */
    public String getName() {
        return name;
    }

    /**
     * Sets Name.
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get Card Number.
     *
     * @return Long card number
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Set Card Number.
     *
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Get Card Limit.
     *
     * @return double card limit.
     */
    public Long getLimit() {
        return limit;
    }

    /**
     * Set Card Limit==]
     *
     * @param limit
     */
    public void setLimit(Long limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
