package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicTimestampVector;

import java.io.IOException;

public class TimestampVectorSerializer extends JsonSerializer<BasicTimestampVector> {
    @Override
    public void serialize(BasicTimestampVector value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
