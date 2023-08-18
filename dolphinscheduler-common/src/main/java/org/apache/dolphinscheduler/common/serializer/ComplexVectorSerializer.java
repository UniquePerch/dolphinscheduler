package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicComplexVector;

import java.io.IOException;

public class ComplexVectorSerializer extends JsonSerializer<BasicComplexVector> {
    @Override
    public void serialize(BasicComplexVector value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
