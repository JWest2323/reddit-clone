package com.example.springredditclone.model;

public enum voteType {
    UPVOTE(1), DOWNVOTE(-1),
    ;

    private int direction;

    void VoteType(int direction) {
    }
}
    