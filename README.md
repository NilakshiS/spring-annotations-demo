# spring-annotations-demo
The repository contains programs to demonstrate spring core concepts using annotations, it uses a configuration class instead of xml file:
- Master Branch:
Contains program to demonstrate use of AnnotationConfigApplicationContext with the help of two beans called Actor and Movie

- constructor-injection branch:
Contains program to demonstrate use of constructor injection of bean dependencies with the help of two beans called Actor and Movie. It also demonstrates the difference between singleton and prototype scopes.

- autowire-xml branch:
Contains program to demonstrate the autowiring concept, different types of autowiring and catch in using autowiring by type.

- aware-interface branch:
Contains program to demonstrate the interfaces ApplicationContextAware, BeanFactoryAware, BeanNameAware in the Movie class and print out their results.

- bean-lifecycle branch:
Contains program to demonstrate the use of interfaces InitializingBean and DisposableBean and using custom init and destroy methods.

- bean-postprocessor branch:
Contains program to demonstrate the use of interface BeanPostProcessor.
