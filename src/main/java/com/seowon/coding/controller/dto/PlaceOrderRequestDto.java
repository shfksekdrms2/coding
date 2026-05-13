package com.seowon.coding.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PlaceOrderRequestDto {
    String customerName;
    String customerEmail;
    List<PlaceOrderProductDto> products;
}
