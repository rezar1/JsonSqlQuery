package com.extensions.logmonitor.util;

import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.security.CodeSource;
import java.security.ProtectionDomain;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2017年12月27日
 * @Desc this guy is to lazy , noting left.
 *
 */
@Slf4j
public class PathResolver {

	@SuppressWarnings("rawtypes")
	public static File resolveDirectory(Class clazz) {
		File installDir = null;
		try {
			ProtectionDomain pd = clazz.getProtectionDomain();
			if (pd != null) {
				CodeSource cs = pd.getCodeSource();
				if (cs != null) {
					URL url = cs.getLocation();
					if (url != null) {
						String path = URLDecoder.decode(url.getFile(), "UTF-8");
						File dir = new File(path).getParentFile();
						if (dir.exists()) {
							installDir = dir;
						} else {
							log.error(
									"Install dir resolved to " + dir.getAbsolutePath() + ", however it doesnt exist.");
						}
					}
				} else {
					log.warn("Cannot resolve path for the class {} since CodeSource is null", clazz.getName());
				}

			}
		} catch (Exception e) {
			log.error("Error while resolving the Install Dir", e);
		}
		if (installDir != null) {
			log.info("Install dir resolved to " + installDir.getAbsolutePath());
			return installDir;
		} else {
			File workDir = new File("");
			log.info("Failed to resolve install dir, returning current work dir" + workDir.getAbsolutePath());
			return workDir;
		}
	}

	public static File getFile(String path, Class<?> clazz) {
		if (path == null) {
			return null;
		}

		File file = new File(path);
		if (file.exists()) {
			return new File(path);
		}

		File installDir = resolveDirectory(clazz);
		if (installDir != null) {
			log.debug("The install directory is resolved to {}", installDir.getAbsolutePath());
			file = new File(installDir, path);
			if (file.exists()) {
				return file;
			}
		}
		return null;
	}

}
