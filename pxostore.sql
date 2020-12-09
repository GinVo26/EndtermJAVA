-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th12 09, 2020 lúc 03:48 PM
-- Phiên bản máy phục vụ: 10.4.14-MariaDB
-- Phiên bản PHP: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `pxostore`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `category`
--

CREATE TABLE `category` (
  `category_id` int(11) NOT NULL,
  `category_name` text COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `category`
--

INSERT INTO `category` (`category_id`, `category_name`) VALUES
(1, 'iPhone'),
(2, 'Samsung'),
(3, 'Oppo');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `category_chothue`
--

CREATE TABLE `category_chothue` (
  `category_chothue_id` int(11) NOT NULL,
  `category_chothue_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `category_chothue`
--

INSERT INTO `category_chothue` (`category_chothue_id`, `category_chothue_name`) VALUES
(1, 'iPad\r\n'),
(2, 'Samsung'),
(3, 'Huawei');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chothue`
--

CREATE TABLE `chothue` (
  `chothue_id` int(11) NOT NULL,
  `category_chothue_id` int(11) NOT NULL,
  `chothue_loainhadat` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `chothue_gia` double(255,0) DEFAULT NULL,
  `chothue_dientich` double(255,0) DEFAULT NULL,
  `chothue_diadiem` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `chothue_matien` double(255,0) DEFAULT NULL,
  `chothue_duongtruocnha` double(255,0) DEFAULT NULL,
  `chothue_huongnha` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `chothue_sotang` double(255,0) DEFAULT NULL,
  `chothue_sophong` int(255) DEFAULT NULL,
  `chothue_sotoilet` int(255) DEFAULT NULL,
  `chothue_tieude` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `chothue_mota` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `chothue_hinhanh` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `chothue_hoten` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `chothue_diachi` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `chothue_dienthoai` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `chothue_email` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `chothue_status` int(255) DEFAULT NULL,
  `chothue_ngaydang` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `chothue`
--

INSERT INTO `chothue` (`chothue_id`, `category_chothue_id`, `chothue_loainhadat`, `chothue_gia`, `chothue_dientich`, `chothue_diadiem`, `chothue_matien`, `chothue_duongtruocnha`, `chothue_huongnha`, `chothue_sotang`, `chothue_sophong`, `chothue_sotoilet`, `chothue_tieude`, `chothue_mota`, `chothue_hinhanh`, `chothue_hoten`, `chothue_diachi`, `chothue_dienthoai`, `chothue_email`, `chothue_status`, `chothue_ngaydang`) VALUES
(3, 1, 'Apple', 31, 1, 'Retina 12.9\"', 1, 1, 'iPadOS 13', 1, 1, 1, 'iPad Pro 12.9 inch Wifi Cellular 2020', 'iPad Pro 12.9 inch Wifi Cellular 2020', 'images/ipadpro1.png', '9720mAh', '123123', '2020', '123213', 1, '2020-05-18'),
(4, 2, 'Samsung', 19, 1, 'LCD 11\"', 1, 1, 'Android 10', 2, 1, 1, 'Samsung Galaxy Tab S7', 'Samsung Galaxy Tab S7', 'images/samsungtab1.png', '8000mAh', '1', '2020', '1', 1, '2020-08-18'),
(5, 3, 'Huawei', 8, 1, 'LCD 10.1\"', 1, 1, 'Android 9', 2, 1, 1, 'Huawei MediaPad M5 Lite', 'Huawei MediaPad M5 Lite', 'images/huaweitab1.png', '7500mAh', '1', '2019', '1', 1, '2019-11-18'),
(6, 3, 'Huawei', 5, 75, 'LCD 10.1\"', 1, 1, 'Android 9', 2, 1, 1, 'Huawei Mediapad T5 10.1 Inch', 'Huawei Mediapad T5 10.1 Inch', 'images/huaweitab2.png', '5100mAh', '1', '2018', '1', 1, '2018-12-18'),
(7, 2, 'Samsung', 18, 1, 'AMOLED 10.5\"', 1, 1, 'Android 10', 2, 1, 1, 'Samsung Galaxy Tab S6', 'Samsung Galaxy Tab S6', 'images/samsungtab2.png', '7040mAh', '1', '2019', '1', 1, '2019-12-18'),
(8, 1, 'Apple', 24, 1, 'Retina 10.9\"', 1, 1, 'iPadOS 14', 2, 1, 1, 'iPad Air 4 Wifi Cellular 2020', 'iPad Air 4 Wifi Cellular 2020', 'images/ipadpro2.png', '7600mAh\r\n', '1', '2020', '1', 1, '2020-09-18');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `product`
--

CREATE TABLE `product` (
  `product_id` int(11) NOT NULL,
  `category_id` int(11) DEFAULT NULL,
  `product_hinhthuc` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_image` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_price` double DEFAULT NULL,
  `product_description` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_sdt` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_dientich` double(255,0) DEFAULT NULL,
  `product_hoten` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_vitri` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_ngaydang` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `product`
--

INSERT INTO `product` (`product_id`, `category_id`, `product_hinhthuc`, `product_name`, `product_image`, `product_price`, `product_description`, `product_sdt`, `product_dientich`, `product_hoten`, `product_vitri`, `product_ngaydang`) VALUES
(1, 1, 'Apple', 'iPhone 12 Pro Max', 'images/ip12promax.jpg', 29.9, 'iPhone 12 Pro Max ( 128GB, 256GB, 512GB)', '3687mAh', 14, 'OLED, 6.7\"', '2020', '2020-11-03'),
(2, 1, 'Apple', 'iPhone 12 Pro', 'images/ip12pro.jpg', 25.9, 'iPhone 12 Pro ( 128GB, 256GB, 512GB)', '2815mAh', 14, 'OLED, 6.1\"', '2020', '2020-10-02'),
(3, 1, 'Apple', 'iPhone 11 Pro Max', 'images/ip11promax.jpg', 27.9, 'iPhone 11 Pro Max (128GB, 256GB, 512GB)', '3969mAh', 13, 'OLED, 6.5\"', '2020', '2019-10-05'),
(4, 2, 'Samsung', 'Samsung Galaxy Note 20 Ultra 5G', 'images/note20u5g.jpg', 32.9, 'Samsung Galaxy Note 20 Ultra 5G', 'Updating...', 11, 'AMOLED, 6.9\"', '2020', '2020-10-14'),
(5, 2, 'Samsung', 'Samsung Galaxy Z Fold 2', 'images/fold.jpg', 50, 'Samsung Galaxy Z Fold 2', '4500mAh', 11, 'AMOLED, 7.59\" & 6.23\"', '2020', '2020-09-16'),
(6, 2, 'Samsung', 'Samsung Galaxy Z Flip', 'images/zflip.jpg', 36, 'Samsung Galaxy Z Flip', '3300mAh', 11, 'AMOLED, 6.7\"', '2020', '2020-02-04'),
(7, 3, 'Oppo', 'Oppo Reno4', 'images/reno4.jpg', 8.2, 'Oppo Reno4', '40515mAh', 11, 'AMOLED, 6.4\"', '2020', '2020-07-12'),
(8, 3, 'Oppo', 'Oppo Reno4 Pro', 'images/reno4pro.jpg', 11.9, 'Oppo Reno4 Pro', '4000mAh', 11, 'AMOLED, 6.5\"', '2020', '2020-11-16'),
(9, 3, 'Oppo', 'Oppo A93', 'images/a93.jpg', 7.4, 'Oppo A93', '4000mAh', 11, 'AMOLED, 6.43\"', '2020', '2020-10-17'),
(33, 3, 'Oppo', 'Oppo Reno3 Pro', 'images/reno3pro.jpg', 8.9, 'Oppo Reno3 Pro', '4025mAh', 11, 'AMOLED, 6.4\"', '2020', '2020-04-16'),
(34, 2, 'Samsung', 'Samsung Galaxy M51', 'images/m51.jpg', 9.5, 'Samsung Galaxy M51', '7000mAh', 11, 'AMOLED, 6.7\"', '2020', '2020-11-10'),
(35, 2, 'Samsung', 'Samsung Galaxy S20+', 'images/s20+.jpg', 23.9, 'Samsung Galaxy S20+', '4500mAh', 11, 'AMOLED, 6.7\"', '2020', '2020-02-10'),
(36, 2, 'Samsung', 'Samsung Galaxy A71', 'images/a71.jpg', 8.9, 'Samsung Galaxy A71', '4500mAh', 11, 'AMOLED, 6.7\"', '2020', '2020-01-10'),
(37, 1, 'Apple', 'iPhone 12 Mini', 'images/ip12m.jpg', 21.9, 'iPhone 12 Mini 64GB', '2227mAh', 14, 'OLED, 5.4\"', '2020', '2020-11-10'),
(38, 1, 'Apple', 'iPhone 11 Pro', 'images/ip11pro.jpg', 24.9, 'iPhone 11 Pro (64GB)', '3046mAh', 13, 'OLED, 5.8\"', '2020', '2020-11-10');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `stt` bigint(20) NOT NULL,
  `hovaten` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_Name` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_Pass` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_Email` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_diachi` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_sdt` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_role` int(255) DEFAULT NULL,
  `user_kichhoat` int(255) NOT NULL,
  `user_code` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`stt`, `hovaten`, `user_Name`, `user_Pass`, `user_Email`, `user_diachi`, `user_sdt`, `user_role`, `user_kichhoat`, `user_code`) VALUES
(1, 'User1', 'hakiet', '123', 'naruto@gmail.com', NULL, NULL, 0, 1, ''),
(4, 'admin', 'admin', 'admin', 'phivo010120@gmail.com', '126 Điện Biên Phủ', '01216309942', 1, 1, ''),
(1544693423615, 'Th? Qu?n', 'tiano', 'asdasd1A*', 'user1@gmail.com', '123ansuong', '0123456982', 0, 0, '3f2163cb-4e48-4ee1-b7e8-ab9682ae9f16'),
(1544693423617, 'Thanh Phi', 'thanhphi', 'asdasd1A*', 'tianoevilgamer@gmail.com', '111abc', '0123654741', 0, 0, 'e4ed5aa0-a8d4-4ab2-b9ca-086e188ff436'),
(1544693423619, 'Ngoc Sinh', 'ngocsinh', 'asdasd1A*', 'asdasd4a111@gmail.com', '111abc', '0123456982', 0, 0, '3ee8606c-2b68-43a4-af00-01107ad6b038');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `xaydung_kientruc`
--

CREATE TABLE `xaydung_kientruc` (
  `xaydung_kientruc_ID` int(11) NOT NULL,
  `xaydung_kientruc_Image` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `xaydung_kientruc_tieude` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `xaydung_kientruc_noidung` text COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC;

--
-- Đang đổ dữ liệu cho bảng `xaydung_kientruc`
--

INSERT INTO `xaydung_kientruc` (`xaydung_kientruc_ID`, `xaydung_kientruc_Image`, `xaydung_kientruc_tieude`, `xaydung_kientruc_noidung`) VALUES
(1, 'images/banner1.png', 'Apple năm sau có gì HOT: iPhone 13, iOS 15, iPad, Macbook, Apple Watch,... có quá nhiều thứ để mong chờ', 'Khép lại một năm 2020 đầy biến động, nhưng những sản phẩm của Apple ra mắt vẫn chứng tỏ được sức hút của mình. Apple năm 2021 sẽ có những gì HOT khi có thêm những iPhone, iPad, Macbook, Apple Watch mới,... cùng điểm nhanh lại với mình trong bài viết này nhé.\r\nThế hệ iPhone 13 Series mới\r\nHệ điều hành iOS 15 sẽ có nhiều cả tiến vượt bậc\r\nCác thế hệ iPad tiếp theo sẽ được ra đời\r\nMacbook sử dụng chip M2\r\nApple Watch Series 7'),
(2, 'images/banner1.png', 'Chưa ra mắt nhưng OPPO Reno5 và Reno5 Pro đã được trang thương mại điện tử nhá hàng, tiết lộ thông số cấu hình chính', 'OPPO được cho là đang chuẩn bị để giới thiệu dòng sản phẩm Reno tiếp theo vào 10/12, dự kiến sẽ có ba mẫu gồm OPPO Reno5, Reno5 Pro và Reno5 Pro Plus. Trước thời điểm ra mắt chính thức, bộ đôi Reno5 và Reno5 Pro đã được trang thương mại điện tử JD nhá hàng, tiết lộ một vài thông số cấu hình chính.\r\nTheo hình ảnh trên trang JD, OPPO Reno5 và Reno5 Pro có thiết kế mặt sau gần như giống nhau, đều có màu Gradient. Phiên bản tiêu chuẩn có các phiên bản màu như Đen, Xanh lam và Trắng. Các phiên bản màu của Reno5 Pro được gọi khá hoa mỹ, bao gồm Galaxy into a dream, Aurora Blue và Moonlit night.\r\nĐến với mặt trước, dù cả hai thiết bị đều có một lỗ bấm nhỏ ở góc màn hình chứa camera selfie. Nhưng Reno5 bản tiêu chuẩn lại đi kèm màn hình OLED 6.43 inch phẳng, trong khi Reno5 Pro sở hữu màn hình OLED 6.55 inch cong. \r\nTrên JD, cả Reno5 và Reno5 Pro đều được nhá hàng với hai phiên bản bộ nhớ gồm RAM 8 GB + ROM 128 GB và RAM 12 GB + ROM 256 GB. Hai thiết bị đều sẽ có camera chính 64 MP, đi kèm công nghệ sạc nhanh 65 W.\r\n\r\nBạn thử đoán giá Reno5 và Reno5 Pro xem?'),
(3, 'images/banner1.png', 'Apple có thể sẽ phải trang bị lại củ sạc cho iPhone 12 series vì lý do bảo vệ môi trường chưa thực sự thuyết phục', 'Apple đã thu hút được sự chú ý của đông đảo các fans khi thực hiện loại bỏ củ sạc và tai nghe EarPods bên trong hộp của các iPhone mới. Công ty tuyên bố làm như vậy là giúp bảo vệ môi trường. Tuy nhiên, hiện các nhà chức trách Brazil đã hỏi Apple về lý do tại sao iPhone mới được bán ra mà không có bộ sạc.\r\nApple đã phản hồi và thông báo rằng trên thế giới có rất nhiều thiết bị, bộ sạc mới chưa được sử dụng. Do đó, Apple đã loại bỏ bộ sạc để giúp giảm lượng khí thải carbon và chất thải điện tử.\r\n\r\nTuy nhiên, có vẻ như các nhà chức trách Brazil không cảm thấy thuyết phục. Phản hồi của họ như sau: “Apple không chứng minh rằng việc sử dụng bộ sạc cũ không ảnh hưởng đến quá trình sạc và sự an toàn của quá trình sạc, cũng như việc sử dụng phụ kiện của bên thứ ba sẽ bị từ chối bảo hành trong trường hợp thiết bị hư hỏng do bộ sạc không chính hãng gây ra.”\r\n\r\nCác nhà chức trách Brazil đồng ý rằng Apple đã thông báo cho khách hàng về việc loại bỏ bộ sạc ra khỏi hộp sản phẩm. Tuy nhiên, công ty không chứng minh được các lợi ích môi trường khi thực hiện điều trên. Hơn nữa, nếu thực sự vì bảo vệ môi trường, Apple hoàn toàn có thể bán các thiết bị với bộ sạc mới đi kèm, đồng thời có chính sách thu gom các bộ sạc cũ và tái chế chúng.\r\n\r\nTheo Procon-SP, củ sạc được xem như một phụ kiện không thể thiếu đối với việc sử dụng sản phẩm. Nếu như Apple vẫn không thể thuyết phục được các nhà chức trách Brazil thì hoàn toàn có khả năng trong tương lai iPhone 12 bán ra tại quốc gia này phải đi kèm củ sạc trong hộp.'),
(4, 'images/banner1.png', 'Bảng xếp hạng AnTuTu tháng 11/2020: Huawei Mate 40 Pro Plus là flagship mạnh nhất, bạn đoán hạng mục tầm trung thuộc về model nào?\r\n', 'AnTuTu đã công bố bảng xếp hạng các smartphone hàng đầu (flagship) và tầm trung có hiệu suất mạnh nhất trong tháng 11/2020, và danh sách này dường như không có nhiều biến động so với tháng 10.\r\nHuawei Mate 40 Pro Plus và Mate 40 Pro dùng chip Kirin 9000 hoàn toàn mới vẫn dẫn đầu bảng xếp hạng AnTuTu tháng 11/2020. Vị trí thứ ba hiện thuộc về Xiaomi Mi 10 Extreme Commemorative Edition, với điểm số trung bình được cải thiện một chút so với danh sách trước đó, vượt qua Redmi K30S Extreme Edition và Vivo X50 Pro Plus.\r\nVị trí thứ 4 và 5 ở hạng mục smartphone hàng đầu lần lượt được iQOO 5 và 5 Pro của Vivo đảm nhận. Điều thú vị là ASUS ROG Phone 3 đã mất hai vị trí, giờ tụt xuống tận hạng 9.\r\n\r\nNhìn chung thứ hạng tầm trung cũng không có nhiều khác biệt so với kỳ trước, Redmi 10X 5G dùng chip MediaTek Dimensity 820 chiếm vị trí đầu tiên với điểm số trung bình là 404.089, trong khi phiên bản Redmi 10X Pro 5G tụt xuống hạng ba (398.227 điểm).\r\n\r\nHuawei Nova 7 Pro là cái tên về nhì mới, song hành cùng chip Kirin 985 với điểm số trung bình là 401.091. Trên thị trường không có nhiều smartphone được trang bị chip này khi xét về số lượng sản xuất hạn chế từ HiSilicon (thuộc sở hữu của Huawei).\r\n\r\nBạn nhận xét thế nào về bảng xếp hạng AnTuTu tháng 11/2020?'),
(5, 'images/banner1.png', 'Cách cập nhật iOS 14.3 Beta 3 để tăng sự ổn định và nhiều tính năng mới\r\n', 'Apple đã chính thức phát hành bản cập nhật iOS 14.3 Beta 3 đến người dùng và các nhà phát triển. Với bản cập nhật này, Apple tiếp tục khắc phục các lỗi còn tồn đọng và tập trung cải thiện hiệu năng iPhone, iPad với iPadOS 14.3 Beta 3. Sau đây là cách cập nhật lên iOS 14.3 Beta 3 có nhiều tính năng mới.');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`category_id`) USING BTREE;

--
-- Chỉ mục cho bảng `category_chothue`
--
ALTER TABLE `category_chothue`
  ADD PRIMARY KEY (`category_chothue_id`) USING BTREE;

--
-- Chỉ mục cho bảng `chothue`
--
ALTER TABLE `chothue`
  ADD PRIMARY KEY (`chothue_id`) USING BTREE;

--
-- Chỉ mục cho bảng `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`product_id`) USING BTREE;

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`stt`,`user_kichhoat`) USING BTREE;

--
-- Chỉ mục cho bảng `xaydung_kientruc`
--
ALTER TABLE `xaydung_kientruc`
  ADD PRIMARY KEY (`xaydung_kientruc_ID`) USING BTREE;

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `category`
--
ALTER TABLE `category`
  MODIFY `category_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=992994822;

--
-- AUTO_INCREMENT cho bảng `category_chothue`
--
ALTER TABLE `category_chothue`
  MODIFY `category_chothue_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT cho bảng `chothue`
--
ALTER TABLE `chothue`
  MODIFY `chothue_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT cho bảng `product`
--
ALTER TABLE `product`
  MODIFY `product_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT cho bảng `users`
--
ALTER TABLE `users`
  MODIFY `stt` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1544693423620;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
