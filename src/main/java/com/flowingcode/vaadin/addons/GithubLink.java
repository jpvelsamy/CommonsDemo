package com.flowingcode.vaadin.addons;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used for configuring the URL in the {@code GitHubCorner}
 *
 * @author Javier Godoy / Flowing Code
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface GithubLink {
  String value();
}
