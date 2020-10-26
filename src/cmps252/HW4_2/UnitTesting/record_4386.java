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

@Tag("15")
class Record_4386 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4386: FirstName is Hershel")
	void FirstNameOfRecord4386() {
		assertEquals("Hershel", customers.get(4385).getFirstName());
	}

	@Test
	@DisplayName("Record 4386: LastName is Hanners")
	void LastNameOfRecord4386() {
		assertEquals("Hanners", customers.get(4385).getLastName());
	}

	@Test
	@DisplayName("Record 4386: Company is Stroble, Larry J Esq")
	void CompanyOfRecord4386() {
		assertEquals("Stroble, Larry J Esq", customers.get(4385).getCompany());
	}

	@Test
	@DisplayName("Record 4386: Address is 2780 Goodrick Ave")
	void AddressOfRecord4386() {
		assertEquals("2780 Goodrick Ave", customers.get(4385).getAddress());
	}

	@Test
	@DisplayName("Record 4386: City is Richmond")
	void CityOfRecord4386() {
		assertEquals("Richmond", customers.get(4385).getCity());
	}

	@Test
	@DisplayName("Record 4386: County is Contra Costa")
	void CountyOfRecord4386() {
		assertEquals("Contra Costa", customers.get(4385).getCounty());
	}

	@Test
	@DisplayName("Record 4386: State is CA")
	void StateOfRecord4386() {
		assertEquals("CA", customers.get(4385).getState());
	}

	@Test
	@DisplayName("Record 4386: ZIP is 94801")
	void ZIPOfRecord4386() {
		assertEquals("94801", customers.get(4385).getZIP());
	}

	@Test
	@DisplayName("Record 4386: Phone is 510-236-7825")
	void PhoneOfRecord4386() {
		assertEquals("510-236-7825", customers.get(4385).getPhone());
	}

	@Test
	@DisplayName("Record 4386: Fax is 510-236-7034")
	void FaxOfRecord4386() {
		assertEquals("510-236-7034", customers.get(4385).getFax());
	}

	@Test
	@DisplayName("Record 4386: Email is hershel@hanners.com")
	void EmailOfRecord4386() {
		assertEquals("hershel@hanners.com", customers.get(4385).getEmail());
	}

	@Test
	@DisplayName("Record 4386: Web is http://www.hershelhanners.com")
	void WebOfRecord4386() {
		assertEquals("http://www.hershelhanners.com", customers.get(4385).getWeb());
	}
}
