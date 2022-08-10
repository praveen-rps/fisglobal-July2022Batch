package com.logicbig.rest.api;


import javax.ws.rs.*;
import java.math.BigDecimal;

@Path("/orders")
public class OrderService {
	
	
    @GET
    public String getOrders(@QueryParam("stateCode") String stateCode,
                            @QueryParam("dateFrom") String fromDateString,
                            @QueryParam("dateTo") String toDateString,
                            @DefaultValue("-1") @QueryParam("pageStart") int pageStart,
                            @DefaultValue("-1") @QueryParam("pagesSize") int pageSize) {
        String message = "Started from all orders. ";
        if (stateCode != null) {
            //validate state code and get related orders
            message += "filtered orders for the state " + stateCode + ". ";
        }

        if (fromDateString != null && toDateString != null) {
            //validate and parse dates to date objects and
            //get related orders
            message += "Filtered orders for the date range, from "
                    + fromDateString + " to " + toDateString + ". ";
        }

        //to pagination
        if (pageStart != -1 && pageSize != -1) {
            message += " Did pagination from order start: "
                    + pageStart + ", pagesSize: " + pageSize;
        }

        return message;
    }

    @GET
    @Path("/{orderId}")
    public String getOrderById(
            @PathParam("orderId") String orderId) {
        return "returning order with id " + orderId;
    }


    //conversion rules applied to BigDecimal as it has a constructor with
    //String parameter.
    @GET
    @Path("{orderId}/items")
    public String getOrderItemsPricedGreaterThan(@PathParam("orderId") String orderId,
                                                 @QueryParam("minPrice") BigDecimal minPrice) {
        String message = "Starting with all items for order id: "+orderId+". ";
        if(minPrice!=null) {
            // find order greater than min price
            message += "Filtered items with price greater than inclusively: "
                                                       + minPrice.toPlainString();
        }
        return message;
    }
}