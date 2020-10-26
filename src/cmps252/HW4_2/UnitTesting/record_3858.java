package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("16")
class Record_3858 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3858: FirstName is Mandy")
	void FirstNameOfRecord3858() {
		assertEquals("Mandy", customers.get(3857).getFirstName());
	}

	@Test
	@DisplayName("Record 3858: LastName is Hagwell")
	void LastNameOfRecord3858() {
		assertEquals("Hagwell", customers.get(3857).getLastName());
	}

	@Test
	@DisplayName("Record 3858: Company is Hans Hagen Homes")
	void CompanyOfRecord3858() {
		assertEquals("Hans Hagen Homes", customers.get(3857).getCompany());
	}

	@Test
	@DisplayName("Record 3858: Address is 6280 Manchester Blvd  #-20")
	void AddressOfRecord3858() {
		assertEquals("6280 Manchester Blvd  #-20", customers.get(3857).getAddress());
	}

	@Test
	@DisplayName("Record 3858: City is Buena Park")
	void CityOfRecord3858() {
		assertEquals("Buena Park", customers.get(3857).getCity());
	}

	@Test
	@DisplayName("Record 3858: County is Orange")
	void CountyOfRecord3858() {
		assertEquals("Orange", customers.get(3857).getCounty());
	}

	@Test
	@DisplayName("Record 3858: State is CA")
	void StateOfRecord3858() {
		assertEquals("CA", customers.get(3857).getState());
	}

	@Test
	@DisplayName("Record 3858: ZIP is 90621")
	void ZIPOfRecord3858() {
		assertEquals("90621", customers.get(3857).getZIP());
	}

	@Test
	@DisplayName("Record 3858: Phone is 714-228-5005")
	void PhoneOfRecord3858() {
		assertEquals("714-228-5005", customers.get(3857).getPhone());
	}

	@Test
	@DisplayName("Record 3858: Fax is 714-228-1828")
	void FaxOfRecord3858() {
		assertEquals("714-228-1828", customers.get(3857).getFax());
	}

	@Test
	@DisplayName("Record 3858: Email is mandy@hagwell.com")
	void EmailOfRecord3858() {
		assertEquals("mandy@hagwell.com", customers.get(3857).getEmail());
	}

	@Test
	@DisplayName("Record 3858: Web is http://www.mandyhagwell.com")
	void WebOfRecord3858() {
		assertEquals("http://www.mandyhagwell.com", customers.get(3857).getWeb());
	}
}
