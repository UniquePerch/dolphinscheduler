package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicDecimal128Vector;

import java.io.IOException;

public class Decimal128VectorSerializer extends JsonSerializer<BasicDecimal128Vector> {
    @Override
    public void serialize(BasicDecimal128Vector value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
