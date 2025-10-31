
import axios from "axios";
import { useEffect, useState } from "react";
import { Formik, useFormik } from "formik";

function GetFromBackend()
{
   

    const {handleChange,handleSubmit,values,validateOnChange}=useFormik({
        initialValues:
        {
            pagesize:"",
        },
        onSubmit:(v)=>
        {
            setpagesize(v.pagesize);
            console.log(v.pagesize);
            window.alert(v.pagesize);
            
        }

    })

    let [pagesize,setpagesize]=useState(1);
    let[data, setdata]=useState([])
    let[page,setpage]=useState(0);

    function nextpage()
    {
        setpage(++page);
        console.log(page);
        
    }

    useEffect(()=>{

              axios.get(`http://localhost:8080/book-controller/get-all-books?pagenumber=${page}&pagesize=${pagesize}&sortre=ratings&order=asc`)
              .then((v)=>
            {
                console.log(v.data.content);
                setdata(v.data.content);
                
            }).catch((e)=>
            {
                window.alert(e);
                console.log(e);
                
            })

    },[page,pagesize])

    return(<>
    <h2>in the fetchdata....</h2>
    {
        data.map((i)=>
        {
            return(<>
            <h2>{i.id}</h2>
            <h2>{i.name}
            </h2>
            <h2>{i.price}</h2>
            </>)
        })
    }
    <button onClick={nextpage}>Next Page</button>



    <form onSubmit={handleSubmit}>
        <input type="number" name="pagesize" value={values.pagesize} onChange={handleChange}/>
        <button type="submit"> Submit</button>
    </form >
    </>)
}

export  {GetFromBackend};