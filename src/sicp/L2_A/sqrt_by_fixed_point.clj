(ns sicp.L2_A.sqrt_by_fixed_point
  (require [sicp.L2.fixedPoint :refer :all]
           [sicp.L0.math :refer :all])
  )


(defn sqrt [x]
  (fixedPoint (fn [y] (average y (/ x y))) 1)
  )

(println (sqrt 25.0))
