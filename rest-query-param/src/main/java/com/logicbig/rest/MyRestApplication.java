package com.logicbig.rest;


import org.glassfish.jersey.CommonProperties;
import org.glassfish.jersey.model.internal.CommonConfig;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("api")
public class MyRestApplication extends Application {
}