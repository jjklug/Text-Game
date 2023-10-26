grammar PlayerCommand;

/** the start rule, begin parsing here **/
prog: command+ ;

command : DOOR INT NEWLINE? EOF     # doorCommand
        | PICKUP ID NEWLINE? EOF    # pickup
        | EXIT NEWLINE? EOF         # exit
        | DESCRIBE NEWLINE? EOF     # describe
        | ADMIRE ID NEWLINE? EOF    # admireValuable
        | EAT ID NEWLINE? EOF       # eatFood
        | STATS NEWLINE? EOF        # lookAtStats
        | WIELD ID NEWLINE? EOF     # wieldWeapon
        | OPEN ID NEWLINE? EOF      # openChest
        | HELP NEWLINE? EOF         # displayHelp
        | ATTACK NEWLINE? EOF       # attackMonster
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