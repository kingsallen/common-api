package com.moseeker.vo.company.request;

import lombok.Data;

import java.util.List;

@Data
public class CompanyFeatureRequestVO {

    private List<String> featureList;

    private int companyId;
}
