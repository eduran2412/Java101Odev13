import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz Ay : ");
        month = input.nextInt();


        // if - else ile
        if (month == 1) {
            System.out.print("Doğduğunuz Gün : ");
            day = input.nextInt();
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.println("Oğlak Burcu");
                } else {
                    System.out.println("Kova Burcu");
                }
            } else {
                System.out.println("Geçersiz Bir Gün Girdiniz");
            }
        } else if (month == 2) {
            System.out.print("Doğduğunuz Gün : ");
            day = input.nextInt();
            if (day >= 1 && day <= 28) {
                if (day <= 19) {
                    System.out.println("Kova Burcu");
                } else {
                    System.out.println("Balık Burcu");
                }
            } else {
                System.out.println("Geçersiz Bir Gün Girdiniz");
            }
        } else if (month == 3) {
            System.out.print("Doğduğunuz Gün : ");
            day = input.nextInt();
            if (day >= 1 && day <= 31) {
                if (day <= 20) {
                    System.out.println("Balık Burcu");
                } else {
                    System.out.println("Koç Burcu");
                }
            } else {
                System.out.println("Geçersiz Bir Gün Girdiniz");
            }
        } else if (month == 4) {
            System.out.print("Doğduğunuz Gün : ");
            day = input.nextInt();
            if (day >= 1 && day <= 30) {
                if (day <= 20) {
                    System.out.println("koç Burcu");
                } else {
                    System.out.println("Boğa Burcu");
                }
            } else {
                System.out.println("Geçersiz Bir Gün Girdiniz");
            }
        } else if (month == 5) {
            System.out.print("Doğduğunuz Gün : ");
            day = input.nextInt();
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.println("Boğa Burcu");
                } else {
                    System.out.println("İkizler Burcu");
                }
            } else {
                System.out.println("Geçersiz Bir Gün Girdiniz");
            }
        } else if (month == 6) {
            System.out.print("Doğduğunuz Gün : ");
            day = input.nextInt();
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    System.out.println("İkizler Burcu");
                } else {
                    System.out.println("Yengeç Burcu");
                }
            } else {
                System.out.println("Geçersiz Bir Gün Girdiniz");
            }
        } else if (month == 7) {
            System.out.print("Doğduğunuz Gün : ");
            day = input.nextInt();
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    System.out.println("Yengeç Burcu");
                } else {
                    System.out.println("Aslan Burcu");
                }
            } else {
                System.out.println("Geçersiz Bir Gün Girdiniz");
            }
        } else if (month == 8) {
            System.out.print("Doğduğunuz Gün : ");
            day = input.nextInt();
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    System.out.println("Aslan Burcu");
                } else {
                    System.out.println("Başak Burcu");
                }
            } else {
                System.out.println("Geçersiz Bir Gün Girdiniz");
            }
        } else if (month == 9) {
            System.out.print("Doğduğunuz Gün : ");
            day = input.nextInt();
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    System.out.println("Başak Burcu");
                } else {
                    System.out.println("Terazi Burcu");
                }
            } else {
                System.out.println("Geçersiz Bir Gün Girdiniz");
            }
        } else if (month == 10) {
            System.out.print("Doğduğunuz Gün : ");
            day = input.nextInt();
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    System.out.println("Terazi Burcu");
                } else {
                    System.out.println("Akrep Burcu");
                }
            } else {
                System.out.println("Geçersiz Bir Gün Girdiniz");
            }
        } else if (month == 11) {
            System.out.print("Doğduğunuz Gün : ");
            day = input.nextInt();
            if (day >= 1 && day <= 30) {
                if (day <= 21) {
                    System.out.println("Akrep Burcu");
                } else {
                    System.out.println("Yay Burcu");
                }
            } else {
                System.out.println("Geçersiz Bir Gün Girdiniz");
            }
        } else if (month == 12) {
            System.out.print("Doğduğunuz Gün : ");
            day = input.nextInt();
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.println("Yay Burcu");
                } else {
                    System.out.println("Oğlak Burcu");
                }
            } else {
                System.out.println("Geçersiz Bir Gün Girdiniz");
            }
        } else {
            System.out.println("Geçersiz Bir Ay Girdiniz!");
        }


//---------------------------------------------------------------------------------------------------------------------
        // switch case ile

    /*
        System.out.print("Doğduğunuz Ay : ");
        month = input.nextInt();
        System.out.print("Doğduğunuz Gün : ");
        day = input.nextInt();

            switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        System.out.println("Oğlak Burcu");
                    } else {
                        System.out.println("Kova Burcu");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                }
                break;
            case 2:
                if (day >= 1 && day <= 28) {
                    if (day <= 19) {
                        System.out.println("Kova Burcu");
                    } else {
                        System.out.println("Balık Burcu");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day <= 20) {
                        System.out.println("Balık Burcu");
                    } else {
                        System.out.println("Koç Burcu");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                }
                break;
            case 4:
                if (day >= 1 && day <= 30) {
                    if (day <= 20) {
                        System.out.println("koç Burcu");
                    } else {
                        System.out.println("Boğa Burcu");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                }
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        System.out.println("Boğa Burcu");
                    } else {
                        System.out.println("İkizler Burcu");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                }
                break;
            case 6:
                if (day >= 1 && day <= 30) {
                    if (day <= 22) {
                        System.out.println("İkizler Burcu");
                    } else {
                        System.out.println("Yengeç Burcu");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                }
                break;
            case 7:
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        System.out.println("Yengeç Burcu");
                    } else {
                        System.out.println("Aslan Burcu");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                }
                break;
            case 8:
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        System.out.println("Aslan Burcu");
                    } else {
                        System.out.println("Başak Burcu");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                }
                break;
            case 9:
                if (day >= 1 && day <= 30) {
                    if (day <= 22) {
                        System.out.println("Başak Burcu");
                    } else {
                        System.out.println("Terazi Burcu");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                }
                break;
            case 10:
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        System.out.println("Terazi Burcu");
                    } else {
                        System.out.println("Akrep Burcu");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                }
                break;
            case 11:
                if (day >= 1 && day <= 30) {
                    if (day <= 21) {
                        System.out.println("Akrep Burcu");
                    } else {
                        System.out.println("Yay Burcu");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                }
                break;
            case 12:
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        System.out.println("Yay Burcu");
                    } else {
                        System.out.println("Oğlak Burcu");
                    }
                } else {
                    System.out.println("Geçersiz Bir Gün Girdiniz");
                }
                break;


        }  */
    }
}
