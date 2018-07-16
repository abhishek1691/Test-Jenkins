package com.fretron;

import jdk.nashorn.internal.objects.annotations.Getter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by anurag on 23-Apr-1
 */
@Path("/test")
public class Resources {

    @GET
    @Path("/statu")
    @Produces(MediaType.TEXT_PLAIN)
    public String getServiceStatus()
    {
        return "i am ok ";
    }
}
