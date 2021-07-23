package com.liwei.controller;

import com.liwei.entity.Fine;
import com.liwei.service.FineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Liver
 * @Description
 * @date 2021/6/30 11:50
 */
@Controller
@RequestMapping(value = "/fine")
public class FineController {
    @Autowired
    private FineService fineService;
    /**
     * 分页查询
     * @param page 当前页
     * @param limit 条数
     * @return
     */
    @GetMapping("/getPageFine")
    @ResponseBody
    public Map<String, Object> getPageFine(@RequestParam int page, @RequestParam int limit) {
        List<Fine> allFine = fineService.listAll();
        int count = allFine.size();
        int fromIndex = (page - 1) * limit;
        int toIndex = page * limit;
        if (toIndex > count) {
            toIndex = count;
        }
        List<Fine> pageFine = allFine.subList(fromIndex, toIndex);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "成功");
        map.put("count", count);
        map.put("data", pageFine);
        return map;
    }
}
