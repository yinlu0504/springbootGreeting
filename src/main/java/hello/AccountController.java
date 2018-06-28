package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.HttpStatus;

@RestController

public class AccountController {
    private final Account lukeAccount = new Account("Luke",10);
    
    @RequestMapping(value = "/account")
    @ResponseBody
    public Account account() {
        return lukeAccount;
    }

    @RequestMapping(value = "/deposit")
    public Account deposit(@RequestParam(value="amount",defaultValue="0") long amount ){
        lukeAccount.deposite(amount);
        return lukeAccount;
    }

    @RequestMapping(value = "/withdraw")
    @ResponseStatus(HttpStatus.OK)
    public Account withdraw(@RequestParam(value="amount",defaultValue="0") long amount ){
        lukeAccount.withdraw(amount);
        return lukeAccount;
    }
}
