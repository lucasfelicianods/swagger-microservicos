/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Clientes;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-04T01:05:49.011Z")

@Api(value = "Clientes", description = "the Clientes API")
public interface ClientesApi {

    @ApiOperation(value = "Consulta todos os clientes.", nickname = "consultaTodos", notes = "Esta operação tem por objetivo consulta todos os cliente.", response = Clientes.class, tags={ "Consulta", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sucesso ao Consultar todos os cliente.", response = Clientes.class),
        @ApiResponse(code = 400, message = "Consulta Invalida."),
        @ApiResponse(code = 401, message = "Consulta não autorizada."),
        @ApiResponse(code = 404, message = "Nenhum cliente encontrado para a consulta."),
        @ApiResponse(code = 500, message = "Erro interno ao realizar a consulta.") })
    @RequestMapping(value = "/Clientes",
        produces = { "application/json" }, 
        consumes = { "applivation/json" },
        method = RequestMethod.GET)
    ResponseEntity<Clientes> consultaTodos();

}
