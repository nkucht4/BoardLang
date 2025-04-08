parser grammar p_BoardLang;

options {
    tokenVocab = l_BoardLang;
}

test_prod: INT_T ID EQ INT_V;
