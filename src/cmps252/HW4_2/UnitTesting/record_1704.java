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

@Tag("44")
class Record_1704 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1704: FirstName is Louisa")
	void FirstNameOfRecord1704() {
		assertEquals("Louisa", customers.get(1703).getFirstName());
	}

	@Test
	@DisplayName("Record 1704: LastName is Dural")
	void LastNameOfRecord1704() {
		assertEquals("Dural", customers.get(1703).getLastName());
	}

	@Test
	@DisplayName("Record 1704: Company is Rutherford Brwn & Catherwood")
	void CompanyOfRecord1704() {
		assertEquals("Rutherford Brwn & Catherwood", customers.get(1703).getCompany());
	}

	@Test
	@DisplayName("Record 1704: Address is 1025 N Black Horse Pike")
	void AddressOfRecord1704() {
		assertEquals("1025 N Black Horse Pike", customers.get(1703).getAddress());
	}

	@Test
	@DisplayName("Record 1704: City is Runnemede")
	void CityOfRecord1704() {
		assertEquals("Runnemede", customers.get(1703).getCity());
	}

	@Test
	@DisplayName("Record 1704: County is Camden")
	void CountyOfRecord1704() {
		assertEquals("Camden", customers.get(1703).getCounty());
	}

	@Test
	@DisplayName("Record 1704: State is NJ")
	void StateOfRecord1704() {
		assertEquals("NJ", customers.get(1703).getState());
	}

	@Test
	@DisplayName("Record 1704: ZIP is 8078")
	void ZIPOfRecord1704() {
		assertEquals("8078", customers.get(1703).getZIP());
	}

	@Test
	@DisplayName("Record 1704: Phone is 856-931-8347")
	void PhoneOfRecord1704() {
		assertEquals("856-931-8347", customers.get(1703).getPhone());
	}

	@Test
	@DisplayName("Record 1704: Fax is 856-931-4929")
	void FaxOfRecord1704() {
		assertEquals("856-931-4929", customers.get(1703).getFax());
	}

	@Test
	@DisplayName("Record 1704: Email is louisa@dural.com")
	void EmailOfRecord1704() {
		assertEquals("louisa@dural.com", customers.get(1703).getEmail());
	}

	@Test
	@DisplayName("Record 1704: Web is http://www.louisadural.com")
	void WebOfRecord1704() {
		assertEquals("http://www.louisadural.com", customers.get(1703).getWeb());
	}
}
