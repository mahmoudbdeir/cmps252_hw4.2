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

@Tag("24")
class Record_4735 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4735: FirstName is Lolita")
	void FirstNameOfRecord4735() {
		assertEquals("Lolita", customers.get(4734).getFirstName());
	}

	@Test
	@DisplayName("Record 4735: LastName is Crawley")
	void LastNameOfRecord4735() {
		assertEquals("Crawley", customers.get(4734).getLastName());
	}

	@Test
	@DisplayName("Record 4735: Company is Tekmatex Inc")
	void CompanyOfRecord4735() {
		assertEquals("Tekmatex Inc", customers.get(4734).getCompany());
	}

	@Test
	@DisplayName("Record 4735: Address is 111 S Queen St")
	void AddressOfRecord4735() {
		assertEquals("111 S Queen St", customers.get(4734).getAddress());
	}

	@Test
	@DisplayName("Record 4735: City is Martinsburg")
	void CityOfRecord4735() {
		assertEquals("Martinsburg", customers.get(4734).getCity());
	}

	@Test
	@DisplayName("Record 4735: County is Berkeley")
	void CountyOfRecord4735() {
		assertEquals("Berkeley", customers.get(4734).getCounty());
	}

	@Test
	@DisplayName("Record 4735: State is WV")
	void StateOfRecord4735() {
		assertEquals("WV", customers.get(4734).getState());
	}

	@Test
	@DisplayName("Record 4735: ZIP is 25401")
	void ZIPOfRecord4735() {
		assertEquals("25401", customers.get(4734).getZIP());
	}

	@Test
	@DisplayName("Record 4735: Phone is 304-267-4250")
	void PhoneOfRecord4735() {
		assertEquals("304-267-4250", customers.get(4734).getPhone());
	}

	@Test
	@DisplayName("Record 4735: Fax is 304-267-2379")
	void FaxOfRecord4735() {
		assertEquals("304-267-2379", customers.get(4734).getFax());
	}

	@Test
	@DisplayName("Record 4735: Email is lolita@crawley.com")
	void EmailOfRecord4735() {
		assertEquals("lolita@crawley.com", customers.get(4734).getEmail());
	}

	@Test
	@DisplayName("Record 4735: Web is http://www.lolitacrawley.com")
	void WebOfRecord4735() {
		assertEquals("http://www.lolitacrawley.com", customers.get(4734).getWeb());
	}
}
