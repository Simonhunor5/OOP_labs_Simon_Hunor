package Matrix;

import java.util.Random;

public class Matrix {

    private double[][] data;
    private final int rows, columns;

    public Matrix(int rows, int columns)
    {
        this.rows = rows;
        this.columns = columns;
        data = new double[rows][columns];
    }

    public Matrix(double[][] matrix)
    {
        this.rows = matrix.length;
        this.columns = matrix[0].length;

        this.data = matrix;
    }

    public Matrix(Matrix matrix)
    {
        this.columns = matrix.columns;
        this.rows = matrix.rows;

        this.data = matrix.data;

    }

    public void fillRandom(double rangeMin, double rangeMax)
    {
        Random r = new Random();

        for(int i = 0; i < this.rows; i++)
        {
            for(int j = 0; j < this.columns; j++)
            {
                this.data[i][j] = rangeMin + (rangeMax - rangeMin) * r.nextDouble();;
            }
        }
    }

    public int getColumns() {
        return this.columns;
    }

    public int getRows() {
        return rows;
    }

    public void printMatrix()
    {
        for(int i = 0; i < this.rows; i++)
        {
            for(int j = 0; j < this.columns; j++)
            {
                 System.out.print(this. data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static Matrix add(Matrix m1, Matrix m2)
    {
        if(m1.rows == m2.rows && m1.columns == m2.columns)
        {
            Matrix added = new Matrix(m1.rows,m1.columns);

            for(int i = 0; i < m1.rows; i++)
            {
                for(int j = 0; j < m1.columns; j++)
                {
                    added.data[i][j] = m1.data[i][j] + m2.data[i][j];
                }
            }

            return added;
        }else
        {
            return null;
        }
    }

    public static Matrix transpose(Matrix matrix)
    {
        Matrix transposed = new Matrix(matrix.columns, matrix.rows);

        for(int i = 0; i < matrix.columns; i++)
        {
            for(int j = 0; j < matrix.rows; j++)
            {
                for(int k = 0; k < matrix.rows; k++)
                {
                    transposed.data[i][j] = matrix.data[j][i];
                }
            }
        }

        return transposed;
    }

    public static Matrix multiply(Matrix m1,Matrix m2)
    {
        if(m1.rows == m2.columns)
        {
            Matrix multiplid = new Matrix(m1.columns, m2.rows);

            for(int i = 0; i < m2.rows; i++)
            {
                for(int j = 0; j < m1.columns; j++)
                {
                    for(int k = 0; k < m1.rows; k++)
                    {
                        multiplid.data[i][j] = m1.data[i][k] * m2.data[k][j];
                    }
                }
            }

            return multiplid;
        }else if(m1.columns == m2.rows)
        {
            Matrix multiplid = new Matrix(m1.rows, m2.columns);

            for(int i = 0; i < m1.rows; i++)
            {
                for(int j = 0; j < m2.columns; j++)
                {
                    for(int k = 0; k < m1.columns; k++)
                    {
                        multiplid.data[i][j] = m1.data[i][k] * m2.data[k][j];
                    }
                }
            }

            return multiplid;
        }else
        {
            return null;
        }
    }


}
