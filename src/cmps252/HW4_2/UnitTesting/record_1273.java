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

@Tag("0")
class Record_1273 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1273: FirstName is Stanley")
	void FirstNameOfRecord1273() {
		assertEquals("Stanley", customers.get(1272).getFirstName());
	}

	@Test
	@DisplayName("Record 1273: LastName is Mechanic")
	void LastNameOfRecord1273() {
		assertEquals("Mechanic", customers.get(1272).getLastName());
	}

	@Test
	@DisplayName("Record 1273: Company is Mabes Clothing & Athl Apprl")
	void CompanyOfRecord1273() {
		assertEquals("Mabes Clothing & Athl Apprl", customers.get(1272).getCompany());
	}

	@Test
	@DisplayName("Record 1273: Address is 2052 E Vernon Ave")
	void AddressOfRecord1273() {
		assertEquals("2052 E Vernon Ave", customers.get(1272).getAddress());
	}

	@Test
	@DisplayName("Record 1273: City is Los Angeles")
	void CityOfRecord1273() {
		assertEquals("Los Angeles", customers.get(1272).getCity());
	}

	@Test
	@DisplayName("Record 1273: County is Los Angeles")
	void CountyOfRecord1273() {
		assertEquals("Los Angeles", customers.get(1272).getCounty());
	}

	@Test
	@DisplayName("Record 1273: State is CA")
	void StateOfRecord1273() {
		assertEquals("CA", customers.get(1272).getState());
	}

	@Test
	@DisplayName("Record 1273: ZIP is 90058")
	void ZIPOfRecord1273() {
		assertEquals("90058", customers.get(1272).getZIP());
	}

	@Test
	@DisplayName("Record 1273: Phone is 323-234-6158")
	void PhoneOfRecord1273() {
		assertEquals("323-234-6158", customers.get(1272).getPhone());
	}

	@Test
	@DisplayName("Record 1273: Fax is 323-234-3064")
	void FaxOfRecord1273() {
		assertEquals("323-234-3064", customers.get(1272).getFax());
	}

	@Test
	@DisplayName("Record 1273: Email is stanley@mechanic.com")
	void EmailOfRecord1273() {
		assertEquals("stanley@mechanic.com", customers.get(1272).getEmail());
	}

	@Test
	@DisplayName("Record 1273: Web is http://www.stanleymechanic.com")
	void WebOfRecord1273() {
		assertEquals("http://www.stanleymechanic.com", customers.get(1272).getWeb());
	}
}
