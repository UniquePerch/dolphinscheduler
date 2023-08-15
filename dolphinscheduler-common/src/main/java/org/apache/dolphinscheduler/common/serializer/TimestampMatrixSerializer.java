package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicTimestampMatrix;

import java.io.IOException;

public class TimestampMatrixSerializer extends JsonSerializer<BasicTimestampMatrix> {
    @Override
    public void serialize(BasicTimestampMatrix value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
