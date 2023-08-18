package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicMinuteMatrix;

import java.io.IOException;

public class MinuteMatrixSerializer extends JsonSerializer<BasicMinuteMatrix> {
    @Override
    public void serialize(BasicMinuteMatrix value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
