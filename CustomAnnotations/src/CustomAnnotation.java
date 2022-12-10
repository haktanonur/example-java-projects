import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
//@Retention()
//@Target
//@Inherited
public @interface CustomAnnotation {
    String name() default "Göksu";
    int id() default 244;
    String[] tags() default {"Python", "Programlama", "Dili"};
}
