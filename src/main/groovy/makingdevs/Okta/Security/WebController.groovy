package makingdevs.Okta.Security

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.user.OAuth2User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping("/")
    public String home(@AuthenticationPrincipal OAuth2User user) {
        return "Welcome, " + user.getFullName() + "!";
    }
}