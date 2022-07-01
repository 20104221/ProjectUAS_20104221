/*
SQLyog Community v13.1.7 (64 bit)
MySQL - 10.4.18-MariaDB : Database - mahasiswa
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mahasiswa` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `mahasiswa`;

/*Table structure for table `dosen` */

DROP TABLE IF EXISTS `dosen`;

CREATE TABLE `dosen` (
  `nidn` varchar(16) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `alamat` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `tlp` varchar(12) DEFAULT NULL,
  `bidangmengajar` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`nidn`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `dosen` */

insert  into `dosen`(`nidn`,`nama`,`alamat`,`email`,`tlp`,`bidangmengajar`) values 
('0820128802','Ir. I Made Ngurah Desnanjaya, M.T.','Denpasar','desnanjaya15@gmail.com','085333067180','SK'),
('0828098102','I Wayan Moglog Junior, S.E., M.M.','Karangasem','yanmoglog10@gmail.com','081803144079','KAB');
('0829151001','I Nyoman Cemplon, S.E., M.M.','Klungkung','icemplon01@gmail.com','082177564321','KAB');

/*Table structure for table `mahasiswa` */

DROP TABLE IF EXISTS `mahasiswa`;

CREATE TABLE `mahasiswa` (
  `Nim` varchar(12) NOT NULL,
  `Nama` varchar(100) DEFAULT NULL,
  `Jk` varchar(2) DEFAULT NULL,
  `tgl` date DEFAULT NULL,
  `jurusan` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Nim`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `mahasiswa` */

insert  into `mahasiswa`(`Nim`,`Nama`,`Jk`,`tgl`,`jurusan`) values 
('20101030','Ni Putu Trisna Darma Yanti','P','2002-06-25','MTI'),
('20103390','Pande Wayan Agus Wijaya','L','2001-10-15','KAB'),
('20109391','I Gede Dagdag Pan Dolar','L','2001-01-01','SK'),
('19201030','Ni Ketut Garing Jelita','P','2000-12-12','KAB');

/*Table structure for table `mk` */

DROP TABLE IF EXISTS `mk`;

CREATE TABLE `mk` (
  `kode_mk` varchar(4) NOT NULL,
  `nama_mk` varchar(100) DEFAULT NULL,
  `semester_mk` varchar(5) DEFAULT NULL,
  `sks` varchar(5) DEFAULT NULL,
  `tipe` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`kode_mk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `mk` */

insert  into `mk`(`kode_mk`,`nama_mk`,`semester_mk`,`sks`,`tipe`) values 
('012','Akutansi Biaya','2','3','Wajib'),
('014','Perpajakan','1','2','Wajib');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
