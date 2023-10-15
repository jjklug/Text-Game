grammar GameMap;

/** the start rule, begin parsing here **/


gamemap : NEWLINE;


NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)