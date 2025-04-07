package com.EmpresaX.ApiSimplesQueRetornaTexto.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segundo-texto")
public class ControllerSegundoTexto {

    @GetMapping
    public String segundoTexto()
    {
        return "E com esse projeto, inicio a minha carreira como dev backend java";
    }
}
