package myqual.sample.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.TypeQualifier;

/**
 * A type-safe Id marker
 */
@TypeQualifier
@DefaultQualifierInHierarchy
@SubtypeOf({})
@Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
public @interface Id {
}
