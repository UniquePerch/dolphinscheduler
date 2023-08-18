package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicDateTimeVector;

import java.io.IOException;

public class DateTimeVectorSerializer extends JsonSerializer<BasicDateTimeVector> {
    @Override
    public void serialize(BasicDateTimeVector value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
