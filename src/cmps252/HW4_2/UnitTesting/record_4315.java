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
class Record_4315 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4315: FirstName is Lashawn")
	void FirstNameOfRecord4315() {
		assertEquals("Lashawn", customers.get(4314).getFirstName());
	}

	@Test
	@DisplayName("Record 4315: LastName is Ross")
	void LastNameOfRecord4315() {
		assertEquals("Ross", customers.get(4314).getLastName());
	}

	@Test
	@DisplayName("Record 4315: Company is W J Hynrichs Inc")
	void CompanyOfRecord4315() {
		assertEquals("W J Hynrichs Inc", customers.get(4314).getCompany());
	}

	@Test
	@DisplayName("Record 4315: Address is 120 Wall St")
	void AddressOfRecord4315() {
		assertEquals("120 Wall St", customers.get(4314).getAddress());
	}

	@Test
	@DisplayName("Record 4315: City is New York")
	void CityOfRecord4315() {
		assertEquals("New York", customers.get(4314).getCity());
	}

	@Test
	@DisplayName("Record 4315: County is New York")
	void CountyOfRecord4315() {
		assertEquals("New York", customers.get(4314).getCounty());
	}

	@Test
	@DisplayName("Record 4315: State is NY")
	void StateOfRecord4315() {
		assertEquals("NY", customers.get(4314).getState());
	}

	@Test
	@DisplayName("Record 4315: ZIP is 10005")
	void ZIPOfRecord4315() {
		assertEquals("10005", customers.get(4314).getZIP());
	}

	@Test
	@DisplayName("Record 4315: Phone is 212-968-5770")
	void PhoneOfRecord4315() {
		assertEquals("212-968-5770", customers.get(4314).getPhone());
	}

	@Test
	@DisplayName("Record 4315: Fax is 212-968-4354")
	void FaxOfRecord4315() {
		assertEquals("212-968-4354", customers.get(4314).getFax());
	}

	@Test
	@DisplayName("Record 4315: Email is lashawn@ross.com")
	void EmailOfRecord4315() {
		assertEquals("lashawn@ross.com", customers.get(4314).getEmail());
	}

	@Test
	@DisplayName("Record 4315: Web is http://www.lashawnross.com")
	void WebOfRecord4315() {
		assertEquals("http://www.lashawnross.com", customers.get(4314).getWeb());
	}
}
