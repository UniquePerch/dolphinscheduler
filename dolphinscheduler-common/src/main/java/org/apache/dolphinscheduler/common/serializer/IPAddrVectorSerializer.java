package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicIPAddrVector;

import java.io.IOException;

public class IPAddrVectorSerializer extends JsonSerializer<BasicIPAddrVector> {
    @Override
    public void serialize(BasicIPAddrVector value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
