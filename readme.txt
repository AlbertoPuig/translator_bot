I'm developing an online translator app, and this is what I found out empirically:

sl - source language code (auto for autodetection)
tl - translation language
q - source text / word
ie - input encoding (a guess)
oe - output encoding (a guess)
dt - may be included more than once and specifies what to return in the reply.
Here are some values for dt. If the value is set, the following data will be returned:

t - translation of source text
at - alternate translations
rm - transcription / transliteration of source and translated texts
bd - dictionary, in case source text is one word (you get translations with articles, reverse translations, etc.)
md - definitions of source text, if it's one word
ss - synonyms of source text, if it's one word
ex - examples
rw - See also list.


Translate__ Dictionary__ Definition__ and Synonyms__
			
https://translate.googleapis.com/translate_a/single?client=gtx&sl=en&tl=es&dt=t&dt=bd&dt=md&dt=ss&q=Window
			
[[["Ventana","Window",null,null,1]],
[["sustantivo",["ventana","ventanilla","escaparate","vidriera","luneta","alta"],
[["ventana",["window","deadlight"],[34481],0.56094915,"la",2],["ventanilla",["window","hatch"],[34481],0.011825466,"la",2],["escaparate",["showcase","storefront","display","shopwindow","display case","shopfront"],null,0.0019608543,"el",1],["vidriera",["window","showcase","shopwindow"],null,0.0008174057,"la",2],["luneta",["window","lens","stall","crescent"],null,0.00057064113,"la",2]],"window",1]],"en",null,null,null,null,null,null,null,null,[["sustantivo",[[["windowpane"],""]],"window"]],
[["sustantivo",[["an opening in the wall or roof of a building or vehicle that is fitted with glass or other transparent material in a frame to admit light or air and allow people to see out.","m_en_us1306540.001"],["a thing resembling a window in form or function, in particular.","m_en_us1306540.005"],["an interval or opportunity for action.","m_en_us1306540.010"],["strips of metal foil or metal filings dispersed in the air to obstruct radar detection.","m_en_us1306540.012"]],"window"]]]