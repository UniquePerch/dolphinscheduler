package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicComplexMatrix;

import java.io.IOException;

public class ComplexMatrixSerializer extends JsonSerializer<BasicComplexMatrix> {
    @Override
    public void serialize(BasicComplexMatrix value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
