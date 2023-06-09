import uvicorn
from fastapi import FastAPI
import pickle
app = FastAPI()

Model = None
with open("LinearSVC.pkl" , 'rb') as F:
    Model = pickle.load(F)



@app.get("/")
async def scoring_endpoint(Text:str = ""):
    Ans = Model.predict([Text])
    return {"Ans : " : str(Ans[0])}
