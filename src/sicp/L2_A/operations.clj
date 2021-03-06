(ns
  sicp.L2_A.operations
  (require [sicp.L2_A.makeRat :refer :all])
  )


(defn add-rat [x y]
  (make-rat (+ (* (numer x) (denom y))
               (* (numer y) (denom x)))
            (* (denom x) (denom y))
            )
  )

(defn sub-rat [x y]
  (make-rat (- (* (numer x) (denom y))
               (* (numer y) (denom x)))
            (* (denom x) (denom y))
            )
  )

(defn mult-rat [x y]
  (make-rat (* (numer x) (numer y))
            (* (denom x) (denom y))
            )
  )

(def one-half (make-rat 1 2))


(println (mult-rat one-half one-half))