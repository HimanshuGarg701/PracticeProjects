package com.example.playlist;

public enum DataBase {
    // adj[], adverb[], conjuction[], interjection[], noun[], preposition[], pronoun[], verb[]
    arrow(new String[] {""},
            new String[] {""},
            new String[] {""},
            new String[] {""},
            new String[] {"Here is one Arrow: <IMG> -=>> </IMG>"},
            new String[] {""},
            new String[] {""},
            new String[] {""}),
    distinct(new String[] {"Familiar. Worked in Java","Unique. No duplicates. Clearly Different"},
            new String[] {"Uniquely. Written \"distinctly\""},
            new String[] {""},
            new String[] {""},
            new String[] {"A keyword in this assignment","A keyword in this assignment",
                    "A keyword in this assignment", "An advanced search option","Distinct is a keyword in this assignment"},
            new String[] {""},
            new String[] {""},
            new String[] {""}),
    placeholder(new String[] {"To be Updated...","To be Updated..."},
            new String[] {"To be Updated..."},
            new String[] {"To be Updated..."},
            new String[] {"To be Updated..."},
            new String[] {"To be Updated...","To be Updated...","To be Updated..."},
            new String[] {"To be Updated..."},
            new String[] {"To be Updated..."},
            new String[] {"To be Updated..."}),
    csc340(new String[] {"C++ is upper version of CSC 210+CSC2220 +MORE"},
            new String[] {""},
            new String[] {""},
            new String[] {""},
            new String[] {"A CS upper division course","Many Hours outside of class","Programming Methodlogy"},
            new String[] {""},
            new String[] {""},
            new String[] {""}),
    csc220(new String[] {"Ready to create complex data structure"},
            new String[] {""},
            new String[] {""},
            new String[] {""},
            new String[] {""},
            new String[] {""},
            new String[] {""},
            new String[] {"To create data dtructure"}),
    book(new String[] {""},
            new String[] {""},
            new String[] {""},
            new String[] {""},
            new String[] {"A set of pages", "A written work published in printed form"},
            new String[] {""},
            new String[] {""},
            new String[] {"To arrange for someone to have a seat on plane","To arrange something on a particular date"}),
    adverb(new String[] {""},
            new String[] {""},
            new String[] {""},
            new String[] {""},
            new String[] {"Adverb is a word that adds more information about place, time, manner, cause or\n" +
                    "degree to a verb, an adjective, a phrase or another adverb."},
            new String[] {""},
            new String[] {""},
            new String[] {""}),
    adjective(new String[] {""},
            new String[] {""},
            new String[] {""},
            new String[] {""},
            new String[] {"Adjective is a word that describes a person or thing, for example big, red and\n" +
                    "clever in a big house, red wine and a clever idea."},
            new String[] {""},
            new String[] {""},
            new String[] {""}),
    interjection(new String[] {""},
            new String[] {""},
            new String[] {""},
            new String[] {""},
            new String[] {"Interjection is a short sound, word or phrase spoken suddenly to express an\n" +
                    "emotion. Oh!, Look out! and Ow! are interjections."},
            new String[] {""},
            new String[] {""},
            new String[] {""}),
    noun(new String[] {""},
            new String[] {""},
            new String[] {""},
            new String[] {""},
            new String[] {"Noun is a word that refers to a person, (such as Ann or doctor), a place (such as Paris\n" +
                    "or city) or a thing, a quality or an activity (such as plant, sorrow or tennis."},
            new String[] {""},
            new String[] {""},
            new String[] {""});
    public String[] adjectives;
    public String[] adverbs;
    public String[] conjuctions;
    public String[] interjections;
    public String[] nouns;
    public String[] prepositions;
    public String[] pronouns;
    public String[] verbs;

    DataBase(String[] adjectives, String[] adverbs, String[] conjuctions, String[] interjections, String[] nouns,
             String[] prepositions, String[] pronouns, String[] verbs){
        this.adjectives = adjectives;
        this.adverbs = adverbs;
        this.conjuctions = conjuctions;
        this.interjections = interjections;
        this.nouns = nouns;
        this.prepositions = prepositions;
        this.pronouns = pronouns;
        this.verbs = verbs;
    }
}

