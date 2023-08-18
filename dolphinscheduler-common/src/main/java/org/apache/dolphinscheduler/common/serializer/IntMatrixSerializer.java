package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicIntMatrix;

import java.io.IOException;

public class IntMatrixSerializer extends JsonSerializer<BasicIntMatrix> {
    @Override
    public void serialize(BasicIntMatrix value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
