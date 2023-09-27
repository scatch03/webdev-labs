package org.example.api;

import org.example.implementation.query.Condition;
import org.example.implementation.query.Limit;
import org.example.implementation.query.Projection;

/**
 * General query building steps.
 */
public interface QueryBuilder {
    /**
     * Reset current query.
     * <p/>
     *
     * @return {@link QueryBuilder} instance.
     */
    QueryBuilder reset();

    /**
     * Set projection for current query.
     * <p/>
     *
     * @return {@link QueryBuilder} instance.
     */
    QueryBuilder select(Projection projection);

    /**
     * Set filter for current query.
     * <p/>
     *
     * @return {@link QueryBuilder} instance.
     */
    QueryBuilder where(Condition condition);

    /**
     * Set limit clause for current query.
     * <p/>
     *
     * @return {@link QueryBuilder} instance.
     */
    QueryBuilder limit(Limit limit);

    /**
     * Get current query.
     * <p/>
     *
     * @return {@link String} resulting query.
     */
    String getSQL();
}
