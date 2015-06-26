NAME=DV017A_lab2
TEX_PATH=tex
OUT_PATH=build
TEX=pdflatex
BIBTEX=bibtex
TEX_FLAGS=-synctex=1 -interaction=nonstopmode -shell-escape -file-line-error 
LATEX_CMD=$(TEX) $(TEX_FLAGS) --output-directory=$(OUT_PATH)

sources = DV017A_lab2.tex intro.tex resultat.tex uppg01.tex

default: pdf


pdf: $(OUT_PATH)/$(NAME).pdf

all: pdf

$(OUT_PATH)/$(NAME).pdf: $(TEX_PATH)/$(NAME).tex
	$(LATEX_CMD) $(TEX_PATH)/$(NAME).tex
	$(BIBTEX) $(TEX_PATH)/$(NAME)
	$(LATEX_CMD) $(TEX_PATH)/$(NAME).tex
	$(LATEX_CMD) $(TEX_PATH)/$(NAME).tex


#all: $(FILE_NAME).pdf
##	$(LATEX_CMD)
##	$(BIBTEX) $(PROJECT)
##	$(BUILDTEX)
##	$(BUILDTEX)

view:
	xdg-open $(OUT_PATH)/$(NAME).pdf &


##.PHONY: clean
##clean:
##	    \rm -f *.log *.bak *.aux *.bbl *.blg *.idx *.toc *.out
##
##.PHONY: clean-all
##clean-all:
##	    \rm -f *.dvi *.log *.bak *.aux *.bbl *.blg *.idx *.ps *.eps *.pdf *.toc *.out
##
