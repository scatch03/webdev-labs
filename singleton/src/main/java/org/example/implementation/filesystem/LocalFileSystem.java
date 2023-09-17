package org.example.implementation.filesystem;

import org.example.api.FileSystem;

import java.io.File;

/**
 * Local file system implementation.
 */
public class LocalFileSystem implements FileSystem {

    /**
     * {@inheritDoc}
     */
    @Override
    public String put(final File file) {
        // save file locally
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public File get(final String uri) {
        // get file locally
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(final String uri) {
        // delete file locally
    }
}
