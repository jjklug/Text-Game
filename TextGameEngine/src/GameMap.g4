grammar GameMap;

/** the start rule, begin parsing here **/
prog: gamemap+ ;

gamemap : connect NEWLINE                   # connectionsList
        | PICKUP NEWLINE                    # pickupKeyword
        | pickup NEWLINE                    # pickupsList
        | MONSTER NEWLINE                   # monstersKeyword
        | monster NEWLINE                   # monstersList
        | START NEWLINE                     # startKeyword
        | start NEWLINE                     # startList
        | FINISH NEWLINE                    # finishKeyword
        | finish NEWLINE                    # finishList
        ;

connect : connect CON connect       # connection
        | CHAR                      # connectedNode
        ;

pickup : pickup CON pickup          # inv
       | CHAR                       # invNode
       | ID                         # itemID
       ;

monster : monster CON monster       # monsterInv
        | CHAR                      # monsterInvNode
        | ID                        # monsterID
        ;

start : CHAR                        #startNode
      ;

finish : CHAR                       #finishNode
       ;

CON: '-' ;
MONSTER: 'monster' ;
PICKUP: 'pickup' ;
START: 'start';
FINISH: 'finish';

CHAR: 'a'..'z' ;
ID : [a-zA-Z]+ ;
INT : [0-9]+ ;
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS : [ \t]+ -> skip ;
ANY: . ;