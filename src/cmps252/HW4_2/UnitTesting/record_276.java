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

@Tag("21")
class Record_276 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 276: FirstName is Patti")
	void FirstNameOfRecord276() {
		assertEquals("Patti", customers.get(275).getFirstName());
	}

	@Test
	@DisplayName("Record 276: LastName is Scharr")
	void LastNameOfRecord276() {
		assertEquals("Scharr", customers.get(275).getLastName());
	}

	@Test
	@DisplayName("Record 276: Company is California Sports Bar & Deli")
	void CompanyOfRecord276() {
		assertEquals("California Sports Bar & Deli", customers.get(275).getCompany());
	}

	@Test
	@DisplayName("Record 276: Address is Broadway")
	void AddressOfRecord276() {
		assertEquals("Broadway", customers.get(275).getAddress());
	}

	@Test
	@DisplayName("Record 276: City is Pennsauken")
	void CityOfRecord276() {
		assertEquals("Pennsauken", customers.get(275).getCity());
	}

	@Test
	@DisplayName("Record 276: County is Camden")
	void CountyOfRecord276() {
		assertEquals("Camden", customers.get(275).getCounty());
	}

	@Test
	@DisplayName("Record 276: State is NJ")
	void StateOfRecord276() {
		assertEquals("NJ", customers.get(275).getState());
	}

	@Test
	@DisplayName("Record 276: ZIP is 8110")
	void ZIPOfRecord276() {
		assertEquals("8110", customers.get(275).getZIP());
	}

	@Test
	@DisplayName("Record 276: Phone is 856-365-9665")
	void PhoneOfRecord276() {
		assertEquals("856-365-9665", customers.get(275).getPhone());
	}

	@Test
	@DisplayName("Record 276: Fax is 856-365-4674")
	void FaxOfRecord276() {
		assertEquals("856-365-4674", customers.get(275).getFax());
	}

	@Test
	@DisplayName("Record 276: Email is patti@scharr.com")
	void EmailOfRecord276() {
		assertEquals("patti@scharr.com", customers.get(275).getEmail());
	}

	@Test
	@DisplayName("Record 276: Web is http://www.pattischarr.com")
	void WebOfRecord276() {
		assertEquals("http://www.pattischarr.com", customers.get(275).getWeb());
	}
}
