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

@Tag("6")
class Record_4848 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4848: FirstName is Reed")
	void FirstNameOfRecord4848() {
		assertEquals("Reed", customers.get(4847).getFirstName());
	}

	@Test
	@DisplayName("Record 4848: LastName is Kaanana")
	void LastNameOfRecord4848() {
		assertEquals("Kaanana", customers.get(4847).getLastName());
	}

	@Test
	@DisplayName("Record 4848: Company is Teper, Robert A Esq")
	void CompanyOfRecord4848() {
		assertEquals("Teper, Robert A Esq", customers.get(4847).getCompany());
	}

	@Test
	@DisplayName("Record 4848: Address is 600 Willow Tree Rd")
	void AddressOfRecord4848() {
		assertEquals("600 Willow Tree Rd", customers.get(4847).getAddress());
	}

	@Test
	@DisplayName("Record 4848: City is Leonia")
	void CityOfRecord4848() {
		assertEquals("Leonia", customers.get(4847).getCity());
	}

	@Test
	@DisplayName("Record 4848: County is Bergen")
	void CountyOfRecord4848() {
		assertEquals("Bergen", customers.get(4847).getCounty());
	}

	@Test
	@DisplayName("Record 4848: State is NJ")
	void StateOfRecord4848() {
		assertEquals("NJ", customers.get(4847).getState());
	}

	@Test
	@DisplayName("Record 4848: ZIP is 7605")
	void ZIPOfRecord4848() {
		assertEquals("7605", customers.get(4847).getZIP());
	}

	@Test
	@DisplayName("Record 4848: Phone is 201-592-7152")
	void PhoneOfRecord4848() {
		assertEquals("201-592-7152", customers.get(4847).getPhone());
	}

	@Test
	@DisplayName("Record 4848: Fax is 201-592-6886")
	void FaxOfRecord4848() {
		assertEquals("201-592-6886", customers.get(4847).getFax());
	}

	@Test
	@DisplayName("Record 4848: Email is reed@kaanana.com")
	void EmailOfRecord4848() {
		assertEquals("reed@kaanana.com", customers.get(4847).getEmail());
	}

	@Test
	@DisplayName("Record 4848: Web is http://www.reedkaanana.com")
	void WebOfRecord4848() {
		assertEquals("http://www.reedkaanana.com", customers.get(4847).getWeb());
	}
}
