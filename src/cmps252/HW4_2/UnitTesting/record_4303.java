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

@Tag("36")
class Record_4303 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4303: FirstName is Nicky")
	void FirstNameOfRecord4303() {
		assertEquals("Nicky", customers.get(4302).getFirstName());
	}

	@Test
	@DisplayName("Record 4303: LastName is Frasso")
	void LastNameOfRecord4303() {
		assertEquals("Frasso", customers.get(4302).getLastName());
	}

	@Test
	@DisplayName("Record 4303: Company is Lawrence, Nancy M Esq")
	void CompanyOfRecord4303() {
		assertEquals("Lawrence, Nancy M Esq", customers.get(4302).getCompany());
	}

	@Test
	@DisplayName("Record 4303: Address is 145 Northern Ave")
	void AddressOfRecord4303() {
		assertEquals("145 Northern Ave", customers.get(4302).getAddress());
	}

	@Test
	@DisplayName("Record 4303: City is Boston")
	void CityOfRecord4303() {
		assertEquals("Boston", customers.get(4302).getCity());
	}

	@Test
	@DisplayName("Record 4303: County is Suffolk")
	void CountyOfRecord4303() {
		assertEquals("Suffolk", customers.get(4302).getCounty());
	}

	@Test
	@DisplayName("Record 4303: State is MA")
	void StateOfRecord4303() {
		assertEquals("MA", customers.get(4302).getState());
	}

	@Test
	@DisplayName("Record 4303: ZIP is 2210")
	void ZIPOfRecord4303() {
		assertEquals("2210", customers.get(4302).getZIP());
	}

	@Test
	@DisplayName("Record 4303: Phone is 617-338-5953")
	void PhoneOfRecord4303() {
		assertEquals("617-338-5953", customers.get(4302).getPhone());
	}

	@Test
	@DisplayName("Record 4303: Fax is 617-338-6513")
	void FaxOfRecord4303() {
		assertEquals("617-338-6513", customers.get(4302).getFax());
	}

	@Test
	@DisplayName("Record 4303: Email is nicky@frasso.com")
	void EmailOfRecord4303() {
		assertEquals("nicky@frasso.com", customers.get(4302).getEmail());
	}

	@Test
	@DisplayName("Record 4303: Web is http://www.nickyfrasso.com")
	void WebOfRecord4303() {
		assertEquals("http://www.nickyfrasso.com", customers.get(4302).getWeb());
	}
}
