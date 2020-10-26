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

@Tag("12")
class Record_2296 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2296: FirstName is Dionne")
	void FirstNameOfRecord2296() {
		assertEquals("Dionne", customers.get(2295).getFirstName());
	}

	@Test
	@DisplayName("Record 2296: LastName is Vasher")
	void LastNameOfRecord2296() {
		assertEquals("Vasher", customers.get(2295).getLastName());
	}

	@Test
	@DisplayName("Record 2296: Company is Sheffield, Richard B Esq")
	void CompanyOfRecord2296() {
		assertEquals("Sheffield, Richard B Esq", customers.get(2295).getCompany());
	}

	@Test
	@DisplayName("Record 2296: Address is 337 S Monroe  #-9")
	void AddressOfRecord2296() {
		assertEquals("337 S Monroe  #-9", customers.get(2295).getAddress());
	}

	@Test
	@DisplayName("Record 2296: City is Santa Clara")
	void CityOfRecord2296() {
		assertEquals("Santa Clara", customers.get(2295).getCity());
	}

	@Test
	@DisplayName("Record 2296: County is Santa Clara")
	void CountyOfRecord2296() {
		assertEquals("Santa Clara", customers.get(2295).getCounty());
	}

	@Test
	@DisplayName("Record 2296: State is CA")
	void StateOfRecord2296() {
		assertEquals("CA", customers.get(2295).getState());
	}

	@Test
	@DisplayName("Record 2296: ZIP is 95050")
	void ZIPOfRecord2296() {
		assertEquals("95050", customers.get(2295).getZIP());
	}

	@Test
	@DisplayName("Record 2296: Phone is 408-247-9479")
	void PhoneOfRecord2296() {
		assertEquals("408-247-9479", customers.get(2295).getPhone());
	}

	@Test
	@DisplayName("Record 2296: Fax is 408-247-6855")
	void FaxOfRecord2296() {
		assertEquals("408-247-6855", customers.get(2295).getFax());
	}

	@Test
	@DisplayName("Record 2296: Email is dionne@vasher.com")
	void EmailOfRecord2296() {
		assertEquals("dionne@vasher.com", customers.get(2295).getEmail());
	}

	@Test
	@DisplayName("Record 2296: Web is http://www.dionnevasher.com")
	void WebOfRecord2296() {
		assertEquals("http://www.dionnevasher.com", customers.get(2295).getWeb());
	}
}
