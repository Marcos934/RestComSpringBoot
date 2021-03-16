package br.com.erudio.math;

import br.com.erudio.converter.NumberConverter;

public class SimpleMath {

    public static Double sum(String numberOne, String numberTwo){
      return  NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(numberTwo);
    }
    public static Double sub(String numberOne, String numberTwo){
        return  NumberConverter.convertToDouble(numberOne) - NumberConverter.convertToDouble(numberTwo);
    }

    public static Double mul(String numberOne, String numberTwo){
        return  NumberConverter.convertToDouble(numberOne) * NumberConverter.convertToDouble(numberTwo);
    }
    public static Double div(String numberOne, String numberTwo){
        return  NumberConverter.convertToDouble(numberOne) / NumberConverter.convertToDouble(numberTwo);
    }

    public static Double med(String numberOne, String numberTwo){
        return  (double) (NumberConverter.convertToDouble(numberOne) * NumberConverter.convertToDouble(numberTwo))/2;
    }


    public static Double squ(String numberOne){
        return (Double) Math.sqrt(NumberConverter.convertToDouble(numberOne));
    }

}
