package org.example.api;

import java.io.File;

/**
 * General file system API.
 */
public interface FileSystem {

    /**
     * Put file into file system.
     * <p/>
     *
     * @param file {@link java.io.File} instance.
     * @return {@link java.lang.String} universal resource identifier.
     */
    String put(File file);

    /**
     * Get file from file system.
     * <p/>
     *
     * @param uri {@link java.lang.String} universal resource identifier.
     * @return {@link java.io.File} instance.
     */
    File get(String uri);

    /**
     * Delete file from file system.
     * <p/>
     *
     * @param uri {@link java.lang.String} universal resource identifier.
     */
    void delete(String uri);
}
