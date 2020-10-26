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

@Tag("38")
class Record_4312 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4312: FirstName is Jake")
	void FirstNameOfRecord4312() {
		assertEquals("Jake", customers.get(4311).getFirstName());
	}

	@Test
	@DisplayName("Record 4312: LastName is Fidel")
	void LastNameOfRecord4312() {
		assertEquals("Fidel", customers.get(4311).getLastName());
	}

	@Test
	@DisplayName("Record 4312: Company is Dazor Manufacturing Corp")
	void CompanyOfRecord4312() {
		assertEquals("Dazor Manufacturing Corp", customers.get(4311).getCompany());
	}

	@Test
	@DisplayName("Record 4312: Address is 499 Cooper Landing Rd")
	void AddressOfRecord4312() {
		assertEquals("499 Cooper Landing Rd", customers.get(4311).getAddress());
	}

	@Test
	@DisplayName("Record 4312: City is Cherry Hill")
	void CityOfRecord4312() {
		assertEquals("Cherry Hill", customers.get(4311).getCity());
	}

	@Test
	@DisplayName("Record 4312: County is Camden")
	void CountyOfRecord4312() {
		assertEquals("Camden", customers.get(4311).getCounty());
	}

	@Test
	@DisplayName("Record 4312: State is NJ")
	void StateOfRecord4312() {
		assertEquals("NJ", customers.get(4311).getState());
	}

	@Test
	@DisplayName("Record 4312: ZIP is 8002")
	void ZIPOfRecord4312() {
		assertEquals("8002", customers.get(4311).getZIP());
	}

	@Test
	@DisplayName("Record 4312: Phone is 856-667-8903")
	void PhoneOfRecord4312() {
		assertEquals("856-667-8903", customers.get(4311).getPhone());
	}

	@Test
	@DisplayName("Record 4312: Fax is 856-667-6617")
	void FaxOfRecord4312() {
		assertEquals("856-667-6617", customers.get(4311).getFax());
	}

	@Test
	@DisplayName("Record 4312: Email is jake@fidel.com")
	void EmailOfRecord4312() {
		assertEquals("jake@fidel.com", customers.get(4311).getEmail());
	}

	@Test
	@DisplayName("Record 4312: Web is http://www.jakefidel.com")
	void WebOfRecord4312() {
		assertEquals("http://www.jakefidel.com", customers.get(4311).getWeb());
	}
}
