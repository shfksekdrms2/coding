package com.seowon.coding.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PlaceOrderProductDto {
    List<Long> productIds;
    List<Integer> quantities;
}
