package ProjectTest;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static final Map<String, String> autoReplyMap = new HashMap<>();

    public static void main(String[] args) {
        initReplyMap();
        autoReplyMap.forEach((key, value) -> {
                    if (key.contains("误删")) {
                        System.out.println(value);

                    }
                }
        );
        System.out.println(123);
    }

    private static void initReplyMap() {
        autoReplyMap.put("不小心删除", "您好，感谢您的反馈，如果您的QQ浏览器版本号大于10.9.5版本，可以在文件-右上角菜单-回收站里面找到");
        autoReplyMap.put("误删", "您好，感谢您的反馈，如果您的QQ浏览器版本号大于10.9.5版本，可以在文件-右上角菜单-回收站里面找到");
        autoReplyMap.put("不能重命名", "您好，可以点击右上角菜单-另存为的方式来重命名文件");
        autoReplyMap.put("怎么重命名", "您好，可以点击右上角菜单-另存为的方式来重命名文件");
        autoReplyMap.put("如何重命名", "您好，可以点击右上角菜单-另存为的方式来重命名文件");
        autoReplyMap.put("不能插入图片", "您好，我们暂不支持插入图片，抱歉给你带来了不便，功能正在研发中，敬请期待");
        autoReplyMap.put("查找找不到", "您好，查找功能移入文档查看器右上角菜单-文档内查找，抱歉给您带来了不便");
        autoReplyMap.put("查找去哪了", "您好，查找功能移入文档查看器右上角菜单-文档内查找，抱歉给您带来了不便");
        autoReplyMap.put("分享到朋友圈", "您好，本地文件暂时不支持朋友圈分享");
        autoReplyMap.put("私密文件换手机找不到", "您好，由于私密文件只保存在手机本地，更换手机无法找到，抱歉给您带来了不便");
        autoReplyMap.put("解压密码", "您好，请关注压缩包文件下载渠道，或者问发送者所要密码");
        autoReplyMap.put("压缩包密码", "您好，请关注压缩包文件下载渠道，或者问发送者所要密码");
        autoReplyMap.put("文件打不开", "您好，QQ浏览器暂不支持打开此格式的文件，抱歉给您带来了不便，可以点击右上角菜单-选择其他方式打开");
    }
}
