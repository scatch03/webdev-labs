package org.example.implementation;

import org.example.api.QueryBuilder;
import org.example.implementation.query.Condition;
import org.example.implementation.query.Limit;
import org.example.implementation.query.Projection;

/**
 * Director for building SQL queries.
 */
public class QueryDirector {
    /**
     * Get SQL query.
     * <p/>
     *
     * @param queryBuilder {@link QueryBuilder} instance.
     * @return {@link String} SQL query.
     */
    public String getSql(final QueryBuilder queryBuilder) {
        return queryBuilder
                .reset()
                .select(new Projection())
                .where(new Condition())
                .limit(new Limit())
                .getSQL();
    }
}
