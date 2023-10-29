package org.example.implementation.service;

import org.example.api.AbstractEntityService;
import org.example.implementation.Order;
import org.example.implementation.User;

import java.util.HashMap;
import java.util.Map;

/**
 * User processing service.
 */
public class UserEntityService extends AbstractEntityService<User> {

    /**
     * {@inheritDoc}
     */
    @Override
    protected Map<String, Object> prepareResponse(final User entity) {
        return new HashMap(){{
            put("status", "ok");
            put("code", 200);
        }};
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void saveEntity(final User entity, final Map<String, Object> update) {
        // save updated user
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean validateEntityUpdate(final User entity, final Map<String, Object> update) {
        if (update.containsKey("email")) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected User getEntity(final String entityId) {
        return new User();
    }
}
