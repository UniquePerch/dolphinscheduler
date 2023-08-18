package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicDateHourMatrix;

import java.io.IOException;

public class DateHourMatrixSerializer extends JsonSerializer<BasicDateHourMatrix> {
    @Override
    public void serialize(BasicDateHourMatrix value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
