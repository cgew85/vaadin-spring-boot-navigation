package io.github.cgew85.views;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;
import io.github.cgew85.DemoUI;

/**
 * Created by Arkan on 10.03.2016.
 */
@SpringView(name = ViewA.VIEW_NAME)
public class ViewA extends VerticalLayout implements View {

    public static final String VIEW_NAME = "viewA";

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {
        Button button = new Button();
    }
}
