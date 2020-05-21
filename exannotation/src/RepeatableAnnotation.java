import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(value = RepeatableAnnotations.class)
public @interface RepeatableAnnotation {
    String value();
}
