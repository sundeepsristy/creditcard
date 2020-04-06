package app.common;

import org.apache.commons.validator.routines.checkdigit.LuhnCheckDigit;
import app.common.CardValidator;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CardNumberValidator implements ConstraintValidator<CardValidator,String> {


    /**
     * Check if the card number is valid and passes from LUHN10 check.
     * @param cardNumber
     * @param constraintValidatorContext
     * @return
     */
    @Override
    public boolean isValid(String cardNumber, ConstraintValidatorContext constraintValidatorContext) {

        if(cardNumber.length()>19){
        return Boolean.FALSE.booleanValue();
        }
        LuhnCheckDigit checkDigit = new LuhnCheckDigit();
       return checkDigit.isValid(cardNumber);
    }


}
