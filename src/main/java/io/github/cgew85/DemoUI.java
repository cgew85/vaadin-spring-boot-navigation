package io.github.cgew85;

import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.UI;
import io.github.cgew85.eventhandling.ViewChangeEvent;
import io.github.cgew85.eventhandling.ViewChangeEventBus;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Arkan on 10.03.2016.
 */
@SpringUI
public class DemoUI extends UI {

    @Autowired
    private SpringViewProvider springViewProvider;

    private static final ViewChangeEventBus VIEW_CHANGE_EVENT_BUS = new ViewChangeEventBus();

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        VIEW_CHANGE_EVENT_BUS.register(new ViewChangeEvent());

        Navigator navigator = new Navigator(this, this);
        navigator.addProvider(springViewProvider);
        navigator.navigateTo("");
    }

    public static ViewChangeEventBus getViewChangeEventBus() {
        return VIEW_CHANGE_EVENT_BUS;
    }
}
