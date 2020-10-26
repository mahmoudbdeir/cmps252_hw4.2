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

@Tag("33")
class Record_132 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 132: FirstName is Bret")
	void FirstNameOfRecord132() {
		assertEquals("Bret", customers.get(131).getFirstName());
	}

	@Test
	@DisplayName("Record 132: LastName is Kahae")
	void LastNameOfRecord132() {
		assertEquals("Kahae", customers.get(131).getLastName());
	}

	@Test
	@DisplayName("Record 132: Company is Tandex Electronics")
	void CompanyOfRecord132() {
		assertEquals("Tandex Electronics", customers.get(131).getCompany());
	}

	@Test
	@DisplayName("Record 132: Address is 69 Roff St")
	void AddressOfRecord132() {
		assertEquals("69 Roff St", customers.get(131).getAddress());
	}

	@Test
	@DisplayName("Record 132: City is Staten Island")
	void CityOfRecord132() {
		assertEquals("Staten Island", customers.get(131).getCity());
	}

	@Test
	@DisplayName("Record 132: County is Richmond")
	void CountyOfRecord132() {
		assertEquals("Richmond", customers.get(131).getCounty());
	}

	@Test
	@DisplayName("Record 132: State is NY")
	void StateOfRecord132() {
		assertEquals("NY", customers.get(131).getState());
	}

	@Test
	@DisplayName("Record 132: ZIP is 10304")
	void ZIPOfRecord132() {
		assertEquals("10304", customers.get(131).getZIP());
	}

	@Test
	@DisplayName("Record 132: Phone is 718-448-0919")
	void PhoneOfRecord132() {
		assertEquals("718-448-0919", customers.get(131).getPhone());
	}

	@Test
	@DisplayName("Record 132: Fax is 718-448-8722")
	void FaxOfRecord132() {
		assertEquals("718-448-8722", customers.get(131).getFax());
	}

	@Test
	@DisplayName("Record 132: Email is bret@kahae.com")
	void EmailOfRecord132() {
		assertEquals("bret@kahae.com", customers.get(131).getEmail());
	}

	@Test
	@DisplayName("Record 132: Web is http://www.bretkahae.com")
	void WebOfRecord132() {
		assertEquals("http://www.bretkahae.com", customers.get(131).getWeb());
	}
}
