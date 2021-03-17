package br.com.erudio.math;

import br.com.erudio.converter.NumberConverter;
import org.springframework.stereotype.Service;

@Service
public class SimpleMath {

    public  Double sum(String numberOne, String numberTwo){
      return  NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(numberTwo);
    }
    public  Double sub(String numberOne, String numberTwo){
        return  NumberConverter.convertToDouble(numberOne) - NumberConverter.convertToDouble(numberTwo);
    }

    public  Double mul(String numberOne, String numberTwo){
        return  NumberConverter.convertToDouble(numberOne) * NumberConverter.convertToDouble(numberTwo);
    }
    public  Double div(String numberOne, String numberTwo){
        return  NumberConverter.convertToDouble(numberOne) / NumberConverter.convertToDouble(numberTwo);
    }

    public  Double med(String numberOne, String numberTwo){
        return  (double) (NumberConverter.convertToDouble(numberOne) * NumberConverter.convertToDouble(numberTwo))/2;
    }


    public  Double squ(String numberOne){
        return (Double) Math.sqrt(NumberConverter.convertToDouble(numberOne));
    }

}
