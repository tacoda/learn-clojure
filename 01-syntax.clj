;; Numeric types

42        ; integer
-1.5      ; floating point
22/7      ; ratio

;; Character types

"hello"         ; string
\e              ; character
#"[0-9]+"       ; regular expression

;; Symbols and idents

map             ; symbol
+               ; symbol - most punctuation allowed
clojure.core/+  ; namespaced symbol
nil             ; null value
true false      ; booleans
:alpha          ; keyword
:release/alpha  ; keyword with namespace

;; Collections

'(1 2 3)     ; list
[1 2 3]      ; vector
#{1 2 3}     ; set
{:a 1, :b 2} ; map