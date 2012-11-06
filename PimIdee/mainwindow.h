#ifndef MAINWINDOW_H
#define MAINWINDOW_H
 #include <QFileDialog>
#include <QMainWindow>

namespace Ui {
    class MainWindow;
}

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    explicit MainWindow(QWidget *parent = 0);
    ~MainWindow();

private:
    Ui::MainWindow *ui;

private slots:
    void importData(void);
    void exportData(void);
    void beenden();
};

#endif // MAINWINDOW_H
