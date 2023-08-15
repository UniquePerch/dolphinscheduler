package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicFloatMatrix;

import java.io.IOException;

public class FloatMatrixSerializer extends JsonSerializer<BasicFloatMatrix> {
    @Override
    public void serialize(BasicFloatMatrix value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
