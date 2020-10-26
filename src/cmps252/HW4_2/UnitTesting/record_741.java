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

@Tag("19")
class Record_741 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 741: FirstName is Carlos")
	void FirstNameOfRecord741() {
		assertEquals("Carlos", customers.get(740).getFirstName());
	}

	@Test
	@DisplayName("Record 741: LastName is Gerchak")
	void LastNameOfRecord741() {
		assertEquals("Gerchak", customers.get(740).getLastName());
	}

	@Test
	@DisplayName("Record 741: Company is Whitmor Mfg Co Inc")
	void CompanyOfRecord741() {
		assertEquals("Whitmor Mfg Co Inc", customers.get(740).getCompany());
	}

	@Test
	@DisplayName("Record 741: Address is 666 University Ave W")
	void AddressOfRecord741() {
		assertEquals("666 University Ave W", customers.get(740).getAddress());
	}

	@Test
	@DisplayName("Record 741: City is Saint Paul")
	void CityOfRecord741() {
		assertEquals("Saint Paul", customers.get(740).getCity());
	}

	@Test
	@DisplayName("Record 741: County is Ramsey")
	void CountyOfRecord741() {
		assertEquals("Ramsey", customers.get(740).getCounty());
	}

	@Test
	@DisplayName("Record 741: State is MN")
	void StateOfRecord741() {
		assertEquals("MN", customers.get(740).getState());
	}

	@Test
	@DisplayName("Record 741: ZIP is 55104")
	void ZIPOfRecord741() {
		assertEquals("55104", customers.get(740).getZIP());
	}

	@Test
	@DisplayName("Record 741: Phone is 651-224-7110")
	void PhoneOfRecord741() {
		assertEquals("651-224-7110", customers.get(740).getPhone());
	}

	@Test
	@DisplayName("Record 741: Fax is 651-224-7409")
	void FaxOfRecord741() {
		assertEquals("651-224-7409", customers.get(740).getFax());
	}

	@Test
	@DisplayName("Record 741: Email is carlos@gerchak.com")
	void EmailOfRecord741() {
		assertEquals("carlos@gerchak.com", customers.get(740).getEmail());
	}

	@Test
	@DisplayName("Record 741: Web is http://www.carlosgerchak.com")
	void WebOfRecord741() {
		assertEquals("http://www.carlosgerchak.com", customers.get(740).getWeb());
	}
}
