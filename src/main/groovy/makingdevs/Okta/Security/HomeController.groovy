package makingdevs.Okta.Security

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.oidc.user.OidcUser
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.stereotype.Controller


@Controller
class HomeController {

    @GetMapping("/")
    public String index(AuthenticationPrincipal principal) {
        return "index"
    }
}