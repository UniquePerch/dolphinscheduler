package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicDecimal32Vector;

import java.io.IOException;

public class Decimal32VectorSerializer extends JsonSerializer<BasicDecimal32Vector> {
    @Override
    public void serialize(BasicDecimal32Vector value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
