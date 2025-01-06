package exam02;

import java.lang.annotation.ElementType;

public @interface Target {
    ElementType[] value();
}
