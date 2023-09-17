package org.example.implementation.filesystem;

import org.example.api.FileSystem;

import java.io.File;

/**
 * Amazon S3 file system implementation.
 */
public class S3FileSystem implements FileSystem {

    /**
     * {@inheritDoc}
     */
    @Override
    public String put(final File file) {
        // save file on S3 service
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public File get(final String uri) {
        // get file from S3 service
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(final String uri) {
        // delete file from S3 service
    }
}
