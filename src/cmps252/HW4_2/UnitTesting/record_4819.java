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

@Tag("3")
class Record_4819 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4819: FirstName is John")
	void FirstNameOfRecord4819() {
		assertEquals("John", customers.get(4818).getFirstName());
	}

	@Test
	@DisplayName("Record 4819: LastName is Miggins")
	void LastNameOfRecord4819() {
		assertEquals("Miggins", customers.get(4818).getLastName());
	}

	@Test
	@DisplayName("Record 4819: Company is Neff, Vern C Esq")
	void CompanyOfRecord4819() {
		assertEquals("Neff, Vern C Esq", customers.get(4818).getCompany());
	}

	@Test
	@DisplayName("Record 4819: Address is 135 Amboy Ave")
	void AddressOfRecord4819() {
		assertEquals("135 Amboy Ave", customers.get(4818).getAddress());
	}

	@Test
	@DisplayName("Record 4819: City is Woodbridge")
	void CityOfRecord4819() {
		assertEquals("Woodbridge", customers.get(4818).getCity());
	}

	@Test
	@DisplayName("Record 4819: County is Middlesex")
	void CountyOfRecord4819() {
		assertEquals("Middlesex", customers.get(4818).getCounty());
	}

	@Test
	@DisplayName("Record 4819: State is NJ")
	void StateOfRecord4819() {
		assertEquals("NJ", customers.get(4818).getState());
	}

	@Test
	@DisplayName("Record 4819: ZIP is 7095")
	void ZIPOfRecord4819() {
		assertEquals("7095", customers.get(4818).getZIP());
	}

	@Test
	@DisplayName("Record 4819: Phone is 732-750-8175")
	void PhoneOfRecord4819() {
		assertEquals("732-750-8175", customers.get(4818).getPhone());
	}

	@Test
	@DisplayName("Record 4819: Fax is 732-750-6581")
	void FaxOfRecord4819() {
		assertEquals("732-750-6581", customers.get(4818).getFax());
	}

	@Test
	@DisplayName("Record 4819: Email is john@miggins.com")
	void EmailOfRecord4819() {
		assertEquals("john@miggins.com", customers.get(4818).getEmail());
	}

	@Test
	@DisplayName("Record 4819: Web is http://www.johnmiggins.com")
	void WebOfRecord4819() {
		assertEquals("http://www.johnmiggins.com", customers.get(4818).getWeb());
	}
}
