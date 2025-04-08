package xd.calculadora_server.service;

import org.springframework.stereotype.Service;

import xd.calculadora_server.exception.EqualArgumentException;
import xd.calculadora_server.exception.LesserArgumentException;

@Service
public class CalculadoraService {

    public double restar(Long a, Long b) throws LesserArgumentException, EqualArgumentException {
        if (a < b) {
            throw new LesserArgumentException("Error 400: 'a'  no puede ser menor que 'b'");
        }
        if (a.equals(b)) {
            throw new EqualArgumentException("Error 400: 'a'  no puede ser igual a 'b'");
        }
        return a - b;
    }
}
