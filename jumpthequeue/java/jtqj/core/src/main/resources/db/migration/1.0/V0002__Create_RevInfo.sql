CREATE TABLE RevInfo(
  id          BIGINT NOT NULL GENERATED BY DEFAULT AS IDENTITY (START WITH 1),
  "timestamp" BIGINT NOT NULL,
  userLogin   VARCHAR(255)
);