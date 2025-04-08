package xd.calculadora_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xd.calculadora_server.service.CalculadoraService;

@RestController
public class CalculadoraController {

    @Autowired
    private CalculadoraService service;

    @GetMapping("/resta/{a}/{b}")
    public ResponseEntity<Double> resta(@PathVariable Long a, @PathVariable Long b) {
        return ResponseEntity.ok(service.restar(a, b));
    }
}
