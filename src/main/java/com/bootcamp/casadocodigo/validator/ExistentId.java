package com.bootcamp.casadocodigo.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ExistentIdValidator.class)
public @interface ExistentId {

    String message() default "{com.bootcamp.casadocodigo.ExistentId}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String value() default "";

    String field();

    Class<?> theClass();
}
