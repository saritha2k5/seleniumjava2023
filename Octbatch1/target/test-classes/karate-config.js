function fn()
{

var config = {
name: "Saritha",

getsingleuser: 'https://reqres.in/api/users/2',
getsingleusernotfound: 'https://reqres.in/api/users/23',
getlistresources: 'https://reqres.in/api/unknown',
getsingleresource: 'https://reqres.in/api/unknown/2',
getsingleresourcenotfound: 'https://reqres.in/api/unknown/23'

};

var env=karate.env
karate.log('Env is:', env)

if(env=='qa')
{
config.getlistuser='https://reqres.in/api/users?page=3'
}
else if(env=='dev')
{
config.getlistuser='https://reqres.in/api/users?page=4'
}
else
{
config.getlistuser='https://reqres.in/api/users?page=6'

}



return config
}
