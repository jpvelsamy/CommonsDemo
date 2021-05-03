/*-
 * #%L
 * Commons Demo
 * %%
 * Copyright (C) 2020 Flowing Code
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.flowingcode.vaadin.addons.demo;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

/** Hello world! */
@Route("")
public class Demo extends VerticalLayout {

  public Demo() {
    final String sourceCodeUrl =
        "https://github.com/FlowingCode/CommonsDemo/blob/master/src/test/java/com/flowingcode/vaadin/addons/demo/impl/Demo.java";
    VerticalLayout vl = new VerticalLayout();
    VerticalLayout vl2 = new VerticalLayout();
    VerticalLayout vl3 = new VerticalLayout();
    vl.setSizeFull();
    vl.add(new TextField("Hello"));

    TabbedDemo tabbedDemo = new TabbedDemo();
    tabbedDemo.addDemo(vl, "Demo 1", sourceCodeUrl);

    vl2.add(new TextField("Hi"));
    tabbedDemo.addDemo(vl2, "Demo 2", sourceCodeUrl);

    TextField tf = new TextField("Demo Without Source Code");
    tf.setWidthFull();
    vl3.add(tf);
    tabbedDemo.addDemo(vl3, "Demo Without Source Code");

    tabbedDemo.addDemo(new SampleDemo());

    add(tabbedDemo);
    setSizeFull();
  }
}
