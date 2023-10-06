package org.example.implementation;

import org.example.api.Downloader;

import java.io.File;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * File downloader with caching.
 */
public class CachingDownloader implements Downloader {
    /**
     * {@link org.example.api.Downloader} instance.
     */
    private final Downloader downloader;
    /**
     * File cache.
     */
    private final Map<URL, File> cache = new ConcurrentHashMap<>();

    /**
     * Constructor.
     * <p/>
     *
     * @param downloader {@link org.example.api.Downloader} instance.
     */
    public CachingDownloader(final Downloader downloader) {
        this.downloader = downloader;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public File download(final URL fileUrl) {
        if (cache.containsKey(fileUrl)) {
            return cache.get(fileUrl);
        }
        final File file = downloader.download(fileUrl);
        cache.put(fileUrl, file);
        return file;
    }
}
