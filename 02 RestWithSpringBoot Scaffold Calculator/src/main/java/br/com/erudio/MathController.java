package br.com.erudio;

import br.com.erudio.exception.UnsuportedMathOperationException;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController{
    private static final String template = "Hello, %s!";

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo) ){
                throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        Double sum = convertToDouble(numberOne) + convertToDouble(numberTwo);
        return sum;
    }
    private Double convertToDouble(String strNumber){
        if(strNumber == null){
            return 0D;
        }else{
            String number = strNumber.replaceAll(",",".");
            if(isNumeric(number)){
                return Double.parseDouble(number);
            };

        }
        return 0D;

    };
    private boolean isNumeric(String strNumber){
        if(strNumber == null){
            return  false;
        };

        String number = strNumber.replaceAll(",",".");
        return number.matches("[-+]?[0-9]*\\:?[0-9]+");

    }
}
