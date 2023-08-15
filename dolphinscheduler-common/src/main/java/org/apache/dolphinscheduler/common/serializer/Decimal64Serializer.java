package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicDecimal64;

import java.io.IOException;

public class Decimal64Serializer extends JsonSerializer<BasicDecimal64> {
    @Override
    public void serialize(BasicDecimal64 value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getJsonString());
    }
}
