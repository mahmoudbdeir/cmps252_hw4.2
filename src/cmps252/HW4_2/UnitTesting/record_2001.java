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

@Tag("39")
class Record_2001 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2001: FirstName is Lilian")
	void FirstNameOfRecord2001() {
		assertEquals("Lilian", customers.get(2000).getFirstName());
	}

	@Test
	@DisplayName("Record 2001: LastName is Beuchler")
	void LastNameOfRecord2001() {
		assertEquals("Beuchler", customers.get(2000).getLastName());
	}

	@Test
	@DisplayName("Record 2001: Company is Medical Defense Associates")
	void CompanyOfRecord2001() {
		assertEquals("Medical Defense Associates", customers.get(2000).getCompany());
	}

	@Test
	@DisplayName("Record 2001: Address is 711 Davis St")
	void AddressOfRecord2001() {
		assertEquals("711 Davis St", customers.get(2000).getAddress());
	}

	@Test
	@DisplayName("Record 2001: City is Scranton")
	void CityOfRecord2001() {
		assertEquals("Scranton", customers.get(2000).getCity());
	}

	@Test
	@DisplayName("Record 2001: County is Lackawanna")
	void CountyOfRecord2001() {
		assertEquals("Lackawanna", customers.get(2000).getCounty());
	}

	@Test
	@DisplayName("Record 2001: State is PA")
	void StateOfRecord2001() {
		assertEquals("PA", customers.get(2000).getState());
	}

	@Test
	@DisplayName("Record 2001: ZIP is 18505")
	void ZIPOfRecord2001() {
		assertEquals("18505", customers.get(2000).getZIP());
	}

	@Test
	@DisplayName("Record 2001: Phone is 570-343-2815")
	void PhoneOfRecord2001() {
		assertEquals("570-343-2815", customers.get(2000).getPhone());
	}

	@Test
	@DisplayName("Record 2001: Fax is 570-343-8649")
	void FaxOfRecord2001() {
		assertEquals("570-343-8649", customers.get(2000).getFax());
	}

	@Test
	@DisplayName("Record 2001: Email is lilian@beuchler.com")
	void EmailOfRecord2001() {
		assertEquals("lilian@beuchler.com", customers.get(2000).getEmail());
	}

	@Test
	@DisplayName("Record 2001: Web is http://www.lilianbeuchler.com")
	void WebOfRecord2001() {
		assertEquals("http://www.lilianbeuchler.com", customers.get(2000).getWeb());
	}
}
