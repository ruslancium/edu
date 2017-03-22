package by.epam.jmp.less_class0320;

import org.apache.log4j.Logger;

import org.apache.log4j.FileAppender;
import org.apache.log4j.SimpleLayout;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.IOException;

/**
 * Created by Ruslan_Arifullin on 3/20/2017.
 */
public class StudentErrorHandler extends DefaultHandler {

    private Logger logger = Logger.getLogger("by.bsu.valid");
    public StudentErrorHandler(String log) throws IOException {
// установка файла и формата вывода ошибок
        logger.addAppender(new FileAppender(new SimpleLayout(), log));
    }
    public void warning(SAXParseException e) {
        logger.warn(getLineAddress(e) + "-" + e.getMessage());
    }
    public void error(SAXParseException e) {
        logger.error(getLineAddress(e) + " - " + e.getMessage());
    }
    public void fatalError(SAXParseException e) {
        logger.fatal(getLineAddress(e) + " - " + e.getMessage());
    }
    private String getLineAddress(SAXParseException e) {
// определение строки и столбца ошибки
        return e.getLineNumber() + " : " + e.getColumnNumber();
    }
}
