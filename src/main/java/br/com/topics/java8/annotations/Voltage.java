package br.com.topics.java8.annotations;

import java.lang.annotation.Repeatable;

@Repeatable(Voltages.class)
@interface Voltage {
    String tension();
}
