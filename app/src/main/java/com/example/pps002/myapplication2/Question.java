package com.example.pps002.myapplication2;

/**
 * Created by pps002 on 17/08/2017.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }
    public int getTextResId() {

        return mTextResId;
    }
    public void setTextResId(int textResId) {

        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
