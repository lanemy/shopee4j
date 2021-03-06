package com.salesmore.yak.integration.shopee.model.item.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.salesmore.yak.integration.shopee.model.ObjectResult;
import lombok.Data;


@Data
public class VariationActionResultWrapper extends ObjectResult<VariationActionResult> {

    private static final long serialVersionUID = 1L;

    /**
     * Result
     */
    @JsonProperty("item")
    private VariationActionResult item;

    @Override
    protected VariationActionResult value() {
        return item;
    }
}
