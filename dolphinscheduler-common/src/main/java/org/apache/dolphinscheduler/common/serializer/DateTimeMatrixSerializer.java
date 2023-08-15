package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicDateTimeMatrix;

import java.io.IOException;

public class DateTimeMatrixSerializer extends JsonSerializer<BasicDateTimeMatrix> {
    @Override
    public void serialize(BasicDateTimeMatrix value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
