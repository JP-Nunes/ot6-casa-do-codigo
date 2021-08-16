package com.bootcamp.casadocodigo.validator;

import org.hibernate.validator.constraints.CompositionType;
import org.hibernate.validator.constraints.ConstraintComposition;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@ConstraintComposition(CompositionType.OR)
@CPF
@CNPJ
@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = {})
public @interface CpfOrCnpj {

    String message() default "{com.bootcamp.casadocodigo.CpfOrCnpj}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String value() default "";
}
