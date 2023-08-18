package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicNanoTimeVector;

import java.io.IOException;

public class NanoTimeVectorSerializer extends JsonSerializer<BasicNanoTimeVector> {
    @Override
    public void serialize(BasicNanoTimeVector value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
