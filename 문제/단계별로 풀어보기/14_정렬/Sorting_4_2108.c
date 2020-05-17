// ������ȣ		2108
// �����̸�		�����
// �����з�		����/�ܰ躰�� Ǯ���/14_����
// ������ó		acmicpc.net
// �ڵ��ۼ���	YOON Yeongshin

#include <stdio.h>
#include <math.h>

int calcMid(int*, int);
int calcMode(int*);

int main(void)
{
	int bias = 4000;
	int n, i, sum, temp, max, min;
	int avg, mid, mode, range;
	int arr[8001];

	scanf("%d", &n);
	
	for (i = 0; i < 8001; i++) arr[i] = 0;

	sum = 0;
	for (i = 0; i < n; i++)
	{
		scanf("%d", &temp);
		arr[temp + bias]++;
		sum += temp;
	}

	//���
	avg = (int)round(sum / (double)n);
	//�߰���
	mid = calcMid(arr, n / 2 + 1);
	//�ֺ�
	mode = calcMode(arr);
	//����
	max = 0;
	min = 0;
	for (i = 0; i < 8001; i++)
	{
		if (arr[i] != 0)
		{
			min = i - 4000;
			break;
		}
	}
	for (i = 8000; i >= 0; i--)
	{
		if (arr[i] != 0)
		{
			max = i - 4000;
			break;
		}
	}
	range = max - min;
	printf("%d\n", avg);
	printf("%d\n", mid);
	printf("%d\n", mode);
	printf("%d\n", range);
	
	return 0;
}

int calcMid(int* arr, int n)
{
	int index = 0;
	int i, mid = 0;

	for (i = 0; i < 8001; i++)
	{
		index += arr[i];
		if (n <= index)
		{
			mid = i - 4000;
			break;
		}
	}
	
	return mid;
}

int calcMode(int* arr)
{
	int max_freq = 0;
	int i, mode = 0, count = 0;

	
	for (i = 0; i < 8001; i++)
	{
		if (arr[i] > max_freq) max_freq = arr[i];
	}

	for (i = 0; i < 8001; i++)
	{
		if (arr[i] == max_freq)
		{
			mode = i - 4000;
			count++;
		}
		if (count == 2) break;
	}

	return mode;
}