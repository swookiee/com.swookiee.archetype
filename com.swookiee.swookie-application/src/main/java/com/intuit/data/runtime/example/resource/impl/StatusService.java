package com.intuit.data.runtime.example.resource.impl;

import org.osgi.service.component.annotations.Component;

import com.intuit.data.runtime.example.resource.Status;
import com.intuit.data.runtime.example.resource.transfer.StatusObject;

@Component
public class StatusService implements Status {

    @Override
    public StatusObject ping() {
        return new StatusObject();
    }
}
