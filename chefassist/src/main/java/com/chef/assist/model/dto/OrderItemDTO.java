package com.chef.assist.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class OrderItemDTO {
    private Long id;

    @JsonProperty("table_number")
    private String tableNumber;

    @JsonProperty("table_id")
    private String tableId;

    @JsonProperty("dish_name")
    private String dishName;

    private String status;

    private String description;

    @JsonProperty("dish_count")
    private Integer dishCount;

    @JsonProperty("producer_number")
    private String producerNumber;

    @JsonProperty("last_update_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date lastUpdateTime;

    private Double price;
}
