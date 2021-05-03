package com.flowingcode.vaadin.addons.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used for configuring the source code URL in a {@link TabbedDemo}
 *
 * @author Javier Godoy / Flowing Code
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DemoSource {

  String value();
}
