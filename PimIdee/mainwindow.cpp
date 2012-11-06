#include "mainwindow.h"
#include "ui_mainwindow.h"

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);

    this->setWindowTitle("BetterLook");
    for(int i=0;i<12;i++){
        ui->listWidget->addItem("Muster Hans");
        ui->listWidget->addItem("Beispiel Anna");
    }
    ui->radioButton->setChecked(true);
    ui->comboBox->addItem("Privat");
    ui->comboBox->addItem("Geschäftlich");
    connect(ui->actionExportieren,SIGNAL(triggered()),this,SLOT(exportData()));
    connect(ui->actionImportieren,SIGNAL(triggered()),this,SLOT(importData()));
    connect(ui->actionBeenden_2,SIGNAL(triggered()),this,SLOT(beenden()));
}

MainWindow::~MainWindow()
{
    delete ui;
}
void MainWindow::exportData()
{
    QFileDialog fl;
    fl.exec();
}
void MainWindow::importData()
{
    QFileDialog fl;
    fl.exec();
}void MainWindow::beenden()
{
    this->close();
}
