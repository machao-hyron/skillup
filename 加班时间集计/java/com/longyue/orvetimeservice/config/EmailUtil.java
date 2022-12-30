package com.longyue.orvetimeservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Component
public class EmailUtil {

    @Value("${spring.mail.from}") // 从application.yml配置文件中获取
    private String from; // 发送发邮箱地址

    @Resource
    private JavaMailSender mailSender;

    /**
     * 发送纯文本邮件信息
     *
     * @param to      接收方
     * @param subject 邮件主题
     * @param content 邮件内容（发送内容）
     */
    public void sendMessage(String to, String subject, String content) {
        // 创建一个邮件对象
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setFrom(from); // 设置发送发
        msg.setTo(to); // 设置接收方
        msg.setSubject(subject); // 设置邮件主题
        msg.setText(content); // 设置邮件内容
        // 发送邮件
        mailSender.send(msg);
    }

    /**
     * 发送带附件的邮件信息
     *
     * @param to      接收方
     * @param subject 邮件主题
     * @param content 邮件内容（发送内容）
     * @param files 文件数组 // 可发送多个附件
     */
    public void sendMessageCarryFiles(String to, String subject, String content, File[] files) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
            helper.setFrom(from); // 设置发送发
            helper.setTo(to); // 设置接收方
            helper.setSubject(subject); // 设置邮件主题
            helper.setText(content); // 设置邮件内容
            if (files != null && files.length > 0) { // 添加附件（多个）
                for (File file : files) {
                    helper.addAttachment(file.getName(), file);
                }
            }
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        // 发送邮件
        mailSender.send(mimeMessage);
    }
    /**
     * 发送带附件的邮件信息
     *
     * @param to      接收方
     * @param subject 邮件主题
     * @param content 邮件内容（发送内容）
     * @param file 单个文件
     */
    public void sendMessageCarryFile(String to, String subject, String content, File file) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
            helper.setFrom(from); // 设置发送发
            helper.setTo(to); // 设置接收方
            helper.setSubject(subject); // 设置邮件主题
            helper.setText(content); // 设置邮件内容
            helper.addAttachment(file.getName(), file); // 单个附件
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        // 发送邮件
        mailSender.send(mimeMessage);
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
