DROP SCHEMA IF EXISTS mcve CASCADE;

CREATE SCHEMA mcve;

CREATE TABLE mcve.test
(
    id    serial PRIMARY KEY,
    value INT
);

CREATE TABLE mcve.experience
(
    id                 serial PRIMARY KEY,
    last_modified      timestamp WITH TIME ZONE DEFAULT now() NOT NULL,
    patient_typing_at  timestamp WITH TIME ZONE,
    patient_seen_until timestamp WITH TIME ZONE DEFAULT now() NOT NULL,
    created_at         timestamp WITH TIME ZONE DEFAULT now() NOT NULL,
    closed_at          timestamp WITH TIME ZONE,
    title              text,
    description        text
);

CREATE TABLE mcve.message
(
    id                  serial PRIMARY KEY,
    created_at          timestamp WITH TIME ZONE DEFAULT now()    NOT NULL,
    event_time          timestamp WITH TIME ZONE DEFAULT now()    NOT NULL,
    experience_id       integer                                   NOT NULL,
    text_content        text                     DEFAULT ''::text,
    type                text                     DEFAULT 'TEXT'   NOT NULL,
    doctor_id           integer,
    file_upload_id      integer,
    reply_message_id    integer,
    is_reply            boolean                  DEFAULT FALSE    NOT NULL,
    sender_type         text                     DEFAULT 'DOCTOR' NOT NULL,
    is_automatic        boolean                  DEFAULT false    NOT NULL,
    has_deleted_content boolean                  DEFAULT false    NOT NULL
);
