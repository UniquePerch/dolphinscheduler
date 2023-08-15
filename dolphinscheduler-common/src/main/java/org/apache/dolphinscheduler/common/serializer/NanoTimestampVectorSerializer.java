package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicNanoTimestampVector;

import java.io.IOException;

public class NanoTimestampVectorSerializer extends JsonSerializer<BasicNanoTimestampVector> {
    @Override
    public void serialize(BasicNanoTimestampVector value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
