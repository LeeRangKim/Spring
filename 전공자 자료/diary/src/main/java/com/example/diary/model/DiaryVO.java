package com.example.diary.model;

import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

@Setter
public class DiaryVO {
    private int dySeq;
    private Date dyDate;
    private String dyTitle;
    private String dyContents;
    private String fileName;
    private String filePath;
    private Date dyRegDate;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
