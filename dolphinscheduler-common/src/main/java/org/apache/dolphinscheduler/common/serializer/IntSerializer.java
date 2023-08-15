package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicInt;

import java.io.IOException;

public class IntSerializer extends JsonSerializer<BasicInt> {
    @Override
    public void serialize(BasicInt value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getJsonString());
    }
}
