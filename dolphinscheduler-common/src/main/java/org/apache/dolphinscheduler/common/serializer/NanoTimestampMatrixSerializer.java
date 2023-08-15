package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicNanoTimestampMatrix;

import java.io.IOException;

public class NanoTimestampMatrixSerializer extends JsonSerializer<BasicNanoTimestampMatrix> {
    @Override
    public void serialize(BasicNanoTimestampMatrix value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
