FILE_NAME=DV017A_lab2
TEX_PATH=tex
OUTPUT_PATH=build
TEX=pdflatex
BIBTEX=bibtex
TEX_FLAGS=-synctex=1 -interaction=nonstopmode -shell-escape -file-line-error 
LATEX_CMD=$(TEX) $(TEX_FLAGS) --output-directory=$(OUTPUT_PATH)

default: pdf


pdf: 
	$(LATEX_CMD) $(TEX_PATH)/$(FILE_NAME).tex

#all: $(FILE_NAME).pdf
##	$(LATEX_CMD)
##	$(BIBTEX) $(PROJECT)
##	$(BUILDTEX)
##	$(BUILDTEX)

$(FILE_NAME).pdf: $(FILE_NAME).tex
	$(LATEX_CMD) $(FILE_NAME)
	$(LATEX_CMD) $(FILE_NAME)
	$(BIBTEX) $(FILE_NAME)
	$(LATEX_CMD) $(FILE_NAME)
	$(LATEX_CMD) $(FILE_NAME)

view:
	xdg-open $(OUTPUT_PATH)/$(FILE_NAME).pdf &


##.PHONY: clean
##clean:
##	    rm -f *.log *.bak *.aux *.bbl *.blg *.idx *.toc *.out
##
##.PHONY: clean-all
##clean-all:
##	    rm -f *.dvi *.log *.bak *.aux *.bbl *.blg *.idx *.ps *.eps *.pdf *.toc *.out
##
