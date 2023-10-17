grammar GameMap;

/** the start rule, begin parsing here **/
prog: gamemap+ ;

gamemap : NEWLINE ;


NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)