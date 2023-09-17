package org.example.implementation;

import org.example.api.FileSystem;
import org.example.api.FileSystemType;
import org.example.implementation.filesystem.LocalFileSystem;
import org.example.implementation.filesystem.S3FileSystem;

/**
 * File manager.
 * Implemented as a singleton pattern.
 * Thread-safe.
 */
public final class FileManager {
    /**
     * Instance holder.
     */
    private volatile static FileManager instance;

    /**
     * No-instantiate constructor.
     */
    private FileManager() {
        throw new IllegalAccessError("Should not be called!");
    }

    /**
     * Get file manager instance.
     * Uses double-checked locking to ensure thread-safety.
     * <p/>
     *
     * @return {@link org.example.implementation.FileManager} instance.
     */
    public static FileManager getInstance() {
        if (instance == null) {
            synchronized (FileManager.class) {
                if (instance == null) {
                    instance = new FileManager();
                }
            }
        }

        return instance;
    }

    /**
     * Get file system to work with.
     * <p/>
     *
     * @param fsType {@link org.example.api.FileSystemType} instance.
     * @return {@link org.example.api.FileSystem} instance.
     */
    public FileSystem getFileSystem(final FileSystemType fsType) {
        switch (fsType) {
            case LOCAL:
                return new LocalFileSystem();
            case AWS:
                return new S3FileSystem();
            default:
                throw new RuntimeException("File system is not supported: " + fsType);
        }
    }
}
