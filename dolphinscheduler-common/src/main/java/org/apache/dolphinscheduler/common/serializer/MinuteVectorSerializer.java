package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicMinute;
import com.xxdb.data.BasicMinuteVector;

import java.io.IOException;

public class MinuteVectorSerializer extends JsonSerializer<BasicMinuteVector> {
    @Override
    public void serialize(BasicMinuteVector value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
