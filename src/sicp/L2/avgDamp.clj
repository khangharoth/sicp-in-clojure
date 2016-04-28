(ns
  sicp.L2.clojure.avgDamp
  (require [sicp.L0.math :refer :all])
  )


(defn avgDamp [f]
  (fn [x] (average x (f x)))
  )


(println ((avgDamp (fn [y] (* y y))) 10))
