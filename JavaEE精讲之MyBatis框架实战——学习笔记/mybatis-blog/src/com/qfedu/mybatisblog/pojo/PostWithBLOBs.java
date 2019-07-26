package com.qfedu.mybatisblog.pojo;

import java.io.Serializable;

public class PostWithBLOBs extends Post implements Serializable {
    private String draft;

    private String body;

    private static final long serialVersionUID = 1L;

    public String getDraft() {
        return draft;
    }

    public void setDraft(String draft) {
        this.draft = draft == null ? null : draft.trim();
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }
}