package com.amdam_000.listsamplewithviewpager;

/**
 * Created by amdam_000 on 1/23/2016.
 */
public class OnScrollChangedEvent {
    int topPosition, offset;

    public OnScrollChangedEvent(int topPosition, int offset) {
        this.topPosition = topPosition;
        this.offset = offset;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getTopPosition() {
        return topPosition;
    }

    public void setTopPosition(int topPosition) {
        this.topPosition = topPosition;
    }
}
