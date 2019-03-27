(ns sicp.code-as-data.eval-appply)

(def complex_poly '(+ (+ (* x (* x x)) (* 2 (* x x))) 1))

(def poly '(+ 1 2 3))

(println (type +))
(println (type (eval (first poly))))



(println (eval '(+ 1 2 3)))
(println (apply (eval (first poly)) (rest poly)))

;(println (eval '(+ 4 5)))
;(println (apply (fn [x] (+ 3 x)) (list 2)))