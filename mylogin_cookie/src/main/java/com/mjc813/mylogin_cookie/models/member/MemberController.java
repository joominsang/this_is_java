package com.mjc813.mylogin_cookie.models.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	@GetMapping("/member")
	public String getHomePage() {
		return "member/index";
	}
}
