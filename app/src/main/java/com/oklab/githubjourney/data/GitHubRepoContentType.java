package com.oklab.githubjourney.data;

/**
 * Created by olgakuklina on 2017-04-19.
 */

public enum GitHubRepoContentType {
    SUBMODULE("submodule", 0),
    DIR("dir", 1),
    FILE("file", 2),
    SYMLINK("symlink", 3);


    private final String matchingRepoContentType;
    private final int priority;

    GitHubRepoContentType(String matchingRepoContentType, int priority) {
        this.matchingRepoContentType = matchingRepoContentType;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public static GitHubRepoContentType getRepoContentType(String repoContentType) {
        for (GitHubRepoContentType type : values()) {
            if (type.matchingRepoContentType.equals(repoContentType)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown repo content type: " + repoContentType);
    }
}
