grammar PlayerCommand;

/** the start rule, begin parsing here **/
prog: command+ ;

command : DOOR ID
        | PICKUP ID
        | EXIT
        | DESCRIBE
        | ADMIRE ID
        | EAT ID
        | STATS
        | WIELD ID
        | OPEN ID
        | HELP
        | ATTACK
        ;

DOOR : 'door';
PICKUP: 'pickup';
EXIT: 'exit';
DESCRIBE: 'describe';
ADMIRE: 'admire';
EAT: 'eat';
STATS: 'stats';
WIELD: 'wield';
OPEN: 'open';
HELP: 'help';
ATTACK: 'attack';

ID : [a-zA-Z]+ ;
INT : [0-9]+ ;
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS : [ \t]+ -> skip ;