package com.intuit.data.runtime.example.resource;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.intuit.data.runtime.example.resource.transfer.StatusObject;

@Path(Status.PATH)
@Produces(APPLICATION_JSON)
public interface Status {

    final static String PATH = "/status";

    @GET
    public StatusObject ping();
}
