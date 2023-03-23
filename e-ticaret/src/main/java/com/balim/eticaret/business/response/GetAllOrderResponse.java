package com.balim.eticaret.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllOrderResponse {
   private Long orderNumber;
   private int piece;
   private int shippingCost;
}
