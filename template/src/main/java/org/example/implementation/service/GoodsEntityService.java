package org.example.implementation.service;

import org.example.api.AbstractEntityService;
import org.example.implementation.Goods;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;

/**
 * Goods processing service.
 */
public class GoodsEntityService extends AbstractEntityService<Goods> {

    /**
     * {@inheritDoc}
     */
    @Override
    protected Map<String, Object> prepareResponse(final Goods entity) {
        return new HashMap() {{
            put("status", "ok");
            put("code", 200);
        }};
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void saveEntity(final Goods entity, final Map<String, Object> update) {
        // save updated goods
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean validateEntityUpdate(final Goods entity, final Map<String, Object> update) {
        // validate goods update
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Goods getEntity(final String entityId) {
        return new Goods();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onValidationHook(final Goods entity, final Map<String, Object> update, final boolean isValid) {
        if (!isValid) {
            notifyAdmin(format("Cannot update good [%s] with data [%s]", entity, update));
        }
    }

    /**
     * Notify system administrator.
     * <p/>
     *
     * @param messge {@link java.lang.String} message text.
     */
    private void notifyAdmin(final String messge) {
        // perform admin notification by a messenger
    }
}
