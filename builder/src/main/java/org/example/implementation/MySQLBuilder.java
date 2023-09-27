package org.example.implementation;

import org.example.api.QueryBuilder;
import org.example.implementation.query.Condition;
import org.example.implementation.query.Limit;
import org.example.implementation.query.Projection;

/**
 * MySQL builder implementation.
 */
public class MySQLBuilder implements QueryBuilder {
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
        query.append(toMySQL(projection));
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QueryBuilder where(final Condition condition) {
        query.append(toMySQL(condition));
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QueryBuilder limit(final Limit limit) {
        query.append(toMySQL(limit));
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
     * Convert projection into a corresponding MySQL clause.
     * <p/>
     *
     * @param projection {@link org.example.implementation.query.Projection} instance.
     * @return {@link String} MySQL select clause.
     */
    private String toMySQL(final Projection projection) {
        return "";
    }

    /**
     * Convert filter into a corresponding MySQL clause.
     * <p/>
     *
     * @param condition {@link org.example.implementation.query.Condition} instance.
     * @return {@link String} PostgreSQL where clause.
     */
    private String toMySQL(final Condition condition) {
        return "";
    }

    /**
     * Convert limit into a corresponding MySQL clause.
     * <p/>
     *
     * @param limit {@link org.example.implementation.query.Limit} instance.
     * @return {@link String} MySQL limit clause.
     */
    private String toMySQL(final Limit limit) {
        return "";
    }
}
