package com.api.celcoin.presantation.controllers;

import com.api.celcoin.domain.dto.PixDTO;
import com.api.celcoin.service.PixService;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/v1/pix")
public class PixController {


    @Inject
    PixService service;



    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response handlePix(PixDTO dto) {

        return service.handlePix(dto);

    }


}
