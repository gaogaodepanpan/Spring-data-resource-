package com.code515.report.report_demo.Entity;


import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Entity
@Data
public class Student {

  @Id
  @Min(20190000)
  @Max(20199999)
  private Integer stuId;
  private String stuName;
  private Integer stuMajor;
  private Integer stuClass;
  @Pattern(regexp = "^1[3-9]\\d{9}$")
  private String stuPhone;
  @Length(min=5,max=11,message = "QQ号长度错误，应为5到11位")
  private String stuQq;
  private String stuStatus;
  private Integer orgId;
}
