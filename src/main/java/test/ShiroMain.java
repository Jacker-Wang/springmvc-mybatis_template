package test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

public class ShiroMain {

    public static void main(String[] args) {
        // 1、获取 SecurityManager 工厂，此处使用 Ini 配置文件初始化 SecurityManager
        Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-roles.ini");
        // 2、得到 SecurityManager 实例 并绑定给 SecurityUtils
        org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        // 3、得到 Subject 及创建用户名/密码身份验证 Token（即用户身份/凭证）
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
        try {
            // 4、登录，即身份验证
            subject.login(token);
        } catch (AuthenticationException e) {
            // 5、身份验证失败
            System.out.println("身份验证失败");
            System.exit(0);
        }
        // 用户已经登录
        System.out.println("用户登录");
        System.out.print("当前登录用户：》》》");
        PrincipalCollection principalCollection = subject.getPrincipals();
        System.out.println(principalCollection.asList());

        // 验证用户权限
        if (subject.hasRole("role1")) {
            System.out.println("当前用户拥有权限：》》》role1");
        } else {
            System.out.println("当前用户没有权限：》》》role1");
        }
        if (subject.hasRole("role3")) {
            System.out.println("当前用户拥有权限：》》》role3");
        } else {
            System.out.println("当前用户没有权限：》》》role3");
        }

        // 6、退出
        subject.logout();
    }

}
