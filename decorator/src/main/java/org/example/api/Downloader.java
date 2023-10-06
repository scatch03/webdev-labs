package org.example.api;

import java.io.File;
import java.net.URL;

/**
 * Downloader interface.
 */
public interface Downloader {
    /**
     * Download file.
     * <p/>
     *
     * @param fileUrl
     *          {@link java.net.URL} file URL.
     * @return  {@link java.io.File} instance.
     */
    File download(URL fileUrl);
}
