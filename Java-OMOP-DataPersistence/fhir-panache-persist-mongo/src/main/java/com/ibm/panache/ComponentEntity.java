package com.ibm.panache;

import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity
public class ComponentEntity extends PanacheMongoEntityBase {
    public CodeEntity code;
    public ValueQuantityEntity valueQuantity;
}
