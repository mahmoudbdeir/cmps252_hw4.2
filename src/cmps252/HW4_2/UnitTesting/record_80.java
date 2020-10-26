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
class Record_80 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 80: FirstName is Jeanne")
	void FirstNameOfRecord80() {
		assertEquals("Jeanne", customers.get(79).getFirstName());
	}

	@Test
	@DisplayName("Record 80: LastName is Facio")
	void LastNameOfRecord80() {
		assertEquals("Facio", customers.get(79).getLastName());
	}

	@Test
	@DisplayName("Record 80: Company is Kims Southwest Hose Dallas")
	void CompanyOfRecord80() {
		assertEquals("Kims Southwest Hose Dallas", customers.get(79).getCompany());
	}

	@Test
	@DisplayName("Record 80: Address is 5035 Galley Rd")
	void AddressOfRecord80() {
		assertEquals("5035 Galley Rd", customers.get(79).getAddress());
	}

	@Test
	@DisplayName("Record 80: City is Colorado Springs")
	void CityOfRecord80() {
		assertEquals("Colorado Springs", customers.get(79).getCity());
	}

	@Test
	@DisplayName("Record 80: County is El Paso")
	void CountyOfRecord80() {
		assertEquals("El Paso", customers.get(79).getCounty());
	}

	@Test
	@DisplayName("Record 80: State is CO")
	void StateOfRecord80() {
		assertEquals("CO", customers.get(79).getState());
	}

	@Test
	@DisplayName("Record 80: ZIP is 80915")
	void ZIPOfRecord80() {
		assertEquals("80915", customers.get(79).getZIP());
	}

	@Test
	@DisplayName("Record 80: Phone is 719-380-6758")
	void PhoneOfRecord80() {
		assertEquals("719-380-6758", customers.get(79).getPhone());
	}

	@Test
	@DisplayName("Record 80: Fax is 719-380-1643")
	void FaxOfRecord80() {
		assertEquals("719-380-1643", customers.get(79).getFax());
	}

	@Test
	@DisplayName("Record 80: Email is jeanne@facio.com")
	void EmailOfRecord80() {
		assertEquals("jeanne@facio.com", customers.get(79).getEmail());
	}

	@Test
	@DisplayName("Record 80: Web is http://www.jeannefacio.com")
	void WebOfRecord80() {
		assertEquals("http://www.jeannefacio.com", customers.get(79).getWeb());
	}
}
