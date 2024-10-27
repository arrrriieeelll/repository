#include <stdio.h>
#include <string.h>

int main()
{
char nama[50];
char nim[15];
int tugas, uts, uas;

printf("--- Program Penghitung Nilai Akhir Mahasiswa --- \n");
printf("Masukan Nama Mahasiswa : " );
fgets(nama, 50, stdin);
printf("Masukan NIM Akhir Mahasiswa : ");
fgets(nim, 15, stdin);
printf("Masukan Nilai Tugas : ");
scanf("%d", &tugas);
printf("Masukan Nilai Uts : ");
scanf("%d", &uts);
printf("Masukan Nilai Uas  : ");
scanf("%d", &uas);

printf("------------------------------------\n");

//tugas 20% uts 30% uas 50%
// float hasil = (tugas * 0.2) + (uts * 0.3) + (uas * 0.5);

float hasil = (tugas + uts + uas) / 3;

printf("Nama Mahasiswa : %s \n", nama );
printf("NIM Mahasiswa : %s \n", nim);
printf("Nilai TUGAS : %.2f \n", (float)tugas);
printf("Nilai UTS : %.2f \n", (float)uts);
printf("Nilai UAS : %.2f \n", (float)uas);
printf("Nilai Akhir : %.2f \n", hasil);

    return 0;
}