DROP TABLE public.charter_flight;
DROP TABLE public.charter_flight_detail;
DROP SEQUENCE charter_flight_detail_id_seq;
DROP SEQUENCE charter_flight_id_seq;

CREATE SEQUENCE charter_flight_detail_id_seq;

CREATE SEQUENCE charter_flight_id_seq;

CREATE TABLE public.charter_flight
(
  charter_flight_id bigserial primary key,
  charter_flight_comp_id character varying(25) NOT NULL,
  departure_airport character varying(5),
  arrival_airport character varying(5),
  num_of_nights smallint NOT NULL DEFAULT(1),
  departure_date date NOT NULL DEFAULT now(),
  flight_trip_type character(1) NOT NULL DEFAULT 'I'::bpchar,
  flight_outbound_id character varying(20),
  flight_inbound_id character varying(20),
  base_price numeric(16,4) NOT NULL DEFAULT(0),
  us_tax numeric(16,4) NOT NULL DEFAULT(0),
  foreign_tax numeric(16,4) NOT NULL DEFAULT(0),
  airport_fee numeric(16,4) NOT NULL DEFAULT(0),
  total_tax numeric(16,4) NOT NULL DEFAULT(0),
  occupancy_based_price numeric(16,4) NOT NULL DEFAULT(0),
  base_cost_charter numeric(16,4) NOT NULL DEFAULT(0),
  base_cost_pkg numeric(16,4) NOT NULL DEFAULT(0), 
  data_loader_status character(1) NOT NULL DEFAULT 'I'::bpchar,
  status character(1) NOT NULL DEFAULT 'A'::bpchar,
  created_by character varying(50),
  modified_by character varying(50),
  created_ts timestamp without time zone NOT NULL DEFAULT now(),
  modified_ts timestamp without time zone NOT NULL DEFAULT now(),
  CONSTRAINT charter_flight_data_load_status_check CHECK (status = ANY (ARRAY['A'::bpchar, 'I'::bpchar, 'D'::bpchar])),
  CONSTRAINT charter_flight_status_check CHECK (status = ANY (ARRAY['A'::bpchar, 'D'::bpchar]))
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.charter_flight
  OWNER TO postgres;
  

CREATE TABLE public.charter_flight_detail
(
  charter_flight_detail_id bigserial primary key,  
  charter_flight_comp_id character varying(25) NOT NULL,
  flight_id_key character varying(20) NOT NULL,
  direction character(1) NOT NULL DEFAULT 'O'::bpchar,
  departure_airport character varying(5),
  arrival_airport character varying(5),
  departure_date timestamp with time zone NOT NULL,
  arrival_date timestamp with time zone NOT NULL,
  airline_code character varying(5) NOT NULL,
  rotation smallint NOT NULL DEFAULT(1),
  stops smallint NOT NULL DEFAULT(0),
  flight_air_time integer NOT NULL DEFAULT(0),
  leg_sequence_number smallint NOT NULL DEFAULT(0),
  flight_number character varying(5) NOT NULL,
  class_of_service character varying(5),
  available_seats smallint NOT NULL DEFAULT(0),
  data_loader_status character(1) NOT NULL DEFAULT 'I'::bpchar,
  status character(1) NOT NULL DEFAULT 'A'::bpchar,
  created_by character varying(50),
  modified_by character varying(50),
  created_ts timestamp without time zone NOT NULL DEFAULT now(),
  modified_ts timestamp without time zone NOT NULL DEFAULT now(),
  CONSTRAINT charter_flight_detail_status_check CHECK (status = ANY (ARRAY['A'::bpchar, 'D'::bpchar])),
  CONSTRAINT charter_flight_detail_data_load_status_check CHECK (status = ANY (ARRAY['A'::bpchar, 'I'::bpchar,'D'::bpchar])),
  CONSTRAINT charter_flight_detail_direction_check CHECK (direction = ANY (ARRAY['O'::bpchar, 'I'::bpchar]))
  )
WITH (
  OIDS=FALSE
);
ALTER TABLE public.charter_flight_detail
  OWNER TO postgres;
