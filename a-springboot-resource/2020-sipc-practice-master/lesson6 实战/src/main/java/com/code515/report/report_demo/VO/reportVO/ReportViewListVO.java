package com.code515.report.report_demo.VO.reportVO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ReportViewListVO {

    @JsonProperty("stdId")
    private Integer studentId;
    @JsonProperty("stdName")
    private String studentName;
    @JsonProperty("major")
    private String majorName;
    @JsonProperty("classNum")
    private Integer classNumber;
    @JsonProperty("stdQQ")
    private String studentQQ;
    @JsonProperty("stdPhone")
    private String studentPhone;
    @JsonProperty("firstWill")
    private ReportInfoVO firstWill;
    @JsonProperty("secondWill")
    private ReportInfoVO secondWill;
    @JsonProperty("isDispensing")
    private Integer isDispensing;
    @JsonProperty("isEnroll")
    private String isEnroll;
    @JsonProperty("update_time")
    private String updateTime;
    @JsonProperty("create_time")
    private String createTime;

}
