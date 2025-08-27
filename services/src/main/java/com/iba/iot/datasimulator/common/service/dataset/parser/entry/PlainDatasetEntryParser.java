package com.iba.iot.datasimulator.common.service.dataset.parser.entry;

import com.iba.iot.datasimulator.common.model.schema.SchemaRootMetadataType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Dataset entry parser for raw datasets.
 */
@Component
public class PlainDatasetEntryParser implements DatasetEntryTypedParser {

    /** **/
    private static final Logger logger = LoggerFactory.getLogger(PlainDatasetEntryParser.class);

    @Override
    public String getValue(String datasetEntry, String position) {
        logger.debug(">>> Dataset entry parser: dataset entry: {}, position: {}, value: {}", datasetEntry, position, datasetEntry);
        return datasetEntry;
    }

    @Override
    public SchemaRootMetadataType getType() {
        return SchemaRootMetadataType.RAW;
    }
}
