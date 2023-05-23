package SAK;

public class CellMaker {

    public static Cell evaluateInfo(String content, Position position) {
        if (!content.isEmpty() && content.matches("^[a-zA-Z0-9-+*/^=.\"]*$")) {
            if (content.charAt(0) == '=') {
                return Cell.createFormulaCell(content, position);
            } else {
                if (content.substring(0, 1).matches("^[0-9-+.]*$") && content.matches("^[0-9-+.]*$")) {

                    if (content.contains(".")) {
                        try {
                            float contentF = Float.parseFloat(content);
                            return Cell.createFloatCell(contentF, position);
                        } catch (NumberFormatException e) {
                        }

                    } else {
                        Integer contentI = Integer.parseInt(content);
                        return Cell.createIntCell(contentI, position);
                    }
                } else if (content.matches("^[a-zA-Z' !\".]*$")) {
                    return Cell.createStringCell(content, position);
                }
            }
        }
        return Cell.createStringCell("", position);
    }
}
