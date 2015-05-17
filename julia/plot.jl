# plot
using DataFrames
using Gadfly
using RDatasets

df = readtable("my.tsv");
p = plot(x=df[:Utolsó_100ms_alatt_feldolgozott_kérések_száma_darab_], y=df[:Utolsó_100ms_CPU_kihasználtság_], Geom.line, Guide.XLabel("kérések [darab]"), Guide.YLabel("CPU kihasználtság [%]"), Guide.title("Example plot"))
draw(PDF("myplot.pdf", 4inch, 3inch), p)
