package com.example.myapplication;

public class RTxtParserFunction {

    public static final int SEQMENT_INNER_CLAZZ = 1;
    public static final int SEQMNET_FIELD_NAME = 2;
    public static final int SEQMENT_FIELD_VALUE = 3;

    public static String apply(String rTxt, String packageName) {
        StringBuilder clazz = new StringBuilder();
        addRClassStart(clazz, packageName);
        addRClassBody(clazz, rTxt);
        addRClassEnd(clazz);
        return clazz.toString();
    }

    private static void addRClassStart(StringBuilder clazz, String packageName) {
        clazz.append("package ").append(packageName).append(";").append("\n").append("\n");
        clazz.append("public final class R {");
    }

    private static void addRClassEnd(StringBuilder clazz) {
        clazz.append("\n").append("}");
    }

    private static void addRClassBody(StringBuilder clazz, String rTxt) {
        String currentInlineClazz = "";
        String[] rTxtLines = rTxt.split("\n");

        for (String rTxtLine : rTxtLines) {
            String[] lineSeqments = rTxtLine.split(" ");

            if (!lineSeqments[SEQMENT_INNER_CLAZZ].equals(currentInlineClazz)) {
                addInlineClazzEnd(clazz, currentInlineClazz);
                currentInlineClazz = lineSeqments[SEQMENT_INNER_CLAZZ];
                addInlineClazzStart(clazz, currentInlineClazz);
            }

            if (rTxtLine.contains("{")) {
                clazz.append("\n").append("        ").append("public static final int[] ").append(lineSeqments[SEQMNET_FIELD_NAME]).append(" =");
                for (int i = SEQMNET_FIELD_NAME + 1; i < lineSeqments.length; i++) {
                    clazz.append(" ").append(lineSeqments[i]);
                }
                clazz.append(";");
            } else {
                clazz.append("\n").append("        ").append("public static final int ").append(lineSeqments[SEQMNET_FIELD_NAME]).append(" = ").append(lineSeqments[SEQMENT_FIELD_VALUE]).append(";");
            }
        }
        clazz.append("\n").append("    }");
    }

    private static void addInlineClazzStart(StringBuilder clazz, String inlineClazz) {
        clazz.append("\n").append("    ")
                .append("public static final class ").append(inlineClazz).append(" {");
    }

    private static void addInlineClazzEnd(StringBuilder clazz, String inlineClazz) {
        if (!inlineClazz.isEmpty()) {
            clazz.append("\n").append("    ")
                    .append("}");
        }
    }
}
