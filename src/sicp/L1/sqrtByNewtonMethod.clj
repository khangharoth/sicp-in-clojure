(ns sicp.L1.sqrtByNewtonMethod
  (:require [sicp.L0.math :refer :all]
           [sicp.L0.util :refer :all]))


(defn improve [guess x]
  (average guess (/ x guess)))

(defn sqrt-iter [guess x]
  (if (close-enf? 0.01 (square guess) x) guess
                                         (sqrt-iter (improve guess x) x)))

(defn sqrt [x]
  (sqrt-iter 1 x))
