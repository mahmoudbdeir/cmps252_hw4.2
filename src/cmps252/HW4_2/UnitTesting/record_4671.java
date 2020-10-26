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

@Tag("20")
class Record_4671 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4671: FirstName is yleen")
	void FirstNameOfRecord4671() {
		assertEquals("yleen", customers.get(4670).getFirstName());
	}

	@Test
	@DisplayName("Record 4671: LastName is Brauman")
	void LastNameOfRecord4671() {
		assertEquals("Brauman", customers.get(4670).getLastName());
	}

	@Test
	@DisplayName("Record 4671: Company is Duo Fast Corporation")
	void CompanyOfRecord4671() {
		assertEquals("Duo Fast Corporation", customers.get(4670).getCompany());
	}

	@Test
	@DisplayName("Record 4671: Address is 2914 Pine Ave")
	void AddressOfRecord4671() {
		assertEquals("2914 Pine Ave", customers.get(4670).getAddress());
	}

	@Test
	@DisplayName("Record 4671: City is Niagara Falls")
	void CityOfRecord4671() {
		assertEquals("Niagara Falls", customers.get(4670).getCity());
	}

	@Test
	@DisplayName("Record 4671: County is Niagara")
	void CountyOfRecord4671() {
		assertEquals("Niagara", customers.get(4670).getCounty());
	}

	@Test
	@DisplayName("Record 4671: State is NY")
	void StateOfRecord4671() {
		assertEquals("NY", customers.get(4670).getState());
	}

	@Test
	@DisplayName("Record 4671: ZIP is 14301")
	void ZIPOfRecord4671() {
		assertEquals("14301", customers.get(4670).getZIP());
	}

	@Test
	@DisplayName("Record 4671: Phone is 716-284-1005")
	void PhoneOfRecord4671() {
		assertEquals("716-284-1005", customers.get(4670).getPhone());
	}

	@Test
	@DisplayName("Record 4671: Fax is 716-284-3515")
	void FaxOfRecord4671() {
		assertEquals("716-284-3515", customers.get(4670).getFax());
	}

	@Test
	@DisplayName("Record 4671: Email is yleen@brauman.com")
	void EmailOfRecord4671() {
		assertEquals("yleen@brauman.com", customers.get(4670).getEmail());
	}

	@Test
	@DisplayName("Record 4671: Web is http://www.yleenbrauman.com")
	void WebOfRecord4671() {
		assertEquals("http://www.yleenbrauman.com", customers.get(4670).getWeb());
	}
}
