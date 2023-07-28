package com.edu.iudigital.helpmeiud.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.edu.iudigital.helpmeiud.dto.request.DelitoDTORequest;
import com.edu.iudigital.helpmeiud.dto.response.DelitoDTO;
import com.edu.iudigital.helpmeiud.exceptions.RestException;
import com.edu.iudigital.helpmeiud.service.iface.IDelitoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@RestController
@RequestMapping("/delitos")
@Api(value = "/delitos", tags = {"Delitos"})
@SwaggerDefinition(tags = {
        @Tag(name = "Delitos", description = "Gestion API Delitos")
})
public class DelitoController {
  @Autowired
  IDelitoService delitoService;

  @ApiOperation(value = "Obtiene todos delitos",
          responseContainer = "List",
          produces = "application/json",
          httpMethod = "GET")
  @GetMapping
  @ResponseStatus(code = HttpStatus.OK)
  public ResponseEntity<List<DelitoDTO>> index() {
    return ResponseEntity
            .ok()
            .body(
              delitoService.consultarTodos()
            );
  }

    @ApiOperation(value = "Guardar un Delito",
            response = DelitoDTO.class,
            responseContainer = "DelitoDTO",
            produces = "application/json",
            httpMethod = "POST")
    @Secured("ROLE_ADMIN")
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<DelitoDTO> create(
            @RequestBody @Valid DelitoDTORequest delitoDTORequest
    ) throws RestException {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(
                   delitoService.guardarDelito(delitoDTORequest)
                );
    }
}
