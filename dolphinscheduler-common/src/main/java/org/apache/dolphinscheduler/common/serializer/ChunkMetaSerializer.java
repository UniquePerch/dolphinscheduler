package org.apache.dolphinscheduler.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.xxdb.data.BasicChunkMeta;

import java.io.IOException;

public class ChunkMetaSerializer extends JsonSerializer<BasicChunkMeta> {
    @Override
    public void serialize(BasicChunkMeta value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObjectField("value",value.getString());
    }
}
