package org.example;

import org.example.api.Downloader;
import org.example.implementation.CachingDownloader;
import org.example.implementation.SimpleDownloader;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        final Downloader fileDownloader = new CachingDownloader(new SimpleDownloader());
        fileDownloader.download(new URL("http://filmix.com/1"));
    }
}
