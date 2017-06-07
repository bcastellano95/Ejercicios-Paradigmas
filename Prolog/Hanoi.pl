hanoi(0,_,_,_).



hanoi(N,Origen,Auxiliar,Destino):- N1 is N-1,



hanoi(N1,Origen,Destino,Auxiliar),



def_pasos(Origen,Destino),



hanoi(N1,Auxiliar,Origen,Destino).






def_pasos(Origen,Destino):-



write(' desde '),



write(Origen),



write(' hasta '),



write(Destino),



write('\n').