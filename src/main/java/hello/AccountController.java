package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AccountController {
    private final Account lukeAccount = new Account("Luke",10);
    
    @RequestMapping("/account", method = RequestMethod.GET)
    public Account account() {
        return lukeAccount;
    }

    @RequestMapping("/deposit", method = RequestMethod.POST)
    public Account deposit(@RequestParam(value="amount",defaultValue="0") long amount ){
        lukeAccount.deposite(amount);
        return lukeAccount;
    }

    @RequestMapping("/withdraw", method = RequestMethod.POST)
    public Account withdraw(@RequestParam(value="amount",defaultValue="0") long amount ){
        lukeAccount.withdraw(amount);
        return lukeAccount;
    }
}
