package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicNanoTimestamp;

import java.io.IOException;

public class NanoTimestampSerializer extends JsonSerializer<BasicNanoTimestamp> {
    @Override
    public void serialize(BasicNanoTimestamp value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
