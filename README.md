evaluate
========

POC for pluggable approach using spring framework, i have taken Marks Evaluation example for POC.

This is basic demonstration of plugin extension using spring framework.

Repository contains two project one is evaluate (core) another extension-evaluate (extenion plugin).

What i achieved
================
Using this approach we can separate core implementation from custom implementation.

Custom implementation should be in separate package(jar), but core should be written in such a way that they pick custom implementation from custom package(jar).

evaluate (core)
=================

DefaultEvaluatorImpl :  default marks evaluator implementation

extension-evaluate (extenion plugin)
=====================================

CustomEvaluationImpl : custom marks evaluator implementation





