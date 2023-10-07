package org.example.functions;

import org.example.commands.AppBotCommand;

public class FilterOperations {
    @AppBotCommand(name = "grayScale", description = "greyScale filter", showInKeyboard = true)
    public static float[] grayScale(float[] rgb) {
        final float mean = (rgb[0] + rgb[1] + rgb[2]) / 3;
        rgb[0] = mean;
        rgb[1] = mean;
        rgb[2] = mean;
        return rgb;
    }
    @AppBotCommand(name = "onlyRed", description = "onlyRed filter", showInKeyboard = true)
    public static float[] onlyRed(float[] rgb) {
        rgb[1] = 0;
        rgb[2] = 0;
        return rgb;
    }
    @AppBotCommand(name = "onlyGreen", description = "onlyGreen filter", showInKeyboard = true)
    public static float[] onlyGreen(float[] rgb) {
        rgb[0] = 0;
        rgb[2] = 0;
        return rgb;
    }
    @AppBotCommand(name = "onlyBlue", description = "onlyBlue filter", showInKeyboard = true)
    public static float[] onlyBlue(float[] rgb) {
        rgb[0] = 0;
        rgb[1] = 0;
        return rgb;
    }
    @AppBotCommand(name = "onlyYellow", description = "onlyYellow filter", showInKeyboard = true)
    public static float[] onlyYellow(float[] rgb) {
        rgb[2] = 0;
        return rgb;
    }
    @AppBotCommand(name = "onlyPink", description = "onlyPink filter", showInKeyboard = true)
    public static float[] onlyPink(float[] rgb) {
        rgb[1] = 0;
        return rgb;
    }
    @AppBotCommand(name = "onlyCyan", description = "onlyCyan filter", showInKeyboard = true)
    public static float[] onlyCyan(float[] rgb) {
        rgb[0] = 0;
        return rgb;
    }
    @AppBotCommand(name = "hello", description = "when request hello", showInHelp = true)
    String hello() {
        return "Привет, дружище! Давно не виделись :)";
    }

    @AppBotCommand(name = "bye", description = "when request bye", showInHelp = true)
    String bye() {
        return "Ты уже уходишь? Как жаль... Приходи снова!";
    }

    @AppBotCommand(name = "help", description = "when request help", showInHelp = true)
    String help() {
        return "Вы воспользовались командой /help. В дальнейшем в данном разделе будут все доступные команды бота.";
    }
}
