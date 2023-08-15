package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicFloat;

import java.io.IOException;

public class FloatSerializer extends JsonSerializer<BasicFloat> {
    @Override
    public void serialize(BasicFloat value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getJsonString());
    }
}
