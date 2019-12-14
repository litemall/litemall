package com.doopai.litemall.apollo.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.doopai.litemall.core.util.ResponseUtil;
import com.doopai.litemall.database.domain.LitemallUser;
import com.doopai.litemall.database.domain.LitemallUserFormid;
import com.doopai.litemall.database.service.LitemallUserFormIdService;
import com.doopai.litemall.database.service.LitemallUserService;
import com.doopai.litemall.apollo.annotation.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/apollo/formid")
@Validated
public class UserFormId {
    private final Log logger = LogFactory.getLog(UserFormId.class);

    @Autowired
    private LitemallUserService userService;

    @Autowired
    private LitemallUserFormIdService formIdService;

    @GetMapping("create")
    public Object create(@LoginUser Integer userId, @NotNull String formId) {
        if (userId == null) {
            return ResponseUtil.unlogin();
        }

        LitemallUser user = userService.findById(userId);
        LitemallUserFormid userFormid = new LitemallUserFormid();
        userFormid.setOpenid(user.getWeixinOpenid());
        userFormid.setFormid(formId);
        userFormid.setIsprepay(false);
        userFormid.setUseamount(1);
        userFormid.setExpireTime(LocalDateTime.now().plusDays(7));
        formIdService.addUserFormid(userFormid);

        return ResponseUtil.ok();
    }
}
