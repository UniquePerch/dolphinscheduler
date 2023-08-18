package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicSecond;

import java.io.IOException;

public class SecondSerializer extends JsonSerializer<BasicSecond> {
    @Override
    public void serialize(BasicSecond value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
