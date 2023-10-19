package com.oreilly.pos.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class JSONUtilsTest {

  @Test
    void given_invoice_data_with_tender_type_cash_extract_cash() {
      String json = "{\"time\": \"19:53\",\"tenderDetails\": {\"amount\": 23.43,\"type\": \"cash\"},\"storeNumber\": \"999\"}";
      assertThat(JSONUtils.extractTenderType(json)).isEqualTo("cash");
  }

}