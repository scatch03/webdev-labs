package org.example.implementation;

import org.example.api.Downloader;

import java.io.File;
import java.net.URL;

/**
 * Simple downloader.
 */
public class SimpleDownloader implements Downloader {
    /**
     * {@inheritDoc}
     */
    @Override
    public File download(final URL fileUrl) {
        // save file locally
        return new File(fileUrl.getFile());
    }
}
