package shop;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.DefaultDataTableCellTransformer;
import io.cucumber.java.DefaultDataTableEntryTransformer;
import io.cucumber.java.DefaultParameterTransformer;

import java.lang.reflect.Type;

//public class StepDefinitions {
//
//    private final ObjectMapper objectMapper = new ObjectMapper();
//
//    @DefaultParameterTransformer
//    @DefaultDataTableEntryTransformer
//    @DefaultDataTableCellTransformer
//
//    public Object transformer(Object fromValue, Type toValueType) {
//        if (toValueType == String.class) {
//            return fromValue.toString(); // Konwertuj niestringowy parametr na ciąg znaków
//        }
//        return objectMapper.convertValue(fromValue, objectMapper.constructType(toValueType));
//    }
//}
public class StepDefinitions {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @DefaultParameterTransformer
    @DefaultDataTableEntryTransformer
    @DefaultDataTableCellTransformer

    public Object transformer(Object fromValue, Type toValueType) {
        if (toValueType == String.class) {
            return fromValue.toString(); // Konwertuj niestringowy parametr na ciąg znaków
        }
        return objectMapper.convertValue(fromValue, objectMapper.constructType(toValueType));
    }
}



