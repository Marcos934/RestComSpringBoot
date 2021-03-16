package br.com.erudio;

import br.com.erudio.converter.NumberConverter;
import br.com.erudio.exception.UnsuportedMathOperationException;
import br.com.erudio.math.SimpleMath;
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
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ){
                throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return SimpleMath.sum(numberOne, numberTwo);
    }


    @RequestMapping(value="/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sub(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return SimpleMath.sub(numberOne, numberTwo);
    }

    @RequestMapping(value="/mul/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mul(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return SimpleMath.mul(numberOne, numberTwo);
    }

    @RequestMapping(value="/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double div(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return SimpleMath.div(numberOne, numberTwo);
    }

    @RequestMapping(value="/med/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double med(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return SimpleMath.med(numberOne, numberTwo);
    }

    @RequestMapping(value="/squ/{numberOne}", method = RequestMethod.GET)
    public Double squ(
            @PathVariable("numberOne") String numberOne
    ) throws Exception {
        if(!NumberConverter.isNumeric(numberOne)){
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return SimpleMath.squ(numberOne);
    }



}
