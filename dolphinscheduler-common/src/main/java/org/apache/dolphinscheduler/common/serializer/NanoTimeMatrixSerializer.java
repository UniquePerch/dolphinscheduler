package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicNanoTimeMatrix;

import java.io.IOException;

public class NanoTimeMatrixSerializer extends JsonSerializer<BasicNanoTimeMatrix> {
    @Override
    public void serialize(BasicNanoTimeMatrix value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
