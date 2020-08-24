INSERT INTO `tiers` (`id`, `code_postal`, `libelle`, `numero_telephone`, `pays`, `rue`, `type_tiers`) VALUES ('1', '94555', 'CLIENT', '0102030405', 'FRANCE', 'rue tu tiran', 'CLIENT');
INSERT INTO `tiers` (`id`, `code_postal`, `libelle`, `numero_telephone`, `pays`, `rue`, `type_tiers`) VALUES ('2', '12345', 'EMETTEUR', '0102030405', 'FRANCE', 'Une autre rue', 'EMETTEUR');

INSERT INTO `emetteur` (`logo`, `site_internet`, `code_emetteur`) VALUES ('c://images/images.jpg', 'www.site.fr', '2');
INSERT INTO `client` (`id`) VALUES ('1');

INSERT INTO `commentaire` (`id`, `contenu`) VALUES ('1', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.');

INSERT INTO `facture` (`id_facture`, `date_echeance`, `date_facturation`, `statut_facture`, `client_id`, `commentaire_id`, `emetteur_code_emetteur`) VALUES ('1', '2020-08-16 00:00:00.000000', '2020-08-19 00:00:00.000000', 'OUVERT', '1', '1', '2');

INSERT INTO `facture_ligne` (`id_facture_ligne`, `designation_prestation`, `prix_unitaireht`, `quantite`, `reduction`, `tva`, `facture_id_facture`) VALUES ('1', 'Prestation 1', '20', '5', '0', '5.5', '1'), ('2', 'Prestation 2', '10', '4', '0', '5.5', '1');



