package com.edu.iudigital.helpmeiud.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.edu.iudigital.helpmeiud.dto.request.UsuarioDTORequest;
import com.edu.iudigital.helpmeiud.dto.response.DelitoDTO;
import com.edu.iudigital.helpmeiud.dto.response.UsuarioDTO;
import com.edu.iudigital.helpmeiud.exceptions.RestException;
import com.edu.iudigital.helpmeiud.service.iface.IUsuarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@RestController
@RequestMapping("/usuarios")
@Api(value = "/usuarios", tags = {"Usuarios"})
@SwaggerDefinition(tags = {
        @Tag(name = "Usuarios", description = "Gestion API Usuarios")
})
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @ApiOperation(value = "Guardar un Delito",
        response = DelitoDTO.class,
        responseContainer = "DelitoDTO",
        produces = "application/json",
        httpMethod = "POST")
    @PostMapping("/signup")
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<UsuarioDTO> create(
            @RequestBody @Valid UsuarioDTORequest usuarioDTORequest
    ) throws RestException {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(
                        usuarioService.guardar(usuarioDTORequest)
                );
    }
}
