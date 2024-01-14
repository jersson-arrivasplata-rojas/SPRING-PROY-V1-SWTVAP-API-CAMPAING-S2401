package com.jersson.arrivasplata.swtvap.api.campaing.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MarketingCampaignResponse {

    private Long marketingCampaignId;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;
}