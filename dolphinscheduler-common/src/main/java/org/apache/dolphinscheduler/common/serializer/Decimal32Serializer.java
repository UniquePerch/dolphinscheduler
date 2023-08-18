package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicDecimal32;

import java.io.IOException;

public class Decimal32Serializer extends JsonSerializer<BasicDecimal32> {
    @Override
    public void serialize(BasicDecimal32 value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getJsonString());
    }
}
