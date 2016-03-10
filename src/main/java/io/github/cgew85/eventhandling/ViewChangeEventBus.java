package io.github.cgew85.eventhandling;

import com.google.common.eventbus.EventBus;

/**
 * Created by Arkan on 10.03.2016.
 */
public class ViewChangeEventBus extends EventBus {

    @Override
    public void register(Object object) {
        super.register(object);
    }

    @Override
    public void post(Object event) {
        super.post(event);
    }
}
