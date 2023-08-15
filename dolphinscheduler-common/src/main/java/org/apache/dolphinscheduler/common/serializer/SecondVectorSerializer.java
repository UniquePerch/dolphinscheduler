package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicSecondVector;
import com.xxdb.data.BasicSet;

import java.io.IOException;

public class SecondVectorSerializer extends JsonSerializer<BasicSecondVector> {
    @Override
    public void serialize(BasicSecondVector value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
