/*
 * Copyright (C) Yutaka Matsuno 2010-2012 All rights reserved.
 */
package AGSN.diagram.common.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import AGSN.diagram.common.exception.DcaseSystemException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

/**
 * A utility class that provides the method to handle files.
 */
public final class FileUtil {
	
	/**
	 * the separator string of modules and nodes.
	 */
	private static final String MODULE_SEPARATOR_NAME = "/"; //$NON-NLS-1$

    /**
     * A constructor.
     */
    private FileUtil() {
    }

    /**
     * Returns the file extension.
     * 
     * @param path the path.
     * @return the file extension.
     */
    public static String getFileExtension(String path) {
        if (path == null) {
            return null;
        }
        int pos = path.lastIndexOf("."); //$NON-NLS-1$
        if (pos == -1) {
            return null;
        }
        return path.substring(pos + 1);
    }

    /**
     * Returns the file path without the extension.
     * 
     * @param path the path.
     * @return the file path without the extension.
     */
    public static String getFileBasePath(String path) {
        if (path == null) {
            return null;
        }
        int pos = path.lastIndexOf("."); //$NON-NLS-1$
        if (pos == -1) {
            return null;
        }
        return path.substring(0, pos);
    }

    /**
     * Returns the IFile object that represents the specified path form the workspace.
     * 
     * @param path the path.
     * @return the IFile object.
     */
    public static IFile getWorkspaceFileFromPath(String path) {
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        if (root == null) {
            return null;
        }
        
        IFile iFile = null;
        try {
            iFile = root.getFile(new Path(path));
        } catch (IllegalArgumentException e) {
            return null;
        }
        return iFile;
    }
    
    /**
     * Returns the IFile object that represents the specified path form the workspace.
     * 
     * @param path the path.
     * @return the IFile object.
     */
    public static IFolder getWorkspaceFolderFromPath(String path) {
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        if (root == null) {
            return null;
        }
        
        IFolder iFolder = null;
        try {
        	iFolder = root.getFolder(new Path(path));
        } catch (IllegalArgumentException e) {
            return null;
        }
        return iFolder;
    }

    /**
     * Tests whether the file that represents the specified path exists. 
     * 
     * @param path the path.
     * @return true if and only if file that represents the specified path exists; false otherwise.
     */
    public static boolean isFileExistInWorkspace(String path) {
        if (path == null) {
            return false;
        }
        IFile iFile = getWorkspaceFileFromPath(path);
        if (iFile == null) {
            return false;
        }

        return iFile.exists();
    }

    /**
     * Renames the file.Actually,copies to the new file and deletes the original file.
     * 
     * @param file the file to rename
     * @param newFilename the name of the new file.
     * @return the renamed file.
     */
    public static IFile renameFile(IFile file, String newFilename) {
        // gets the full path of the new file.
        IPath newPath = file.getFullPath().removeLastSegments(1).append(
                newFilename).addFileExtension(file.getFileExtension());
        
        // gets the new file.
        IFile newFileName = ResourcesPlugin.getWorkspace().getRoot().getFile(
                newPath);
        
        //doesn't copy if the file is already exists.
        if (newFileName.exists()) {
            return newFileName;
        }
        boolean result = false;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file.getLocation().toOSString());
            newFileName.create(fis, true, null);
            result = true;
        } catch (FileNotFoundException e) {
            throw new DcaseSystemException(Messages.FileUtil_0, e,
                    MessageTypeImpl.RENAME_FILE_FAILED);
        } catch (CoreException e) {
            throw new DcaseSystemException(Messages.FileUtil_0, e,
                    MessageTypeImpl.RENAME_FILE_FAILED);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new DcaseSystemException(Messages.FileUtil_0, e,
                            MessageTypeImpl.RENAME_FILE_FAILED);
                }
            }
        }

        if (result) {
            // deletes the original file.
            try {
                file.delete(true, null);
                return newFileName;
            } catch (CoreException e) {
                throw new DcaseSystemException(Messages.FileUtil_1, e,
                        MessageTypeImpl.RENAME_FILE_FAILED);
            }
        }
        return null;
    }

    /**
     * Copies the file.
     * 
     * @param src the source file.
     * @param destPath the destination file path.
     * @return the copied file.
     */
    public static IFile copyFileTo(IFile src, IPath destPath) {
        IFile result = null;

        IFile destFile = ResourcesPlugin.getWorkspace().getRoot().getFile(destPath);
        
        FileInputStream fis = null;
        try {
            // doesn't copy if the file is already exists.
            if (destFile.exists()) {
                // doesn't copy if the file equals to the source file.
                if (destFile.equals(src)) {
                    return destFile;
                } else {
                    destFile.delete(true, null);
                }
            }
            fis = new FileInputStream(src.getLocation().toOSString());
            destFile.create(fis, true, null);
            result = destFile;
        } catch (FileNotFoundException e) {
            throw new DcaseSystemException(Messages.FileUtil_2, e,
                    MessageTypeImpl.COPY_FILE_FAILED);
        } catch (CoreException e) {
            throw new DcaseSystemException(Messages.FileUtil_2, e,
                    MessageTypeImpl.COPY_FILE_FAILED);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new DcaseSystemException(Messages.FileUtil_2, e,
                            MessageTypeImpl.COPY_FILE_FAILED);
                }
            }
        }
        return result;
    }
    
}
