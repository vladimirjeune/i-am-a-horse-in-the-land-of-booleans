(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  "This returns falsey for nil and false and truthy for all else"
  (and
  true
  ( not (not x) )  ; Makes sure we are only comparing boolean values, so only bools returned
  ))

(defn
  abs
  "Returns the absolute value of x"
  [x]
  (if (< x 0)                         ; If x < 0
    (* -1 x)                          ; Return neg of neg value
    x )                               ; Otherwise just return x
  )

(defn divides?
  "Returns true if divisor divides n, false otherwise"
  [divisor n]                         ; This is passing in 2 params
   (if ( == 0 (mod n divisor) )
     true
     false) )

(defn fizzbuzz
  "Returns 'fuzz' when /3, 'buzz' when /5 'gotcha' /15 and '' otherwise"
  [n]
  (cond
   (divides? 15 n) "gotcha!"           ; This is like an elsif, not ifs.
   (divides? 5  n) "buzz"
   (divides? 3  n) "fizz"
   :else           ""  ) )             ; final else

(defn
  teen?
  "Return truthy if 19 >= age >= 13"
  [age]
  ( >= 19 age 13 ) )

(defn not-teen?
  "Returns the opposite of teen?"
  [age]
  (not (teen? age) )
  )

(defn generic-doublificate
  "2x if number, nil if empty coll, 2x if full list or vector, else true"
  [x]
  (cond
   (number? x) (* 2 x)                           ; Condition 1
   (and (coll? x) (empty? x) ) nil               ; Condition 2
   (or (list? x) (vector? x) ) (* 2 (count x) )  ; Condition 3
   :else                                         ; Else true
   true
   ) )

(defn leap-year?
  "Leap year is /4 unless divisible by 100 unless / 400"
  [year]
  ( cond
    (== 0 (mod year 100) ) (== 0 (mod year 400) )   ; If div100, check to see if div400
    (== 0 (mod year 4) ) true                       ; If div 4 is leap year since others are taken care of
    :else                                           ; Otherwise not a leap year
    false
    )


  )

; '_______'
