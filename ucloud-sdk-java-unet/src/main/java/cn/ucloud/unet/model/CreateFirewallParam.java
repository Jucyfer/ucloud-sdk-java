package cn.ucloud.unet.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.exception.ValidatorException;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;
import org.apache.commons.lang3.StringUtils;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description: 创建防火墙  参数类
 * @author: joshua jucyfer
 * @E-mail: joshua.yin@ucloud.cn 502223422@qq.com
 * @date: 2018/9/27 11:31
 */
public class CreateFirewallParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     * require name 防火墙名称， 默认为Firewall
     */
    @UcloudParam("Name")
    @NotEmpty(message = "name can not be empty")
    private String name;

    /**
     * optional tag 防火墙业务组，默认为Default
     */
    @UcloudParam("Tag")
    private String tag;

    /**
     * optional remark 防火墙描述，默认为空
     */
    @UcloudParam("Remark")
    private String remark;


    /**
     * rule 防火墙规则
     */
    @NotNull(message = "rule can not be empty")
    private List<Rule> rule;

    @UcloudParam("Rule")
    public List<Param> checkFirewallRule() throws ValidatorException {
        List<Param> list = new ArrayList<>();
        if (rule == null || rule.isEmpty()) {
            throw new ValidatorException("rule can not be empty");
        }
        List<Rule> rules = this.getRule();
        String exceptionFormat = "rule[%d] %s";
        for (int i = 0, len = rules.size(); i < len; i++) {
            Rule rule = rules.get(i);
            if (rule == null) {
                throw new ValidatorException(String.format(exceptionFormat, i, " can not be null"));
            } else {
                if (StringUtils.isBlank(rule.getProtocol())) {
                    throw new ValidatorException(String.format(exceptionFormat, i, "protocol can not be empty"));
                }
                if (rule.getPort() == null || !rule.getPort().matches("^$|^[1-9][0-9]*$|^[1-9][0-9]*-[1-9][0-9]*$")) {
                    throw new ValidatorException(String.format(exceptionFormat, i, "illegal port"));
                }
                if (StringUtils.isBlank(rule.getIp())) {
                    throw new ValidatorException(String.format(exceptionFormat, i, "ip can not be empty"));
                }
                if (StringUtils.isBlank(rule.getPriority())) {
                    throw new ValidatorException(String.format(exceptionFormat, i, "priority can not be empty"));
                }
                if (StringUtils.isBlank(rule.getAcceptOrNot())) {
                    throw new ValidatorException(String.format(exceptionFormat, i, "acceptOrNot can not be empty"));
                }
                list.add(new Param("Rule." + i, rule.getRule()));
            }
        }
        return list;
    }


    public CreateFirewallParam(String region,
                               List<Rule> rule,
                               String name) {
        super("CreateFirewall");
        this.region = region;
        this.rule = rule;
        this.name = name;
    }

    public CreateFirewallParam(String region, DescribeFirewallResult.FirewallData firewallData) {
        super("CreateFirewall");
        this.region = region;
        this.rule = this.rule = firewallData
                .getRule()
                .parallelStream()
                .map(rule ->
                        new Rule(
                                rule.getProtocolType(),
                                rule.getDstPort(),
                                rule.getSrcIP(),
                                rule.getRuleAction(),
                                rule.getPiority(),
                                rule.getRemark()
                        )
                )
                .collect(Collectors.toList());
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<Rule> getRule() {
        return rule;
    }

    public void setRule(List<Rule> rule) {
        this.rule = rule;
    }

    public void addRule(Rule rule) {
        this.rule.add(rule);
    }

    public void addRule(String protocol, String port, String ip, String action, String priority, String remark) {
        this.rule.add(new Rule(protocol, port, ip, action, priority, remark));
    }

    public static class Rule {
        @SuppressWarnings("squid:S1170")
        private final String ruleFormatWithPort = "%s|%s|%s|%s|%s";
        @SuppressWarnings("squid:S1700")
        private String rule;

        /**
         * 协议: TCP, UDP, ...
         */
        private String protocol;

        /**
         * 端口号
         */
        private String port;

        /**
         * IP
         */
        private String ip;

        /**
         * ACCEPT（接受）, DROP（拒绝）
         */
        private String acceptOrNot;

        /**
         * 优先级：HIGH（高），MEDIUM（中），LOW（低）
         */
        private String priority;

        /**
         * 用户备注
         */
        private String remark;

        public Rule(String protocol,
                    String port,
                    String ip,
                    String acceptOrNot,
                    String priority) {
            this.protocol = protocol;
            this.port = port;
            this.ip = ip;
            this.acceptOrNot = acceptOrNot;
            this.priority = priority;
            this.remark = "";
        }

        public Rule(String protocol,
                    String port,
                    String ip,
                    String acceptOrNot,
                    String priority,
                    String remark) {
            this.protocol = protocol;
            this.port = port;
            this.ip = ip;
            this.acceptOrNot = acceptOrNot;
            this.priority = priority;
            this.remark = remark;
        }

        public String getRule() {
            rule = String.format(ruleFormatWithPort, protocol, port, ip, acceptOrNot, priority, remark);
            return rule;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getAcceptOrNot() {
            return acceptOrNot;
        }

        public void setAcceptOrNot(String acceptOrNot) {
            this.acceptOrNot = acceptOrNot;
        }

        public String getPriority() {
            return priority;
        }

        public void setPriority(String priority) {
            this.priority = priority;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }
}
