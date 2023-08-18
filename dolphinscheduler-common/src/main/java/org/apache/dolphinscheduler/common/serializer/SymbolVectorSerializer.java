package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicSymbolVector;
import com.xxdb.data.BasicSystemEntity;

import java.io.IOException;

public class SymbolVectorSerializer extends JsonSerializer<BasicSymbolVector> {
    @Override
    public void serialize(BasicSymbolVector value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
