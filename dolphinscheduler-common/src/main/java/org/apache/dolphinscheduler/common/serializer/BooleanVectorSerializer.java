package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicBooleanVector;

import java.io.IOException;

public class BooleanVectorSerializer extends JsonSerializer<BasicBooleanVector> {
    @Override
    public void serialize(BasicBooleanVector value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
