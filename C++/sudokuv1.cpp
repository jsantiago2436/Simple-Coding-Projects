/*
3x3 Sudoku Puzzle
@author: Jonathan Santiago
8/10/2020
version (1) (Not completed yet)
*/

#include <iostream>
#include <stdlib.h>
#include <time.h>
using namespace std;

typedef int sudoku[3][3];
sudoku box[3][3] = {0}; 
	
bool ok(int r, int rr, int c, int cc) {
	//check if numbers do NOT repeat in same row / column
	for(int i = 0; i < 3; i++)
		for(int j = 0; j < 3; j++) 
			if(box[r][rr][i][j] == box[r][rr][c][cc] && (i != c || j != cc)) return false;
	
	for(int i = 0; i < 3; i++) 
		for(int j = 0; j < 3; j++)
			if(box[i][j][c][cc] == box[r][rr][c][cc] && (i != r || j != rr)) return false;
	
	//check if numbers repeat in corresponding 3x3 outer box
	for(int i = 0; i < 3; i++)
		for(int j = 0; j < 3; j++)
			if(box[r][i][c][j] == box[r][rr][c][cc] && (i != rr || j != cc)) return false;
	
	return true;
}

int main() {
	srand(time(NULL));
	bool meets;
	int random;
	string vert(21, '-');
	string horizontal = "|";
	
	//setting up the 9x9 sudoku puzzle, starting with 3x3 outer box.
	
	for(int i = 0; i < 3; i++) {
		for(int j = 0; j < 3; j++) {
			//setting up the inner box
			for(int k = 0; k < 3; k++) {
				for(int l = 0; l < 3; l++) {
					meets = false;
					while(!meets) {
						random = rand() % 9 + 1;
						box[i][j][k][l] = random;
						meets = ok(i, j, k, l);
					}
					cout << box[i][j][k][l] << " ";
				}
				cout << horizontal;
			}
			cout << endl;
		}
		cout << vert << endl;
	}
	
	return 0;
}
