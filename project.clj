(defproject org.clojars.m00qek/github-actions-for-clojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :repositories [["snapshots" {:url "https://clojars.org/repo"
                               :username :env/clojars_username
                               :password :env/clojars_passwd
                               :sign-releases false}]]
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :repl-options {:init-ns github-actions-for-clojure.core})
