package com.tagakov.hackerrank.search

import java.util.*

fun main(args: Array<String>) {
    val (k, list) = with(Scanner(System.`in`)) {
        val n = nextInt()
        nextInt() to (1..n).map { nextInt() }.sorted()
    }

    //can be optimised by starting binary search from the current's element index
    val pairsCount = list.count { list.binarySearch(it + k) > 0 }

    println(pairsCount)
}

val input = "946 1904\n" +
        "601735 393698 853476 460999 611561 615338 815246 949748 567967 963988 201032 872488 563426 768994 183203 389471 768751 302253 917052 470358 368075 313889 314078 682429 887478 746873 416713 791284 254609 270931 394354 826330 253611 626017 40075 199836 327356 594501 713889 146632 391375 51252 951652 857167 279288 777485 741760 926191 115049 745224 549873 601107 609992 558762 244004 763370 647297 672774 580923 911573 242809 538861 640624 50012 749032 905741 904719 761466 447070 354694 551380 804219 385914 617098 747128 264722 880909 74739 237060 502299 14683 371150 591477 437097 186029 762334 68606 678888 872313 152728 357942 317886 840712 293929 715793 386413 702682 802476 145073 917819 592500 847294 750681 79367 266626 676476 484667 366171 602616 609351 459033 891805 654468 45569 378707 752840 918398 416067 99928 189555 605076 928635 89230 298104 160513 822695 831756 419966 678697 145414 485602 326824 120982 297486 648290 130705 218588 903843 973506 72496 660180 421256 534636 78821 454188 149943 148536 535217 186882 596405 191459 806429 849476 523098 475438 978408 953556 269740 957634 558616 764238 250660 699432 367652 763816 765720 585975 794018 388010 215153 596459 136379 154632 920679 214294 505056 877406 540856 384509 460018 902446 632478 670764 676889 537121 539523 494154 919928 810237 245604 187322 389316 855380 485449 18602 231734 828100 599638 189861 631685 221610 268530 869656 537619 580263 388317 849198 468454 745002 818253 643490 26671 189226 435778 214780 207196 374053 609660 255515 623060 308681 166334 16587 881260 752015 578428 177851 977314 4721 915148 539025 922764 22791 877571 412835 457191 577115 890144 878681 369246 76799 924827 543840 445579 581690 180348 60870 575926 615139 324892 845668 185107 742063 4648 162417 750925 463328 377429 737757 643489 551105 344797 787456 315793 720951 391283 487506 118857 550491 473690 594392 165972 403895 786752 892048 992281 794219 555719 6848 940392 376803 741659 12779 656358 258981 275480 299390 414824 513912 756846 84206 551777 994185 812485 444848 669078 663780 586625 373621 534076 429021 601542 694326 80725 627877 790737 469226 995415 491314 393279 626057 49348 316761 710081 947844 973553 28819 412920 405690 5340 351605 902690 247231 401993 855263 443030 668860 160122 593617 991663 879356 808188 195267 51599 672850 459900 5731 775581 670246 793481 393467 501129 505935 572334 549752 633831 766752 465286 806434 234121 425064 898638 403680 695454 973276 66702 9828 559527 82302 150132 553681 999042 208941 541427 654937 124790 758526 916494 752585 619252 2744 555868 374899 115749 579019 914590 142824 271989 789993 374034 51916 654581 578907 535715 872044 849335 1171 439586 806284 760430 841480 138468 456092 749756 812141 792114 919582 893709 770475 851572 84407 232663 613225 642528 861549 240868 401528 459520 802055 379333 119042 255673 379103 549201 944541 340267 753919 514503 711985 216557 592597 802983 403147 633053 181299 483698 33300 889436 273576 926731 881214 661096 273413 290568 477342 594555 626003 975180 900029 951425 739856 748885 888240 311730 195116 142167 360498 770655 590747 122946 381237 80687 591408 805582 703240 336459 339682 115876 727366 457616 776822 718265 693038 938029 325799 797289 213761 611896 729183 938017 256693 173352 980892 748373 676984 590585 360459 577882 590693 797826 789380 661100 859071 417105 624069 736048 766611 479246 587879 418632 739661 15757 178444 248111 815699 760654 978988 883532 139702 411300 998662 557623 900542 281647 892380 279611 515848 301241 752829 764943 579786 656401 333068 540929 322012 740812 609657 910577 883118 161792 735853 821104 815209 621590 815628 396995 503813 455718 705043 9148 825504 519656 158440 53820 420419 838808 86110 407225 986569 20743 903837 631946 70510 329260 144728 941825 146424 516407 736699 981413 741565 234669 919997 917678 446594 264256 208118 142288 372130 767238 297737 597299 252874 240365 603639 613853 988473 453383 443397 289030 116953 182420 303198 89291 608740 887997 958670 819017 795385 152157 240371 189592 436985 307406 554689 779384 691485 750111 193212 845288 238964 56034 32823 131093 120946 430403 589504 911572 865166 865916 214631 813433 592488 419352 296200 787476 13853 801097 599203 658276 648664 866543 764462 310434 311985 672668 295833 167504 66877 687332 680525 277221 916168 958929 864012 82629 458257 277304 416728 586596 874150 882813 154134 582167 604915 588680 657910 680140 664904 517752 346291 520509 414716 191308 43475 857380 303761 827706 749021 990377 122886 767624 625973 706256 791897 270411 951488 748777 29675 317946 675871 306061 975410 437908 61092 663000 917512 449734 448184 165600 675080 615369 605543 924487 561731 277384 75785 220212 737952 218394 607447 262818 971090 464395 777773 875548 365724 452899 741550 151819 738603 201330 918956 610644 959767 327910 31945 697024 783925 739920 576038 799193 310081 310671 357478 795922 561522 727279 794645 453814 200739 375938 708057 449930 193363 271509 843384 323916 119078 533582 611331 656372 566853 816314 134704 210097 514501 930539 10875 853181 511045 725375 629865 27684 6552 449387 489410 518311 147318 744969 808333 684333 183567 613235 143510 459095 762558 865848 942272 127949 331164 307965 469723 49337 374958 860975 871560 271644 800230 944263 315982 779389 716361 24767 867752 55724 612548 548472 447483 275317 853739 693078 216684 41761 799465 627961 390103 451910 877452 294958 621156 584071 528483 108153 382605 613465 430925 188684 296538 734795 629781 431506 683120 547242 592651 304157 826196 443675 432829 68515 533313 565330 889901 967892 235560 21101 74070 780456 593312 407594 4331 447750 945633 367342 105393 47310 766847 314857 372995 553009 883062 793801 288987 389890 93787 391794 373054 235156 882246 804380 672570 281192 656052 938597 17661 7244 273892 471776 85883 758750 427698 730781 603011 875318 270942 396127 952728 649021 701336 35078 588677 817596 759392 674572 320569 614452 920860 375525 187467 292025 759915 647319 625683 590584 607939 425213 657292 163545 234218 385261 887247 398899 237073 899303 920302 29330 342499 935539 645393 792788 370226 816293 423160 901933 561431 413204 472262 429602 820791 979344 684773 851380 301294 156536 257419 338294 273548 818887 437682 824292 914454 338363 484690 582827 227602 768003 943729 461424 791595 879005 584869 613800 325820 680792 576556 495017 311884 419420 682053 966775 355170 628288 998781 588789 420270 411402 750936 467188 782518 214653 427117 860204 547297 553815 455287 608063 593381 19565 466550 318665 303638 117138 9621 546568 197171 544664"