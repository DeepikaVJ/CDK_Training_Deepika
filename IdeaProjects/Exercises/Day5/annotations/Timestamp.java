import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS) 
@Target(ElementType.TYPE)
@interface TimeStamp {
	Day day();
	Month month();
	Year year();
}