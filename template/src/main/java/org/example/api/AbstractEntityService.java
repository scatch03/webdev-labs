package org.example.api;

import java.util.Map;

/**
 * Abstract entity processing service.
 * <p/>
 *
 * @param <T> type param
 */
public abstract class AbstractEntityService<T> implements EntityService<T> {

    /**
     * {@inheritDoc}
     */
    @Override
    public final Map<String, Object> process(final String entityId, final Map<String, Object> update) {
        final T entity = getEntity(entityId);
        final boolean isValid = validateEntityUpdate(entity, update);
        onValidationHook(entity, update, isValid);
        saveEntity(entity, update);
        return prepareResponse(entity);
    }

    /**
     * Prepare processing response.
     * <p/>
     *
     * @param entity processed entity.
     * @return {@link java.util.Map} response data.
     */
    protected abstract Map<String, Object> prepareResponse(final T entity);

    /**
     * Save updated entity.
     * <p/>
     *
     * @param entity processed entity.
     * @param update {@link Map} entity update.
     */
    protected abstract void saveEntity(final T entity, final Map<String, Object> update);

    /**
     * Validate entity update.
     * <p/>
     *
     * @param entity processed entity.
     * @param update {@link Map} entity update.
     * @return {@code true} if update is valid, {@code false} otherwise.
     */
    protected abstract boolean validateEntityUpdate(final T entity, final Map<String, Object> update);

    /**
     * Get entity by id.
     * <p/>
     *
     * @param entityId {@link java.lang.String} entity id.
     */
    protected abstract T getEntity(String entityId);

    /**
     * Validation results hook.
     * <p/>
     *
     * @param entity  processed entity.
     * @param update  {@link Map} entity update.
     * @param isValid {@code true} if update is valid, {@code false} otherwise.
     */
    public void onValidationHook(final T entity, final Map<String, Object> update, final boolean isValid) {
        // do nothing by default
    }
}
