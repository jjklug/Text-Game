grammar PlayerCommand;

/** the start rule, begin parsing here **/
prog: command+ ;

command : DOOR INT      # doorCommand
        | PICKUP ID     # pickup
        | EXIT          # exit
        | DESCRIBE      # describe
        | ADMIRE ID     # admireValuable
        | EAT ID        # eatFood
        | STATS         # lookAtStats
        | WIELD ID      # wieldWeapon
        | OPEN ID       # openChest
        | HELP          # displayHelp
        | ATTACK        # attackMonster
        | NEWLINE       # newLine
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