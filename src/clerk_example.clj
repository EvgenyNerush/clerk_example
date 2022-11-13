(ns clerk-example
  (:require [nextjournal.clerk.viewer :as v]))

;; This is a Clerk notebook 🍄

(def xs
  ; x values
  (range 0 2 0.1))

; Functions to plot:

(defn f [x]
  (* x x))

(defn g [x]
  (- x (* 0.5 (f x))))

; Time for Plotly.js!

(v/plotly {:layout {:title "A line plot"}
           :data [{:x xs
                   :y (map f xs)
                   :type "line"}
                  {:x xs
                   :y (map g xs)
                   :type "line"}]})
