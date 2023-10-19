DROP TABLE IF EXISTS invoice;

CREATE TABLE invoice
(
    customer_id  INTEGER not null,
    invoice_id   INTEGER not null,
    invoice_data VARCHAR(128)
);

ALTER TABLE invoice
    add primary key (invoice_id);