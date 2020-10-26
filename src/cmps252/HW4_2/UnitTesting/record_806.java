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

@Tag("29")
class Record_806 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 806: FirstName is Janine")
	void FirstNameOfRecord806() {
		assertEquals("Janine", customers.get(805).getFirstName());
	}

	@Test
	@DisplayName("Record 806: LastName is Schornick")
	void LastNameOfRecord806() {
		assertEquals("Schornick", customers.get(805).getLastName());
	}

	@Test
	@DisplayName("Record 806: Company is Burns, Jerry A Esq")
	void CompanyOfRecord806() {
		assertEquals("Burns, Jerry A Esq", customers.get(805).getCompany());
	}

	@Test
	@DisplayName("Record 806: Address is 2800 E 12th St")
	void AddressOfRecord806() {
		assertEquals("2800 E 12th St", customers.get(805).getAddress());
	}

	@Test
	@DisplayName("Record 806: City is Los Angeles")
	void CityOfRecord806() {
		assertEquals("Los Angeles", customers.get(805).getCity());
	}

	@Test
	@DisplayName("Record 806: County is Los Angeles")
	void CountyOfRecord806() {
		assertEquals("Los Angeles", customers.get(805).getCounty());
	}

	@Test
	@DisplayName("Record 806: State is CA")
	void StateOfRecord806() {
		assertEquals("CA", customers.get(805).getState());
	}

	@Test
	@DisplayName("Record 806: ZIP is 90023")
	void ZIPOfRecord806() {
		assertEquals("90023", customers.get(805).getZIP());
	}

	@Test
	@DisplayName("Record 806: Phone is 323-265-5508")
	void PhoneOfRecord806() {
		assertEquals("323-265-5508", customers.get(805).getPhone());
	}

	@Test
	@DisplayName("Record 806: Fax is 323-265-2282")
	void FaxOfRecord806() {
		assertEquals("323-265-2282", customers.get(805).getFax());
	}

	@Test
	@DisplayName("Record 806: Email is janine@schornick.com")
	void EmailOfRecord806() {
		assertEquals("janine@schornick.com", customers.get(805).getEmail());
	}

	@Test
	@DisplayName("Record 806: Web is http://www.janineschornick.com")
	void WebOfRecord806() {
		assertEquals("http://www.janineschornick.com", customers.get(805).getWeb());
	}
}
