package org.example.api;

import java.util.Map;

/**
 * Entity service interface.
 * <p/>
 *
 * @param <T> type parameter.
 */
public interface EntityService<T> {

    /**
     * Processing template method.
     * <p/>
     *
     * @param entityId {@link java.lang.String} entity id.
     * @param update   {@link Map} entity update.
     * @return {@link Map} processing response.
     */
    Map<String, Object> process(String entityId, Map<String, Object> update);
}
