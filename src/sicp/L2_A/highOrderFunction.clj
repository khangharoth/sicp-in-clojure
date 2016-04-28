(ns sicp.L1.highOrderFunction
  (require [sicp.L0.math :refer :all])
  )

(defn f [g]
  (g 2))

(println (f (fn [x] (* x (+ x 1)))))
