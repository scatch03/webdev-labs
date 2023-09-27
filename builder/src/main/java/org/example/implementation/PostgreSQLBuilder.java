package org.example.implementation;

import org.example.api.QueryBuilder;
import org.example.implementation.query.Condition;
import org.example.implementation.query.Limit;
import org.example.implementation.query.Projection;

/**
 * PostgreSQL builder implementation.
 */
public class PostgreSQLBuilder implements QueryBuilder {
    /**
     * Query SQL.
     */
    private StringBuilder query = new StringBuilder();

    /**
     * {@inheritDoc}
     */
    @Override
    public QueryBuilder reset() {
        query = new StringBuilder();
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QueryBuilder select(final Projection projection) {
        query.append(toPostgreSQL(projection));
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QueryBuilder where(final Condition condition) {
        query.append(toPostgreSQL(condition));
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QueryBuilder limit(final Limit limit) {
        query.append(toPostgreSQL(limit));
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getSQL() {
        return query.toString();
    }

    /**
     * Convert projection into a corresponding PostgreSQL clause.
     * <p/>
     *
     * @param projection {@link Projection} instance.
     * @return {@link java.lang.String} PostgreSQL select clause.
     */
    private String toPostgreSQL(final Projection projection) {
        return "";
    }

    /**
     * Convert filter into a corresponding PostgreSQL clause.
     * <p/>
     *
     * @param condition {@link org.example.implementation.query.Condition} instance.
     * @return {@link java.lang.String} PostgreSQL where clause.
     */
    private String toPostgreSQL(final Condition condition) {
        return "";
    }

    /**
     * Convert limit into a corresponding PostgreSQL clause.
     * <p/>
     *
     * @param limit {@link org.example.implementation.query.Limit} instance.
     * @return {@link java.lang.String} PostgreSQL limit clause.
     */
    private String toPostgreSQL(final Limit limit) {
        return "";
    }
}
