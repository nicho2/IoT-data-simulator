package com.iba.iot.datasimulator.session.service.active.processing.generator.schema.databind;

import com.iba.iot.datasimulator.common.model.schema.SchemaRootMetadataType;
import com.iba.iot.datasimulator.common.model.schema.SchemaType;
import com.iba.iot.datasimulator.common.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Objects;

/**
 * Serializer for raw dataset entries.
 */
@Component
public class PlainDatasetEntrySerializer implements DatasetEntrySerializer {

    /** **/
    private static final Logger logger = LoggerFactory.getLogger(PlainDatasetEntrySerializer.class);

    @Override
    public String serialize(Map<String, Object> processingResults, SchemaType schemaType) {

        Object value = processingResults.values().stream().findFirst().orElse(null);
        String result = Objects.nonNull(value) ? value.toString() : StringUtil.EMPTY_STRING;
        logger.debug(">>> Plain data serialization result: {}", result);
        return result;
    }

    @Override
    public SchemaRootMetadataType getType() {
        return SchemaRootMetadataType.RAW;
    }
}
