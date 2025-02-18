package com.g191919.inferenceleaker;

import java.nio.file.Path;

public record ProcessSetting(Path outputPath, String sourceCode) {
}
