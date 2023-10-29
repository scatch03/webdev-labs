package org.example.implementation.service;

import org.example.api.AbstractEntityService;
import org.example.implementation.Order;
import org.example.implementation.User;

import java.util.HashMap;
import java.util.Map;

import static sun.plugin2.util.PojoUtil.toJson;

/**
 * Order processing service.
 */
public class OrderEntityService extends AbstractEntityService<Order> {

    /**
     * {@inheritDoc}
     */
    @Override
    protected Map<String, Object> prepareResponse(final Order entity) {
        return new HashMap(){{
            put("status", "ok");
            put("code", 200);
            put("order", toJson(entity));
        }};
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void saveEntity(final Order entity, final Map<String, Object> update) {
        // save updated order
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean validateEntityUpdate(final Order entity, final Map<String, Object> update) {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Order getEntity(final String entityId) {
        return new Order();
    }
}
