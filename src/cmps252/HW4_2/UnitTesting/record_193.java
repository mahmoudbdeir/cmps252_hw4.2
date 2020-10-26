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

@Tag("26")
class Record_193 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 193: FirstName is Carmen")
	void FirstNameOfRecord193() {
		assertEquals("Carmen", customers.get(192).getFirstName());
	}

	@Test
	@DisplayName("Record 193: LastName is Becker")
	void LastNameOfRecord193() {
		assertEquals("Becker", customers.get(192).getLastName());
	}

	@Test
	@DisplayName("Record 193: Company is Cot Bolton Hoychick & Doughty")
	void CompanyOfRecord193() {
		assertEquals("Cot Bolton Hoychick & Doughty", customers.get(192).getCompany());
	}

	@Test
	@DisplayName("Record 193: Address is 15030 Hillside Ave")
	void AddressOfRecord193() {
		assertEquals("15030 Hillside Ave", customers.get(192).getAddress());
	}

	@Test
	@DisplayName("Record 193: City is Jamaica")
	void CityOfRecord193() {
		assertEquals("Jamaica", customers.get(192).getCity());
	}

	@Test
	@DisplayName("Record 193: County is Queens")
	void CountyOfRecord193() {
		assertEquals("Queens", customers.get(192).getCounty());
	}

	@Test
	@DisplayName("Record 193: State is NY")
	void StateOfRecord193() {
		assertEquals("NY", customers.get(192).getState());
	}

	@Test
	@DisplayName("Record 193: ZIP is 11432")
	void ZIPOfRecord193() {
		assertEquals("11432", customers.get(192).getZIP());
	}

	@Test
	@DisplayName("Record 193: Phone is 718-523-8246")
	void PhoneOfRecord193() {
		assertEquals("718-523-8246", customers.get(192).getPhone());
	}

	@Test
	@DisplayName("Record 193: Fax is 718-523-4575")
	void FaxOfRecord193() {
		assertEquals("718-523-4575", customers.get(192).getFax());
	}

	@Test
	@DisplayName("Record 193: Email is carmen@becker.com")
	void EmailOfRecord193() {
		assertEquals("carmen@becker.com", customers.get(192).getEmail());
	}

	@Test
	@DisplayName("Record 193: Web is http://www.carmenbecker.com")
	void WebOfRecord193() {
		assertEquals("http://www.carmenbecker.com", customers.get(192).getWeb());
	}
}
