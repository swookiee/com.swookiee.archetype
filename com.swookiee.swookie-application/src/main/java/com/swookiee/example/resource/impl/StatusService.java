package com.swookiee.example.resource.impl;

import org.osgi.service.component.annotations.Component;

import com.swookiee.example.resource.Status;
import com.swookiee.example.resource.transfer.StatusObject;

@Component
public class StatusService implements Status {

    @Override
    public StatusObject ping() {
        return new StatusObject();
    }
}
