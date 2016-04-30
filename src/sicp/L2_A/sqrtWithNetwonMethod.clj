(ns
  sicp.L2_A.sqrtWithNetwonMethod
  (require [sicp.L0.math :refer :all]
           [sicp.L2.deriv :refer :all]
           [sicp.L2.fixedPoint :refer :all])
  )


(defn newton-method [f guess]
  (def df (deriv f))
  (fixedPoint (fn [x] (- x (/ (f x) (df x)))) guess)
  )

(defn sqrt [x]
  (newton-method (fn [y] (- x (square y))) 1)
  )

(println (sqrt 25.0))
