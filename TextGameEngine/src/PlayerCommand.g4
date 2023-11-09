grammar PlayerCommand;

/** the start rule, begin parsing here **/
prog: command+ ;

command : DOOR INT NEWLINE? EOF NEWLINE?     # doorCommand
        | PICKUP ID NEWLINE? EOF NEWLINE?     # pickup
        | EXIT NEWLINE? EOF NEWLINE?     # exit
        | DESCRIBE NEWLINE? EOF NEWLINE?    # describe
        | ADMIRE ID NEWLINE? EOF NEWLINE?     # admireValuable
        | EAT ID NEWLINE? EOF NEWLINE?     # eatFood
        | STATS NEWLINE? EOF NEWLINE?       # lookAtStats
        | WIELD ID NEWLINE? EOF NEWLINE?      # wieldWeapon
        | OPEN ID NEWLINE? EOF NEWLINE?     # openChest
        | HELP NEWLINE? EOF NEWLINE?       # displayHelp
        | ATTACK NEWLINE? EOF NEWLINE?      # attackMonster
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
ANY: . ;