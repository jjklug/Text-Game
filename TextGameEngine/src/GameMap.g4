grammar GameMap;

/** the start rule, begi0n parsing here **/
prog: map+ ;

map : state_list NEWLINE  # gameMap
    ;

state_list : ( stat ';'?)*      # states
           ;

stat: edge_stmt                 # edges
    | attr_stmt                 # attributes
    ;

edge_stmt: (ID ) edgeRHS ?      # leftEdge
         ;

edgeRHS: (edgeop ( ID ))       # rightEdge
       ;

edgeop: CON
      ;

attr_stmt: attr_list
         ;

attr_list
   : ( ID ( '=' ID )? ','? )+   # nodePickups
   ;

//lexer rules
CON: '-' ;

//inspired from DOT grammar on the ANTLR lab
NUMBER
   : '-'? ( '.' DIGIT+ | DIGIT+ ( '.' DIGIT* )? )
   ;

fragment DIGIT
   : [0-9]
   ;

/** "any double-quoted string ("...") possibly containing escaped quotes" */ STRING
   : '"' ( '\\"' | . )*? '"'
   ;

/** "Any string of alphabetic ([a-zA-Z\200-\377]) characters, underscores
 *  ('_') or digits ([0-9]), not beginning with a digit"
 */ ID
   : LETTER ( LETTER | DIGIT )*
   ;

fragment LETTER
   : [a-zA-Z\u0080-\u00FF_]
   ;
//generic ones
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS : [ \t]+ -> skip ;
ANY: . ;