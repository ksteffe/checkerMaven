package myqual.sample.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.TypeQualifier;
import org.checkerframework.framework.qual.Unqualified;

/**
 * A type-safe Id marker
 */
@TypeQualifier
@SubtypeOf({Unqualified.class})
@Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Id {
}
