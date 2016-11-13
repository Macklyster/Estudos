/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author alex
 */
@ManagedBean
public class GraficoNotasMb 
{
    private LineChartModel modelo;
    
    @PostConstruct
    public void init()
    {
        modelo = new LineChartModel();

        modelo.addSeries(serieDesenvFrameworks());

        Axis eixoY = modelo.getAxis(AxisType.Y);
        eixoY.setMin(0);
        eixoY.setMax(100);
        eixoY.setLabel("Notas");
        
        Axis eixoX = modelo.getAxis(AxisType.X);
        eixoX.setMin(1);
        eixoX.setMax(4);
        eixoX.setLabel("Bimestres");
        eixoX.setTickCount(4);
        
    }
    
    private LineChartSeries serieDesenvFrameworks()
    {
        LineChartSeries serie1 = new LineChartSeries();
        serie1.setLabel("Desen. Frameworks");
        serie1.set(1, 60);
        serie1.set(2, 70);
        serie1.set(3, 40);
        serie1.set(4, 90);
        return serie1;
    }

    public LineChartModel getModelo() 
    {
        return modelo;
    }    
}
