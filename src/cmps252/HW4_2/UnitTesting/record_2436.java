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

@Tag("4")
class Record_2436 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2436: FirstName is Bennett")
	void FirstNameOfRecord2436() {
		assertEquals("Bennett", customers.get(2435).getFirstName());
	}

	@Test
	@DisplayName("Record 2436: LastName is Cremeans")
	void LastNameOfRecord2436() {
		assertEquals("Cremeans", customers.get(2435).getLastName());
	}

	@Test
	@DisplayName("Record 2436: Company is Edwards Pharmaceutical")
	void CompanyOfRecord2436() {
		assertEquals("Edwards Pharmaceutical", customers.get(2435).getCompany());
	}

	@Test
	@DisplayName("Record 2436: Address is 225 N 168th Ave")
	void AddressOfRecord2436() {
		assertEquals("225 N 168th Ave", customers.get(2435).getAddress());
	}

	@Test
	@DisplayName("Record 2436: City is Holland")
	void CityOfRecord2436() {
		assertEquals("Holland", customers.get(2435).getCity());
	}

	@Test
	@DisplayName("Record 2436: County is Ottawa")
	void CountyOfRecord2436() {
		assertEquals("Ottawa", customers.get(2435).getCounty());
	}

	@Test
	@DisplayName("Record 2436: State is MI")
	void StateOfRecord2436() {
		assertEquals("MI", customers.get(2435).getState());
	}

	@Test
	@DisplayName("Record 2436: ZIP is 49424")
	void ZIPOfRecord2436() {
		assertEquals("49424", customers.get(2435).getZIP());
	}

	@Test
	@DisplayName("Record 2436: Phone is 616-786-9460")
	void PhoneOfRecord2436() {
		assertEquals("616-786-9460", customers.get(2435).getPhone());
	}

	@Test
	@DisplayName("Record 2436: Fax is 616-786-4621")
	void FaxOfRecord2436() {
		assertEquals("616-786-4621", customers.get(2435).getFax());
	}

	@Test
	@DisplayName("Record 2436: Email is bennett@cremeans.com")
	void EmailOfRecord2436() {
		assertEquals("bennett@cremeans.com", customers.get(2435).getEmail());
	}

	@Test
	@DisplayName("Record 2436: Web is http://www.bennettcremeans.com")
	void WebOfRecord2436() {
		assertEquals("http://www.bennettcremeans.com", customers.get(2435).getWeb());
	}
}
