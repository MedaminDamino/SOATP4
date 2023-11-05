package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(name = "calculews")

public class CalculatriceWS {

    @WebMethod(operationName = "Somme")
    public double somme(@WebParam(name = "val1") double a, @WebParam(name = "val2") double b)
    {
        return a+b;
    }

}
