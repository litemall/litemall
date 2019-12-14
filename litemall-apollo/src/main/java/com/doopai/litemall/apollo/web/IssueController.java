package com.doopai.litemall.apollo.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.doopai.litemall.core.util.ResponseUtil;
import com.doopai.litemall.core.validator.Order;
import com.doopai.litemall.core.validator.Sort;
import com.doopai.litemall.database.domain.LitemallIssue;
import com.doopai.litemall.database.service.LitemallIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apollo/issue")
@Validated
public class IssueController {
    private final Log logger = LogFactory.getLog(IssueController.class);

    @Autowired
    private LitemallIssueService issueService;

    /**
     * 帮助中心
     */
    @RequestMapping("/list")
    public Object list(String question,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer size,
                       @Sort @RequestParam(defaultValue = "add_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {
        List<LitemallIssue> issueList = issueService.querySelective(question, page, size, sort, order);
        return ResponseUtil.okList(issueList);
    }

}
