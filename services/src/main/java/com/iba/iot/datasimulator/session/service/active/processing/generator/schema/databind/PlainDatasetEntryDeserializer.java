package com.iba.iot.datasimulator.session.service.active.processing.generator.schema.databind;

import com.iba.iot.datasimulator.common.model.schema.SchemaRootMetadataType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Deserializer for raw dataset entries.
 */
@Component
public class PlainDatasetEntryDeserializer implements DatasetEntryDeserializer {

    /** **/
    private static final Logger logger = LoggerFactory.getLogger(PlainDatasetEntryDeserializer.class);

    @Override
    public Map<String, String> deserialize(String datasetEntry, boolean isDatasetProvided) {

        logger.debug(">>> Unfolding raw dataset for entry {} and dataset provided {}", datasetEntry, isDatasetProvided);
        Map<String, String> result = new HashMap<>();

        if (isDatasetProvided) {
            result.put("1", datasetEntry);
        }

        return result;
    }

    @Override
    public SchemaRootMetadataType getType() {
        return SchemaRootMetadataType.RAW;
    }
}
