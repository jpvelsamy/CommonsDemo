package com.flowingcode.vaadin.addons.demo;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.PageTitle;

@PageTitle("Demo 4")
@DemoSource(
    "https://github.com/FlowingCode/CommonsDemo/blob/master/src/test/java/com/flowingcode/vaadin/addons/demo/impl/SampleDemo.java")
public class SampleDemo extends Div {

  public SampleDemo() {
    add(new Span("Demo component with annotations"));
  }
}
