package test.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.Realm;

public class MyRealm1 implements Realm {

    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("myRealm1");
        String user = (String) token.getPrincipal();
        String password = new String((char[]) token.getCredentials());

        if (!user.equals("zhang")) {
            throw new UnknownAccountException();
        }
        if (!password.equals("123")) {
            throw new IncorrectCredentialsException();
        }
        return new SimpleAuthenticationInfo(user, password, getName());
    }

    @Override
    public String getName() {

        return "MyReal";
    }

    // Ö»Ö§³ÖUsernamePasswordToken
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof UsernamePasswordToken;
    }

}
