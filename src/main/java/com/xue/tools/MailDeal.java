package com.xue.tools;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;


public class MailDeal {
	public JavaMailSenderImpl JavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.qq.com");
        mailSender.setUsername("1049245996@qq.com");
        mailSender.setPassword("kklmesjpdslsbdfg");
        return mailSender;
    }
    //一个简单的邮件,只有text信息
    /**
     * @Description:
     * @Param: [subject:标题, text:内容, email:接收人的邮件地址]
     * @return: void
     * @Author: 你自己
     * @Date: 2020/2/27
     */
    public void SendSimpleEmail(String subject, String text, String email) {
        JavaMailSenderImpl javaMailSender = JavaMailSender();
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject(subject); //邮件的主题
        mailMessage.setText(text);
        mailMessage.setTo(email); //发送给谁
        mailMessage.setFrom(Objects.requireNonNull(javaMailSender.getUsername())); //谁发送的
        javaMailSender.send(mailMessage);
    }

    /**
     * @Description:
     * @Param: [subject:标题, text:内容, html,Boolean html:是否进行html解析
     * email:接收人的邮件地址, attachmentMap:附件的名称和文件路径]
     * @return: void
     * @Author: 你自己
     * @Date: 2020/2/27
     */
    public void SendMimeEmail(String subject, String text, Boolean html,
                              String email, Map<String, String> attachmentMap) throws MessagingException {
        JavaMailSenderImpl javaMailSender = JavaMailSender();
        //一个复杂的邮件`
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        //进行组装
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, html);
        helper.setSubject(subject);
        helper.setText(text, html);

        //附件
        if (attachmentMap != null) {
            Iterator<Map.Entry<String, String>> iterator = attachmentMap.entrySet().iterator();  
            //map.entrySet()得到的是set集合，可以使用迭代器遍历
            while (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                helper.addAttachment(entry.getKey(), 
                //附件名称,要写好文件的后缀,不要少写和写错
                new File(entry.getValue()));
                //附件的文件地址,可以写绝对路径,若是相对路径,如./1.png,代表的是resources下的1.png
            }
        }
        helper.setTo(email); //发送给谁
        helper.setFrom(Objects.requireNonNull(javaMailSender.getUsername())); //谁发送的
        javaMailSender.send(mimeMessage);
    }
    public static void main(String[] args) {
		
    	MailDeal e = new MailDeal();
    	e.SendSimpleEmail("wocao","who are you","1049245996@qq.com");
//    	e.SendSimpleEmail("wocao","who are you","caoyu@sunline.cn");

	}
}
