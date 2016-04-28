(ns
  sicp.L2_A.sqrt-with-avgdamping
  (require [sicp.L2.avgDamp :refer :all]
           [sicp.L2.fixedPoint :refer :all]
           [sicp.L0.math :refer :all])
  )


(defn sqrt [x]
  (fixedPoint (avgDamp (fn [y] (/ x y))) 1)
  )

(println (sqrt 25.0))
