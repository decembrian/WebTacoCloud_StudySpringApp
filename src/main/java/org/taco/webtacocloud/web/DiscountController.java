package org.taco.webtacocloud.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.taco.webtacocloud.DiscountCodeProps;

import java.util.Map;

@Controller
@RequestMapping("/discounts")
public class DiscountController {
    private DiscountCodeProps discountCodeProps;

    public DiscountController(DiscountCodeProps discountCodeProps){
        this.discountCodeProps = discountCodeProps;
    }

    @GetMapping
    public String displayDiscontCodes(Model model){
        Map<String, Integer> codes = discountCodeProps.getCodes();
        model.addAttribute("codes", codes);

        return "discountList";
    }
}
