/*
 * trungpvpp02786
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import control.mainUiControl;
import helper.RoundedCornerBorder;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author capoo
 */
public final class mainUI extends javax.swing.JFrame {

    /**
     * Creates new form menuu
     */
    mainUiControl mainUI;

    public mainUI() {
        setUndecorated(true);
        initComponents();
        mainUI = new mainUiControl(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jplMenuCover = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                int[] start = {255, 233, 219};
                Color startColor = new Color(start[0], start[1], start[2]);

                Color endColor = new Color(255, 213, 39);
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gradient = new GradientPaint(
                    0, 0, startColor,
                    0, getHeight(), endColor
                );
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        jPanel2 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                int[] start = {255, 255, 255};
                Color startColor = new Color(start[0], start[1], start[2]);

                Color endColor = new Color(255,235,212);
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gradient = new GradientPaint(
                    0, 0, startColor,
                    0, getHeight(), endColor
                );
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        jLabel3 = new javax.swing.JLabel();
        lblCloseMenu = new javax.swing.JLabel();
        lblOpenMenu1 = new javax.swing.JLabel();
        BtnQuanLyVoucher = new javax.swing.JLabel();
        BtnQuanLyHoiVien = new javax.swing.JLabel();
        BtnQuanLyNhanVien = new javax.swing.JLabel();
        menuBarSeparator = new javax.swing.JSeparator();
        BtnDangXuat = new javax.swing.JLabel();
        BtnQuanLyMon = new javax.swing.JLabel();
        jpllMenuBar = new javax.swing.JPanel();
        absoluteWrapper = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton(){
            @Override protected void paintComponent(Graphics g) {
                if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setPaint(getBackground());
                    g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
                        0, 0, getWidth() - 1, getHeight() - 1));
                g2.dispose();
            } super.paintComponent(g);}
            @Override public void updateUI() {
                super.updateUI();
                setOpaque(false);

            }
        };
        lblTime = new javax.swing.JLabel();
        BtnHoaDon = new javax.swing.JButton(){
            @Override protected void paintComponent(Graphics g) {
                if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setPaint(getBackground());
                    g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
                        0, 0, getWidth() - 1, getHeight() - 1));
                g2.dispose();
            } super.paintComponent(g);}
            @Override public void updateUI() {
                super.updateUI();
                setOpaque(false);

            }
        };
        BtnDatBan = new javax.swing.JButton(){
            @Override protected void paintComponent(Graphics g) {
                if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setPaint(getBackground());
                    g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
                        0, 0, getWidth() - 1, getHeight() - 1));
                g2.dispose();
            } super.paintComponent(g);}
            @Override public void updateUI() {
                super.updateUI();
                setOpaque(false);

            }
        };
        jSeparator1 = new javax.swing.JSeparator();
        statusWrapper = new javax.swing.JPanel();
        loadingIndicator = new javax.swing.JLabel();
        cardDisplayWrapper = new javax.swing.JPanel();
        panelDisplay = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jplMenuCover.setBackground(new java.awt.Color(255, 204, 204));
        jplMenuCover.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jplMenuCover.setPreferredSize(new java.awt.Dimension(190, 590));
        jplMenuCover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jplMenuCoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jplMenuCoverMouseExited(evt);
            }
        });
        jplMenuCover.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setDoubleBuffered(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 8, -1, 83));

        lblCloseMenu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCloseMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCloseMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thoat 24x24.png"))); // NOI18N
        lblCloseMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMenuMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblCloseMenuMouseReleased(evt);
            }
        });
        jPanel2.add(lblCloseMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 2, 30, 30));

        lblOpenMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        lblOpenMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOpenMenu1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblOpenMenu1MouseReleased(evt);
            }
        });
        jPanel2.add(lblOpenMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        BtnQuanLyVoucher.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnQuanLyVoucher.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnQuanLyVoucher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rouble.png"))); // NOI18N
        BtnQuanLyVoucher.setText("     Quản Lý Voucher");
        BtnQuanLyVoucher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnQuanLyVoucherMouseReleased(evt);
            }
        });
        jPanel2.add(BtnQuanLyVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, 30));

        BtnQuanLyHoiVien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnQuanLyHoiVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnQuanLyHoiVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Unknown person.png"))); // NOI18N
        BtnQuanLyHoiVien.setText("     Quản Lý Hội Viên");
        BtnQuanLyHoiVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnQuanLyHoiVienMouseReleased(evt);
            }
        });
        jPanel2.add(BtnQuanLyHoiVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 180, 30));

        jplMenuCover.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 240));

        BtnQuanLyNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        BtnQuanLyNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnQuanLyNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnQuanLyNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Nhanvien 24.png"))); // NOI18N
        BtnQuanLyNhanVien.setText("     Quản Lý Nhân Viên");
        BtnQuanLyNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnQuanLyNhanVienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnQuanLyNhanVienMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnQuanLyNhanVienMouseReleased(evt);
            }
        });
        jplMenuCover.add(BtnQuanLyNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 180, 30));

        menuBarSeparator.setForeground(new java.awt.Color(153, 153, 153));
        jplMenuCover.add(menuBarSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 452, 210, 10));

        BtnDangXuat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/đăng xuất 24.png"))); // NOI18N
        BtnDangXuat.setText("     Đăng Xuất");
        BtnDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnDangXuatMouseReleased(evt);
            }
        });
        jplMenuCover.add(BtnDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 180, 30));

        BtnQuanLyMon.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnQuanLyMon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnQuanLyMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Remove from basket.png"))); // NOI18N
        BtnQuanLyMon.setText("     Quản Lý Món Ăn");
        BtnQuanLyMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnQuanLyMonMouseReleased(evt);
            }
        });
        jplMenuCover.add(BtnQuanLyMon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 180, 30));

        jpllMenuBar.setBackground(new java.awt.Color(255, 255, 255));
        jpllMenuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        absoluteWrapper.setBackground(new java.awt.Color(255, 255, 255));
        absoluteWrapper.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        absoluteWrapper.setForeground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-close-window-48.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minimize-window-48.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnOrder.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        btnOrder.setForeground(new java.awt.Color(102, 102, 102));
        btnOrder.setText("Order");
        btnOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOrderMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnOrderMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnOrderMouseReleased(evt);
            }
        });
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        lblTime.setFont(new java.awt.Font("Herculanum", 0, 13)); // NOI18N
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTime.setText("1-1-2000 | 00:00:00 AM");

        BtnHoaDon.setBackground(new java.awt.Color(255, 255, 255));
        BtnHoaDon.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        BtnHoaDon.setForeground(new java.awt.Color(102, 102, 102));
        BtnHoaDon.setText("Hoá Đơn");
        BtnHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnHoaDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnHoaDonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnHoaDonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnHoaDonMouseReleased(evt);
            }
        });
        BtnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHoaDonActionPerformed(evt);
            }
        });

        BtnDatBan.setBackground(new java.awt.Color(255, 255, 255));
        BtnDatBan.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        BtnDatBan.setForeground(new java.awt.Color(102, 102, 102));
        BtnDatBan.setText("Đặt Bàn");
        BtnDatBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnDatBanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnDatBanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnDatBanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnDatBanMouseReleased(evt);
            }
        });
        BtnDatBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDatBanActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        statusWrapper.setBackground(new java.awt.Color(255, 255, 255));

        loadingIndicator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Accept.png"))); // NOI18N
        loadingIndicator.setText("Updated");
        loadingIndicator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loadingIndicatorMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout statusWrapperLayout = new javax.swing.GroupLayout(statusWrapper);
        statusWrapper.setLayout(statusWrapperLayout);
        statusWrapperLayout.setHorizontalGroup(
            statusWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusWrapperLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(loadingIndicator, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addContainerGap())
        );
        statusWrapperLayout.setVerticalGroup(
            statusWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusWrapperLayout.createSequentialGroup()
                .addComponent(loadingIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout absoluteWrapperLayout = new javax.swing.GroupLayout(absoluteWrapper);
        absoluteWrapper.setLayout(absoluteWrapperLayout);
        absoluteWrapperLayout.setHorizontalGroup(
            absoluteWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(absoluteWrapperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusWrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addComponent(BtnDatBan, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        absoluteWrapperLayout.setVerticalGroup(
            absoluteWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, absoluteWrapperLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(absoluteWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnHoaDon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDatBan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(absoluteWrapperLayout.createSequentialGroup()
                .addGroup(absoluteWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusWrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        cardDisplayWrapper.setBackground(new java.awt.Color(255, 153, 153));
        cardDisplayWrapper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cardDisplayWrapperMouseEntered(evt);
            }
        });

        panelDisplay.setBackground(new java.awt.Color(255, 255, 255));
        panelDisplay.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelDisplay.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout cardDisplayWrapperLayout = new javax.swing.GroupLayout(cardDisplayWrapper);
        cardDisplayWrapper.setLayout(cardDisplayWrapperLayout);
        cardDisplayWrapperLayout.setHorizontalGroup(
            cardDisplayWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cardDisplayWrapperLayout.setVerticalGroup(
            cardDisplayWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(absoluteWrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jplMenuCover, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpllMenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cardDisplayWrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(absoluteWrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jplMenuCover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpllMenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardDisplayWrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMenuMouseClicked

    }//GEN-LAST:event_lblCloseMenuMouseClicked

    private void BtnQuanLyNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnQuanLyNhanVienMouseClicked
//        cardTrangChu.setVisible(true);
//        cardDisplayWrapper.setVisible(true);
    }//GEN-LAST:event_BtnQuanLyNhanVienMouseClicked

    private void lblCloseMenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMenuMouseReleased
        // TODO add your handling code here:
        mainUI.closeMenu();
    }//GEN-LAST:event_lblCloseMenuMouseReleased

    private void lblOpenMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpenMenu1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblOpenMenu1MouseClicked

    private void lblOpenMenu1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpenMenu1MouseReleased
        // TODO add your handling code here:
        mainUI.openMenu();

    }//GEN-LAST:event_lblOpenMenu1MouseReleased

    private void BtnQuanLyNhanVienMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnQuanLyNhanVienMouseReleased
        // TODO add your handling code here:
        mainUI.closeMenu();
        mainUI.QuanLyNhanVien();
    }//GEN-LAST:event_BtnQuanLyNhanVienMouseReleased

    private void jplMenuCoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jplMenuCoverMouseExited
        // TODO add your handling code here:
        System.out.println("mouse exited");

    }//GEN-LAST:event_jplMenuCoverMouseExited

    private void jplMenuCoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jplMenuCoverMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_jplMenuCoverMouseEntered

    private void BtnQuanLyNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnQuanLyNhanVienMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_BtnQuanLyNhanVienMouseEntered

    private void cardDisplayWrapperMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardDisplayWrapperMouseEntered
        // TODO add your handling code here:
        mainUI.closeMenu();
    }//GEN-LAST:event_cardDisplayWrapperMouseEntered

    private void btnOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderMouseEntered
        // TODO add your handling code here:
        System.out.println("entered");
        btnOrder.setForeground(Color.BLACK);
        btnOrder.setBorder(new RoundedCornerBorder(Color.BLACK));
        //        javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE;
    }//GEN-LAST:event_btnOrderMouseEntered

    private void btnOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderMouseExited
        // TODO add your handling code here:
        System.out.println("exited");
        btnOrder.setForeground(Color.darkGray);
        btnOrder.setBorder(new RoundedCornerBorder());
    }//GEN-LAST:event_btnOrderMouseExited

    private void btnOrderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderMousePressed
        // TODO add your handling code here:
        btnOrder.setForeground(Color.red);
        btnOrder.setBorder(new RoundedCornerBorder(Color.red));
    }//GEN-LAST:event_btnOrderMousePressed

    private void btnOrderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderMouseReleased
        // TODO add your handling code here:
        btnOrder.setForeground(Color.BLACK);
        btnOrder.setBorder(new RoundedCornerBorder(Color.BLACK));
    }//GEN-LAST:event_btnOrderMouseReleased

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        mainUI.closeMenu();
        mainUI.Order(this);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void BtnHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHoaDonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnHoaDonMouseEntered

    private void BtnHoaDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHoaDonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnHoaDonMouseExited

    private void BtnHoaDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHoaDonMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnHoaDonMousePressed

    private void BtnHoaDonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHoaDonMouseReleased
        // TODO add your handling code here:
        mainUI.closeMenu();
    }//GEN-LAST:event_BtnHoaDonMouseReleased

    private void BtnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHoaDonActionPerformed
        // TODO add your handling code here:
        mainUI.closeMenu();
        mainUI.HoaDon();
    }//GEN-LAST:event_BtnHoaDonActionPerformed

    private void BtnDatBanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDatBanMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnDatBanMouseEntered

    private void BtnDatBanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDatBanMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnDatBanMouseExited

    private void BtnDatBanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDatBanMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnDatBanMousePressed

    private void BtnDatBanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDatBanMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnDatBanMouseReleased

    private void BtnDatBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDatBanActionPerformed
        // TODO add your handling code here:
        mainUI.closeMenu();
        mainUI.DatBan();
    }//GEN-LAST:event_BtnDatBanActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mainUI.closeMenu();
        mainUI.DangXuat();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        mainUI.closeMenu();
        mainUI.minimize(this);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BtnQuanLyHoiVienMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnQuanLyHoiVienMouseReleased
        // TODO add your handling code here:
        mainUI.closeMenu();
        mainUI.QuanLyHoiVien();
    }//GEN-LAST:event_BtnQuanLyHoiVienMouseReleased

    private void BtnQuanLyMonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnQuanLyMonMouseReleased
        // TODO add your handling code here:
        mainUI.closeMenu();
        mainUI.QuanLyMon();
    }//GEN-LAST:event_BtnQuanLyMonMouseReleased

    private void BtnQuanLyVoucherMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnQuanLyVoucherMouseReleased
        // TODO add your handling code here:
        mainUI.closeMenu();
        mainUI.QuanLyVoucher();
    }//GEN-LAST:event_BtnQuanLyVoucherMouseReleased

    private void BtnDangXuatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDangXuatMouseReleased
        // TODO add your handling code here:
        mainUI.closeMenu();
        mainUI.DangXuat();
    }//GEN-LAST:event_BtnDangXuatMouseReleased

    private void loadingIndicatorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadingIndicatorMouseReleased
        // TODO add your handling code here:
        mainUI.refreshCon();
    }//GEN-LAST:event_loadingIndicatorMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel BtnDangXuat;
    public static javax.swing.JButton BtnDatBan;
    public static javax.swing.JButton BtnHoaDon;
    public static javax.swing.JLabel BtnQuanLyHoiVien;
    public static javax.swing.JLabel BtnQuanLyMon;
    public static javax.swing.JLabel BtnQuanLyNhanVien;
    public static javax.swing.JLabel BtnQuanLyVoucher;
    private javax.swing.JPanel absoluteWrapper;
    public static javax.swing.JButton btnOrder;
    public static javax.swing.JPanel cardDisplayWrapper;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JPanel jplMenuCover;
    private javax.swing.JPanel jpllMenuBar;
    private javax.swing.JLabel lblCloseMenu;
    private javax.swing.JLabel lblOpenMenu1;
    public static javax.swing.JLabel lblTime;
    public static javax.swing.JLabel loadingIndicator;
    private javax.swing.JSeparator menuBarSeparator;
    public static javax.swing.JPanel panelDisplay;
    public static javax.swing.JPanel statusWrapper;
    // End of variables declaration//GEN-END:variables
}
