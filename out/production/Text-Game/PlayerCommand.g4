grammar PlayerCommand;

/** the start rule, begin parsing here **/
prog: command+ ;

command : DOOR INT NEWLINE     # doorCommand
        | PICKUP ID NEWLINE    # pickup
        | EXIT NEWLINE         # exit
        | DESCRIBE NEWLINE     # describe
        | ADMIRE ID NEWLINE    # admireValuable
        | EAT ID NEWLINE       # eatFood
        | STATS NEWLINE        # lookAtStats
        | WIELD ID NEWLINE     # wieldWeapon
        | OPEN ID NEWLINE      # openChest
        | HELP NEWLINE         # displayHelp
        | ATTACK NEWLINE       # attackMonster
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