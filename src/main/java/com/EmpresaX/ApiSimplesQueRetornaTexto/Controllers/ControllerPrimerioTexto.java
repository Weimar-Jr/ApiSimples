package com.EmpresaX.ApiSimplesQueRetornaTexto.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiro-texto")
public class ControllerPrimerioTexto {

    @GetMapping
    public String primeiroTexto()
    {
        return "Fiz essa simples API para inciar meus estudos de backend no java";
    }

}
