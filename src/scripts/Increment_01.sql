CREATE TABLE public.system_user
(
    username character varying(15) COLLATE pg_catalog."default" NOT NULL,
    password character varying(15) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT system_user_pkey PRIMARY KEY (username)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.system_user
    OWNER to postgres;
    
COMMIT;