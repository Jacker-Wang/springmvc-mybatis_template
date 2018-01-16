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
        // 1����ȡ SecurityManager �������˴�ʹ�� Ini �����ļ���ʼ�� SecurityManager
        Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-roles.ini");
        // 2���õ� SecurityManager ʵ�� ���󶨸� SecurityUtils
        org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        // 3���õ� Subject �������û���/���������֤ Token�����û����/ƾ֤��
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
        try {
            // 4����¼���������֤
            subject.login(token);
        } catch (AuthenticationException e) {
            // 5�������֤ʧ��
            System.out.println("�����֤ʧ��");
            System.exit(0);
        }
        // �û��Ѿ���¼
        System.out.println("�û���¼");
        System.out.print("��ǰ��¼�û���������");
        PrincipalCollection principalCollection = subject.getPrincipals();
        System.out.println(principalCollection.asList());

        // ��֤�û�Ȩ��
        if (subject.hasRole("role1")) {
            System.out.println("��ǰ�û�ӵ��Ȩ�ޣ�������role1");
        } else {
            System.out.println("��ǰ�û�û��Ȩ�ޣ�������role1");
        }
        if (subject.hasRole("role3")) {
            System.out.println("��ǰ�û�ӵ��Ȩ�ޣ�������role3");
        } else {
            System.out.println("��ǰ�û�û��Ȩ�ޣ�������role3");
        }

        // 6���˳�
        subject.logout();
    }

}
