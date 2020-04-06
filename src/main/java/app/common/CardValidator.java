package app.common;
import app.common.CardNumberValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {CardNumberValidator.class})
/**
 * The Validator for Card Number.
 */
public @interface CardValidator {

        /**
         * the default message.
         * @return message
         */
        String message();

        /**
         * default groups.
         * @return groups
         */
        Class<?>[] groups() default {};

        /**
         * default payloads.
         * @return Payload
         */
        Class<? extends Payload>[] payload() default {};
}
